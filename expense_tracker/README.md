# hw1 - Manual Review
#Expense Tracker Application

##Overview
The homework will be based on this project named "Expense Tracker", where users will be able to add and remove daily transactions while keeping track of expenses in various categories. It provides a simple graphical user interface (GUI) to input and view financial transactions.


##Features:
1. Add transactions.
2. Categorize transactions (e.g., food, travel, bills, etc.).
3. View the added transaction.

##How to Build and Test (from Terminal)
1. Ensure that Apache Ant is installed. Run 'ant' in the root directory, which contains the 'build.xml' build file.
2. Run '''ant document''' to generate the jdoc folder. In that folder, open the index.htmt file to view API documentation.
3. Run '''ant complie''' to generate the class files. Compiled classes will be in the bin directory.
4. Run '''ant test''' to compile all unit tests and run them.

## How to Run ( from Terminal)
After building the project (i.e running 'ant'), run: '''java -cp bin ExpenseTrackerApp'''
To view the API documentation, open: '''jdoc/index.html'''
This will ensure the users know where to find the generated Javadoc documentation

## How to clean up (from Terminal):
Run ```ant clean``` to clean the project (i.e., delete all generated files).

## Code Modification

Create a file named '''InputValidation.java'''  to validate the '''amount''' and '''category''' fields of this app. Some hints are as follows:
1. The '''amount''' should be greater than 0 and less than 1000. 
2. It should be a valid number. 
3. The '''category''' should be a valid string input from the following list: "food", "travel", "bills", "entertainment", "other" .
4. You should display error messages on the GUI and not accept the invalid input.Throw an appropriate exception. 
5. Update the ExpenseTrackerApp.java with the input validation steps for adding a transaction.

Note: Ensure all newly added Java files include Javadoc comments.

## Manual Review
## Examples of satisfying non-functional requirements:
1. Understandability
- External documentation (such as a README file) improves progam understanding. This README file helps users and developers by providing build instructions.
- Javadoc documentation is now available for all major classes and methods.

2. Modularity

- The application follows the MVC architecture by separating concerns:
	- Model: Manages transaction data.
	- View: Handles UI display and user input
	- Controller: Manages user interactions and updates the model. 

## Understandibility
To improve project documentation and clarity:
1. Javadoc Generation
	- API documentation is generated using Javadoc.
	- After running '''ant document''', open jdoc/index.html to view.
2. Git log & Incremental Commits
	- Ensure that Git commit messages describe each change meaningfully.
	- Example:
	  '''
	  git commit -m "Added input validation for transactions"
	  git commit -m "Implemented Javadoc comments for ExpenseTrackerview.java
	  '''
	-  Submit a gitlog.txt or git folder to show commit history.

For the understandability section, we will be inspecting your git log. You should include either the .git folder or else a gitLog.(pdf | txt).
