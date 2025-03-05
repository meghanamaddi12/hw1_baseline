# hw1

# Expense Tracker Application

## Overview
The Expense Tracker is a simple desktop application that helps users log, view, and filter daily transactions. It follows the Model-View-Controller (MVC) architecture, ensuring the code is organized, maintainable, and scalable.

## Features
- Add Transactions – Enter an amount and category, then save the transaction.
- View Transactions – See a structured table of past transactions.
- Modular Design – The app is split into three key components:
  - Model: `Transaction.java` (stores transaction data).
  - View: `ExpenseTrackerView.java` (displays the UI).
  - Controller:`ExpenseTrackerApp.java` (handles interactions).
-Javadoc Documentation – Generated API docs for better understanding (`jdoc/` folder).

## How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/expense_tracker.git
   cd expense_tracker
   ```
2. Compile the project:
   ```bash
   javac -d bin src/expenseTracker/*.java
   ```
3. Run the application:
   ```bash
   java -cp bin expenseTracker.ExpenseTrackerApp
   ```
## Compile Project
javac -d bin src/expenseTracker/*.java

## Run the application:
java -cp bin expenseTracker.ExpenseTrackerApp

## Folder Structure
```
hw1baseline/
├── src/expenseTracker/     # Source code files
│   ├── ExpenseTrackerApp.java  # Controller
│   ├── ExpenseTrackerView.java # View (UI)
│   ├── Transaction.java        # Model (Data)
│   └── InputValidation.java    # (if implemented)
├── jdoc/                 # Generated Javadoc documentation
├── test/                 # Unit test files (if any)
├── build.xml             # Build automation (Ant)
└── README.md             # This file
```

## Development Insights
- Modularity: The application follows MVC, making it easier to extend or modify.
- Readability: The code uses meaningful variable names, indentation, and comments for clarity.
- Scalability & Performance: The app is structured to handle increasing transactions efficiently.

## Version Control & Contributions
- This project is managed with Git and includes incremental commits for tracking changes.
- Contributions & feature requests are welcome! Feel free to fork the repo and submit a pull request.

This Expense Tracker serves as Homework 1 (HW1 Baseline) for CS 520 – Architecture & Design, demonstrating key software engineering principles like modularity, input validation, and performance optimization.

For more details, check the Javadoc in the `jdoc/` folder or contact meghanamaddi@umass.edu
