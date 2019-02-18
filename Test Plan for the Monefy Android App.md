TASK ONE

TEST COVERAGE FOR THE MONEFY ANDROID APP

The tests would be grouped into the following suites: 

* Installation & Compatibility Testing: Test covers app installation from an app store or other media, installation on every supported operating system version, app upgrade, page orientation, and compatibility with different internet connections

* Usability Testing: Ensuring ease of use of the product involving user navigation, page content error checks, page alignments, useful error messages & notifications, etc

* Functional Testing: Test cases will be based on product specification to ensure app works as expected from user registration to the end of the product flow
 
* Security Testing: Test cases covers scenarios to ensure user authentication and only authorised users are allowed access to resources, as well as user-session management. This also covers cases to ensure sensitive data isn't logged and saved on device, while app only access resources whose permissions have been granted

* Memory Leakage Testing: Covers scenarios to ensure app programs aren't holding on to memory after execution to prevent app crashes

* Interrupt Testing: Behaviour of the app will be evaluated during interrupts from phone calls, notifications, alarms, screen locks, orientation changes, cable connections etc

* Regression Testing: Test cases will cover existing functional tests to ensure product isn't broken after updates and code changes. This test cases are better automated for faster and effective execution

* Performance Testing: This will cover behaviour of the application under expected and stress conditions to determine the system's stability as well as what improvements are required to the integrated services


PRIORITISATION

Test cases can be prioritised based on impact of app features, time and cost constraints. With respect to business impact, test cases that are blockers and critical will be selected and executed as sanity tests to ensure users can use the primary features of the app. 
The tests are:

* Installation test

* Functional test

* Usability test


Below are test suites with test cases to be executed on the Monefy app with respect to business priority:


SUITE NAME: INSTALLATION & COMPATIBILITY TESTING


Case 1: OS compatibility

Steps: Install app on devices running on Android versions 4.0 & up; Launch app

Expected Result: App should be installed and launched successfully



Case 2: Installation location compatibility

Step: Install app on phone memory and move into secondary storage

Expected Result: App should be operational. However operating speed may reduce with memory card speed



Case 3: App upgrade

Steps: Install a previous app version and login; Go to the store and install a new version

Expected Result: User should see an Update button in the store. After update is completed, logged in user information should be persisted



Case 4: Network compatibility

Steps: While using the app, switch between wifi and the following mobile data connections: Edge/2G, 3/3.5G, 4G/LTE

Expected Result: App should still be functional with varying server response times; 
Poor internet connection warning should be displayed when necessary



Case 5: Page orientation

Steps: While app is launched, switch between landscape and portrait modes

Expected Result: If orientation switch is permitted, orientation should be switched without UI distortions; 
If orientation switch is not permitted, page orientation should not change


Case 6: Uninstall

Steps: Uninstall app while it's running

Expected Result: Verify app is uninstalled and user data is deleted



SUITE NAME: USABILITY TESTING


Case 1: App onboarding

Step: Launch app for the first time or clear app data

Expected Result: A series of onboarding messages should be displayed; 
Verify that these messages are referring to corresponding buttons on the screen


Case 2: App flow 

Steps: Use page buttons and back buttons

Expected Result: Verify user is taken to page that corresponds to button being clicked; 
Verify that user is taken to previous page if back button was clicked


Case 3: Spelling and grammatical error

Steps: Use an inspection tool to copy page text into a word document and look for typos and grammatical error

Expected Result: Verify that text have correct spellings and are meaningful with respect to page content;
Verify there are no abrupt text truncation


Case 4: Fonts, spaces and alignment

Step: Inspect text fonts and alignment

Expected Result: Verify fonts are uniformed and fit specification;
Verify headers, message bodies and footers are horizontally and vertically aligned and spaced as expected


Case 5: Error message

Steps: Click disabled buttons, make invalid actions, enter incorrect values

Expected Result: Verify meaningful error message are returned;
Error message should include what is wrong and how to correct the issue; 
Error message colour should be different from other texts


Case 6: Buttons

Step: Inspect page action buttons

Expected Result: All buttons should follow a uniformed theme; 
Submit buttons should be easily distinguishable from Cancel buttons


Case 7: Menu button

Step: Navigate through different sections of the app

Expected ResultVerify that the app menu is always visible, or it is replaced with a back button


Case 8: Disabled fields

Expected Result: Verify that disabled fields will be greyed out


Case 9: Confirmation message

Expected Result: Verify that a confirmation message is always displayed for every update or delete operation


Case 10: Page scrolling

Expected Result: Verify that a scroll bar will be visible while user scrolls through a page


Case 11: Form errors

Step: Enter some invalid fields and leave some fields blank

Expected Result: Verify that error messages will be displayed for each affected field; 
Verify that information filled are persisted when form is submitted


Case 12: Page titles

Steps: Navigate through different pages in the app 

Expected Result: Verify that a corresponding page title is always displayed



SUITE NAME: FUNCTIONAL TESTING

