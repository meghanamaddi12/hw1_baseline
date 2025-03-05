

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Represents a financial transaction in the Expense Tracker.
 * It stores the amount, category, and timestamp.
 */
public class Transaction {
    /** The amount of the transaction.*/
  private double amount;

    /** The category of the transaction (e.g., food, travel).*/
  private String category;

    /** The timestamp when the transaction was recorded. */
  private String timestamp;

/**
 * Constructs a Transaction with the given amount and category.
 * @param amount The transaction amount.
 * @param category The transaction category.
 */
  public Transaction(double amount, String category) {
    this.amount = amount;
    this.category = category;
    this.timestamp = generateTimestamp();
  }

/**
 * Retrieves the transaction amount.
 * @return The transaction amount.
 */
  public double getAmount() {
    return amount;
  }

/**
 * Sets the transaction amount.
 * @param amount The amount to be set.
 */
  public void setAmount(double amount) {
    this.amount = amount;
  }

/**
 * Retrieves the transaction category.
 * @return The category of the transaction.
 */
  public String getCategory() {
    return category;
  }

/**
 * Sets the transaction category.
 * @param category The category to be set.
 */
  public void setCategory(String category) {
    this.category = category; 
  }
  
/**
 * Retrieves the timestamp of the transaction.
 * @return The timestamp in string format.
 */
  public String getTimestamp() {
    return timestamp;
  }

/**
 * Generates the timestamp for a transaction.
 * @return The generated timestamp as a string.
 */ 
  private String generateTimestamp() {
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm");  
    return sdf.format(new Date());
  }

}