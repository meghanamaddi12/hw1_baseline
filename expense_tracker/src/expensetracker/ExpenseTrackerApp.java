package expensetracker;

import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

/**
 * The ExpenseTrackerApp class allows users to add and manage daily transactions.
 * It serves as the main entry point, creating and coordinating the Model-View-Controller components.
 *
 * @author Meghana Maddipatla
 * @version 1.0
 */
public class ExpenseTrackerApp {
    private List<Transaction> transactions = new ArrayList<>();
    private ExpenseTrackerView view;

    /**
     * Constructs an ExpenseTrackerApp with the given view.
     *
     * @param view The ExpenseTrackerView instance to coordinate with.
     */
    public ExpenseTrackerApp(ExpenseTrackerView view) {
        this.view = view;
    }

    /**
     * The entry point of the application.
     * Initializes the GUI components and sets up event handling for adding transactions.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        // Create the table model for storing transaction data
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("Serial");
        tableModel.addColumn("Amount");
        tableModel.addColumn("Category");
        tableModel.addColumn("Date");

        // Initialize the view with the table model
        ExpenseTrackerView view = new ExpenseTrackerView(tableModel);
        ExpenseTrackerApp app = new ExpenseTrackerApp(view);

        // Make the GUI visible
        view.setVisible(true);

        // Handle add transaction button clicks
        view.getAddTransactionBtn().addActionListener(_ -> {
            // Retrieve raw input text for validation
            String amountStr = view.getAmountFieldText();
            String category = view.getCategoryField();

            // Collect all validation errors
            List<String> errors = new ArrayList<>();

            // Validate the amount input
            if (!InputValidation.isValidAmount(amountStr)) {
                errors.add("Amount must be a number between 0 and 1000.");
            }

            // Validate the category input
            if (!InputValidation.isValidCategory(category)) {
                errors.add("Category must be one of: food, travel, bills, entertainment, other.");
            }

            // If there are any errors, display them all in a single message
            if (!errors.isEmpty()) {
                String errorMessage = String.join("\n", errors);
                JOptionPane.showMessageDialog(null, errorMessage);
                return;
            }

            // Parse the validated amount and create a transaction
            double amount = Double.parseDouble(amountStr);
            Transaction t = new Transaction(amount, category);

            // Add the transaction to the list and update the view
            app.addTransaction(t);
        });
    }

    /**
     * Adds a transaction to the list and updates the view.
     *
     * @param t The transaction to be added.
     */
    public void addTransaction(Transaction t) {
        transactions.add(t);
        view.refreshTable(transactions);
    }
}