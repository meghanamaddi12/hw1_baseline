package expensetracker;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * The ExpenseTrackerView class represents the graphical user interface (GUI) for the Expense Tracker.
 * It provides input fields, buttons, and displays transactions in a table.
 *
 * @author Meghana Maddipatla
 * @version 1.0
 */
public class ExpenseTrackerView extends JFrame {

    /** Table to display transactions. */
    private JTable transactionsTable;

    /** Button for adding transactions. */
    private JButton addTransactionBtn;

    /** Input field for entering transaction amount. */
    private JTextField amountField;

    /** Input field for transaction category. */
    private JTextField categoryField;

    /** Table model for storing transaction data. */
    private DefaultTableModel model;

    /** List to store transactions internally. */
    private List<Transaction> transactions = new ArrayList<>();

    /**
     * Retrieves the transactions table.
     *
     * @return The JTable displaying transactions.
     */
    public JTable getTransactionsTable() {
        return transactionsTable;
    }

    /**
     * Retrieves the entered amount from the input field, parsed as a double.
     * Returns 0 if the field is empty.
     *
     * @return The transaction amount as a double.
     */
    public double getAmountField() {
        if (amountField.getText().isEmpty()) {
            return 0;
        } else {
            double amount = Double.parseDouble(amountField.getText());
            return amount;
        }
    }

    /**
     * Retrieves the raw text entered in the amount field for validation.
     *
     * @return The raw text input as a String.
     */
    public String getAmountFieldText() {
        return amountField.getText();
    }

    /**
     * Sets the amount input field.
     *
     * @param amountField The JTextField for entering the amount.
     */
    public void setAmountField(JTextField amountField) {
        this.amountField = amountField;
    }

    /**
     * Retrieves the entered category from the input field.
     *
     * @return The transaction category as a string.
     */
    public String getCategoryField() {
        return categoryField.getText();
    }

    /**
     * Sets the category input field.
     *
     * @param categoryField The JTextField for entering the category.
     */
    public void setCategoryField(JTextField categoryField) {
        this.categoryField = categoryField;
    }

    /**
     * Retrieves the button for adding transactions.
     *
     * @return The JButton used to add transactions.
     */
    public JButton getAddTransactionBtn() {
        return addTransactionBtn;
    }

    /**
     * Retrieves the table model for transactions.
     *
     * @return The DefaultTableModel storing transaction data.
     */
    public DefaultTableModel getTableModel() {
        return model;
    }

    /**
     * Initializes the ExpenseTrackerView with a default table model.
     *
     * @param model The table model used to store transaction data.
     */
    public ExpenseTrackerView(DefaultTableModel model) {
        setTitle("Expense Tracker");
        setSize(600, 400);
        this.model = model;

        addTransactionBtn = new JButton("Add Transaction");

        JLabel amountLabel = new JLabel("Amount:");
        amountField = new JTextField(10);
        
        JLabel categoryLabel = new JLabel("Category:");
        categoryField = new JTextField(10);
        transactionsTable = new JTable(model);
    
        JPanel inputPanel = new JPanel();
        inputPanel.add(amountLabel);
        inputPanel.add(amountField);
        inputPanel.add(categoryLabel);
        inputPanel.add(categoryField);
        inputPanel.add(addTransactionBtn);
    
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addTransactionBtn);
    
        add(inputPanel, BorderLayout.NORTH);
        add(new JScrollPane(transactionsTable), BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    /**
     * Refreshes the table with new transaction data.
     *
     * @param transactions The updated list of transactions.
     */
    public void refreshTable(List<Transaction> transactions) {
        model.setRowCount(0);
        int rowNum = model.getRowCount();
        double totalCost = 0;
        for (Transaction t : transactions) {
            totalCost += t.getAmount();
        }
    
        for (Transaction t : transactions) {
            model.addRow(new Object[]{rowNum += 1, t.getAmount(), t.getCategory(), t.getTimestamp()});
        }
        Object[] totalRow = {"Total", null, null, totalCost};
        model.addRow(totalRow);
    
        transactionsTable.updateUI();
    }

    /**
     * Refreshes the transaction table by updating it with the current transactions.
     */
    public void refresh() {
        List<Transaction> transactions = getTransactions();
        refreshTable(transactions);
    }

    /**
     * Retrieves the list of transactions stored in the tracker.
     *
     * @return A list of transactions.
     */
    public List<Transaction> getTransactions() {
        return transactions;
    }

    /**
     * Adds a transaction to the table and updates the UI.
     *
     * @param t The transaction to be added.
     */
    public void addTransaction(Transaction t) {
        transactions.add(t);
        getTableModel().addRow(new Object[]{t.getAmount(), t.getCategory(), t.getTimestamp()});
        refresh();
    }
}