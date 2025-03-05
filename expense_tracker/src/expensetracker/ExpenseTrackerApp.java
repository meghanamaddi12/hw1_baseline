package expensetracker;

import javax.swing.table.DefaultTableModel;

/**
 * The ExpenseTrackerApp class allows users to add and manage daily transactions.
 * It serves as the main entry point, creating and coordinating the Model-View-Controller components.
 *
 * @author Meghana Maddipatla
 * @version 1.0
 */
public class ExpenseTrackerApp {
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

        // Make the GUI visible
        view.setVisible(true);

        // Handle add transaction button clicks
        view.getAddTransactionBtn().addActionListener(_ -> {
            // Retrieve raw input text and parse directly (no validation)
            double amount = Double.parseDouble(view.getAmountFieldText());
            String category = view.getCategoryField();

            // Create and add the transaction
            Transaction t = new Transaction(amount, category);
            view.addTransaction(t);
        });
    }
}