### ROBOTIUM FIRST APPROACH
##### *SUMMARY:*
The following repository intends to provide a base for UI android tests designed through Robotium framework.

##### *PRECONDITIONS:*
- Android Studio
- Android Emulator API Level 27

##### *FIRST STEPS:*
1. Clone this repository through ` git clone ` command
2. Review the tests under the **RobotiumTextExample** name located on the following path in the **project** view ` app\src\androidTest\java\com\example\myapplication\RobotiumTextExample.java ` 

##### *RUNNER CONFIGURATION:*
1. Open Run menu | Edit Configurations
2. Add a new Android Instrumented Tests configuration
3. Choose the ` app ` module
4. Connect a device or start an emulator
5. Run the newly created configuration
6. The application will be started on the device/emulator and a series of actions will be performed automatically.

##### *REPORTS:*

In order to review the reports run the following command on the terminal.
- UNIX: ` ./gradlew connectedAndroidTest `
- WINDOWS: ` .\gradlew connectedAndroidTest `

Navigate to the ` app\build\reports ` folder and open the **index.html** file on a browser to review the results.