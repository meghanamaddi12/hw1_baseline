package expensetracker;

import java.util.Date;

/**
 * Represents a financial transaction in the Expense Tracker.
 * Stores the amount, category, and timestamp of a transaction.
 *
 * @author Meghana Maddipatla
 * @version 1.0
 */
public class Transaction {
    /** The transaction amount. */
    private double amount;

    /** The transaction category. */
    private String category;

    /** The timestamp of the transaction. */
    private Date timestamp;

    /**
     * Constructs a new Transaction with the given amount and category.
     * Sets the timestamp to the current date and time.
     *
     * @param amount   The transaction amount.
     * @param category The transaction category.
     */
    public Transaction(double amount, String category) {
        this.amount = amount;
        this.category = category;
        this.timestamp = new Date();
    }

    /**
     * Retrieves the transaction amount.
     *
     * @return The amount of the transaction.
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Retrieves the transaction category.
     *
     * @return The category of the transaction.
     */
    public String getCategory() {
        return category;
    }

    /**
     * Retrieves the timestamp of the transaction.
     *
     * @return The Date object representing when the transaction was created.
     */
    public Date getTimestamp() {
        return timestamp;
    }
}