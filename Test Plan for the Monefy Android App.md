Test Coverage for the Monefy Android App

The tests would be grouped into the following suites: 

Installation & Compatibility Testing: Test covers app installation from an app store or other media, installation on every supported operating system version, app upgrade, page orientation, and compatibility with different internet connections

Usability Testing: Ensuring ease of use of the product involving user navigation, page content error checks, page alignments, useful error messages & notifications, etc

Functional Testing: Test cases will be based on product specification to ensure app works as expected from user registration to the end of the product flow
 
Security Testing: Test cases covers scenarios to ensure user authentication and only authorised users are allowed access to resources, as well as user-session management. This also covers cases to ensure sensitive data isn't logged and saved on device, while app only access resources whose permissions have been granted

Memory Leakage Testing: Covers scenarios to ensure app programs aren't holding on to memory after execution to prevent app crashes

Interrupt Testing: Behaviour of the app will be evaluated during interrupts from phone calls, notifications, alarms, screen locks, orientation changes, cable connections etc

Regression Testing: Test cases will cover existing functional tests to ensure product isn't broken after updates and code changes. This test cases are better automated for faster and effective execution

Performance Testing: This will cover behaviour of the application under expected and stress conditions to determine the system's stability as well as what improvements are required to the integrated services


Prioritisation

Test cases can be prioritised based on impact of app features, time and cost constraints. With respect to business impact, test cases that are blockers and critical will be selected and executed as sanity tests to ensure users can use the primary features of the app. 
The tests are:

Installation test

Functional test

Usability test


Below are test suites with test cases to be executed on the Monefy app with respect to business priority:


Suite Name: Installation & Compatibility Testing


Case1: OS compatibility

Steps: Install app on devices running on Android versions 4.0 & up; Launch app

Expected Result: App should be installed and launched successfully



Case2: Installation location compatibility

Step: Install app on phone memory and move into secondary storage

Expected Result: App should be operational. However operating speed may reduce with memory card speed



Case3: App upgrade

Steps: Install a previous app version and login; Go to the store and install a new version

Expected Result: User should see an Update button in the store. After update is completed, logged in user information should be persisted



Case4: Network compatibility

Steps: While using the app, switch between wifi and the following mobile data connections: Edge/2G, 3/3.5G, 4G/LTE

Expected Result: App should still be functional with varying server response times; Poor internet connection warning should be displayed when necessary



Case 5: Page orientation

Steps: While app is launched, switch between landscape and portrait modes

Expected Result: If orientation switch is permitted, orientation should be switched without UI distortions; If orientation switch is not permitted, page orientation should not change


Case6: Uninstall

Steps: Uninstall app while it's running

Expected Result: Verify app is uninstalled and user data is deleted