Case 1: App Installation & launch

Steps: Install and launch app

Expected Result: Verify that app is launched successfully and user is shown a dashboard of account balance


Case 2: App menu

Step: Click the app menu at the top left corner of the screen

Expected Result: Verify that menu drawer slides out with a "All Account" drop-down and period filters


Case 3: Account type

Step: From the app menu, select Cash or Payment Card account

Expected Result: Verify that user is taken to the dashboard with summary of transactions in selected account type


Case 4: Filter dashboard

Steps: From the app menu, click a period button

Expected Result: Verify that selected period is displayed at the top the dashboard; 
Verify that only transactions within the selected period are displayed


Case 5: Choose filter date

Steps: From the app menu, click the Choose date button

Expected Result: Verify that calendar is displayed to select a date


Case 6: Expense information 

Steps: From the dashboard, tap and hold an icon

Expected Result: Verify that the corresponding expense information is displayed the in the center donut


Case 7: Add expense

Step: Click an expense icon

Expected Result: Verify that user is taken to corresponding expense page


Case 8: Compute expense

Steps: Enter a note; 
Enter expense amount; 
Use an arithmetic operator and enter another amount

Expected Result: Verify that expense amount is computed correctly


Case 9: Submit expense

Step: After expense has been entered, click the 'ADD ...' button

Expected Result: Verify that user is taken back to dashboard; 
Verify that total expense and balance amount are re-computed


Case 10: Display income page

Step: Click the Income button

Expected Result: Verify that the Income screen is displayed


Case 11: Compute income

Steps: Enter a note; 
Enter income amount; 
Use an arithmetic operator and enter another amount

Expected Result: Verify that income amount is computed correctly


Case 12: Income category

Step: Click the Choose Category and select a category

Expected Result: Verify that user is taken back to dashboard; 
Verify that total income and balance amount are re-computed


Case 13: Account Summary

Step: Click the Balance button

Expected Result: Verify that a summary of each expense and income is listed with amount; 
Verify that the number of items in each income & expense is displayed


Case 14: Account detail

Step: Click a category from the account summary list

Expected Result: Verify that all items in a selected category is listed


Case 15: Item detail

Step: Click an item listed under a category

Expected Result: Verify that the details of selected item is displayed


Case 16: Delete item

Step: From an item detail page, click the Delete icon at the top right corner of the page

Expected Result: Verify that record is deleted and toast message is displayed


Case 17: New transfer

Step: Click the transfer button 

Expected Result: Verify that user is taken to the New Transfer screen


Case 18: Make transfer

Step: Enter transfer amount and click Add Transfer button

Expected Result: Verify a transfer success toast message is displayed


Case 19: App right menu

Step: Click the menu button at the top left corner of the screen

Expected Result: Verify that the app menu is slided out


Case 20: Categories

Step: From the right menu, select the Categories option

Expected Result: A list of Expenses and Income categories are displayed


Case 21: Category detail

Step: Select a category from the list of categories

Expected Result: Verify that selected category page is displayed with clickable icons


Case 22: Edit category

Steps: From the category detail, tap the category title and edit; 
Tap the enter key in the keyboard

Expected Result: Verify that updated category name is saved


Case 23: Delete category

Step: From the category detail, tap the bin icon

Expected Result: Verify that deleted category is no longer in category list


Case 24: Add category

Step: Click the + button in the Expenses or Income category header

Expected Result: Verify that user is taken to a page to upgrade to Monefy Pro


Case 25: Account Type

Step: From the app right menu, click an account type

Expected Result: Verify that details of the account type are displayed with the currency, initial balance & date


Case 26: Include account type in balance

Step: Toggle the switch to "Include in the balance"

Expected Result: Verify the when switch is enabled, 


Case 27: Account type icon

Step: Select another icon for account type and return to menu

Expected Result: Verify that selected icon for account type is updated


Case 28: Disable account type

Steps: Click the menu button from the account type detail page; 
Uncheck the 'Enabled' box; 
Return to the accounts list

Expected Result: Verify that the disabled account type is greyed out


Case 29: Enable account type

Steps: Click the menu button from the account type detail page; 
Check the 'Enabled' box; 
Return to the accounts list

Expected Result: Verify that the enabled account is no longer greyed out 


Case 30: Add account type

Step: From the accounts list, click the Add button

Expected Result: Verify that user is taken to the New Account page


Case 31: Save new account

Steps: Enter new account details, select an image and click ADD

Expected Result: Verify that new account has been added to the accounts list




**Challenges faced during testing

Some of the usability issues experienced while testing the Monefy Android app are:

When user clicks the back button while selecting income category, income amount is lost.

Some buttons appear behind the keyboard, so user will always have to close the keyboard before a page can be submitted.

No confirmation is shown when user deletes account record or category type - this is required in order to prevent user from mistakenly making a delete action.

User is unable to add transfer notes unless back button is clicked to dismiss the keyboard.







