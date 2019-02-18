# olukunle-oduwobi
SQE Home Challenge

What is this repository for?

This repository has the GnuCash2 project folder, which contains the test scripts, test object, jar files and framework needed for carrying out smoke tests on the GnuCash app. The project is a maven project written in Java, while the test cases and suites are managed by the TestNG framework. Appium and Selenium tools are used to execute the tests on a connected device or emulator. 
Reports are generated for each test suite execution, and are available in the test-output folder within the project

How do I get set up?

* Operating System: Mac OS, Windows
* Application Requirements: Eclipse IDE, Appium server, TestNG framework
* Dependencies: JDK 1.8+, Android Studio, Maven, Selenium Java client v2.53, Appium Java Client, Log4j,Commons-Collection 4, apache maven 3.3.9

Configuration Steps

* Set the following environment variables: JAVA_HOME JDK path, ANDROID_HOME SDK path
* Add /SDK/tools path to System Path variable
* Add /SDK/platform-tools path to System Path variable
* Create an Android Virtual Device, in this case: OS version 8.1 API level 27
* Launch Eclipse IDE 
* Install TestNG plugin in Eclipse
* Install Maven plugin in Eclipse
* Import the GnuCash2 maven project
* Create a M2_HOME environment variable with Maven directory path
* Add the Maven bin path to System Path variable
* Ensure all jar files in jar folder are referenced in project

TEST SUITE EXECUTION
* Ensure log4j.properties, pom.xml & SmokeTests.xml files are in project root directory
* Ensure all dependencies are in pom.xml file
* Ensure a "screenshots" folder exists in the test-output directory
* Start the Appium server on port 4723
* Connect an Android 8.1 device or emulator to your host computer. If another Android device is used, the OS version needs to be specified in the SmokeTest.xml file
* Run the SmokeTests.xml file as a TestNG Suite in Eclipse, 
or execute as maven build in Terminal from the project directory
* After execution is complete, view reports and screenshot in test-output folder. You can also view the saved logs in the log folder
