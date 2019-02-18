TEST COVERAGE FOR THE MONEFY ANDROID APP

The tests would be grouped into the following suites: 

Installation & Compatibility Testing: Test covers app installation from an app store or other media, installation on every supported operating system version, app upgrade, page orientation, and compatibility with different internet connections

Usability Testing: Ensuring ease of use of the product involving user navigation, page content error checks, page alignments, useful error messages & notifications, etc

Functional Testing: Test cases will be based on product specification to ensure app works as expected from user registration to the end of the product flow
 
Security Testing: Test cases covers scenarios to ensure user authentication and only authorised users are allowed access to resources, as well as user-session management. This also covers cases to ensure sensitive data isn't logged and saved on device, while app only access resources whose permissions have been granted

Memory Leakage Testing: Covers scenarios to ensure app programs aren't holding on to memory after execution to prevent app crashes

Interrupt Testing: Behaviour of the app will be evaluated during interrupts from phone calls, notifications, alarms, screen locks, orientation changes, cable connections etc

Regression Testing: Test cases will cover existing functional tests to ensure product isn't broken after updates and code changes. This test cases are better automated for faster and effective execution

Performance Testing: This will cover behaviour of the application under expected and stress conditions to determine the system's stability as well as what improvements are required to the integrated services


PRIORITISATION

Test cases can be prioritised based on impact of app features, time and cost constraints. With respect to business impact, test cases that are blockers and critical will be selected and executed as sanity tests to ensure users can use the primary features of the app. 
The tests are:

Installation test

Functional test

Usability test


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









