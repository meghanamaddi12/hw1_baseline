package expensetracker;

/**
 * Provides static methods to validate input data for the Expense Tracker.
 * Ensures that transaction amounts and categories meet specific criteria.
 *
 * @author Meghana Maddipatla
 * @version 1.0
 */
public class InputValidation {
    /**
     * Validates if the given string represents a valid transaction amount.
     * The amount must be a number greater than 0 and less than 1000.
     *
     * @param amountStr The string representation of the amount to validate.
     * @return true if the amount is valid, false otherwise.
     */
    public static boolean isValidAmount(String amountStr) {
        try {
            double amount = Double.parseDouble(amountStr);
            return amount > 0 && amount < 1000;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    /**
     * Validates if the given string represents a valid transaction category.
     * The category must be one of: "food", "travel", "bills", "entertainment", or "other" (case-insensitive).
     *
     * @param category The string representing the category to validate.
     * @return true if the category is valid, false otherwise.
     */
    public static boolean isValidCategory(String category) {
        String[] validCategories = {"food", "travel", "bills", "entertainment", "other"};
        for (String valid : validCategories) {
            if (valid.equalsIgnoreCase(category)) return true;
        }
        return false;
    }
}