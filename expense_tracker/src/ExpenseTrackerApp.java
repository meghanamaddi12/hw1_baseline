

import javax.swing.table.DefaultTableModel;

/**
 * The ExpenseTrackerApp class allows users to add/remove daily transactions.
 * It creates the main components and starts the UI.
 *
 * @author Meghana Maddipatla
 */


public class ExpenseTrackerApp {
    /**
     * Default constructor for the ExpenseTrackerApp class.
     * Initializes the application and its components.
     */
    public ExpenseTrackerApp() {
        // Default constructor
    }
     /**
      * The entry point of the application.
      * @param args Command line arguments.
      */

  public static void main(String[] args) {
    
    // Create MVC components
    DefaultTableModel tableModel = new DefaultTableModel();
    tableModel.addColumn("Serial");
    tableModel.addColumn("Amount");
    tableModel.addColumn("Category");
    tableModel.addColumn("Date");
    

    
    ExpenseTrackerView view = new ExpenseTrackerView(tableModel);

    // Initialize view
    view.setVisible(true);

    // Handle add transaction button clicks
    view.getAddTransactionBtn().addActionListener(_ -> {
      
      // Get transaction data from view
      double amount = view.getAmountField(); 
      String category = view.getCategoryField();

      // Create transaction object
      Transaction t = new Transaction(amount, category);

      // Call controller to add transaction
      view.addTransaction(t);
    });

  }

}