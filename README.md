📘 CucumberDemo1 – Selenium BDD Automation Framework
📌 Project Overview

This project is a BDD Automation Framework built using Java, Selenium WebDriver, and Cucumber (JUnit).

It demonstrates a solid foundation of BDD automation, which is widely used in real-world testing environments.

The project automates the login functionality of:
🔗 OrangeHRM

The framework uses Gherkin syntax to make test cases readable and easy to understand.

🧰 Tech Stack
Language: Java
Automation Tool: Selenium WebDriver
BDD Framework: Cucumber
Test Runner: JUnit
Build Tool: Maven
📂 Project Structure
CucumberDemo1
│── src/test/java
│   ├── stepsDefinitions
│   │     └── Steps.java          # Step definitions
│   │
│   ├── testRunner
│   │     └── TestRun.java        # Cucumber runner class
│
│── features
│   └── login.feature            # Feature file (BDD scenarios)
│
│── pom.xml                      # Maven dependencies
🧪 Test Scenario
Feature: User Login
Feature: User Login

  Scenario: Successful Login
    Given the user is on the OrangeHRM login page
    When the user enters valid credentials (username: "Admin", password: "admin123")
    And the user clicks on the Login button
    Then the user should be redirected to the Dashboard page
    And the user should see the Dashboard text
⚙️ Implementation Details
🔹 Step Definitions
Launches Chrome browser
Navigates to login page
Enters credentials dynamically using parameters
Performs login action
Validates Dashboard using assertions
🔧 Key Selenium Actions Used
findElement(By.name())
findElement(By.xpath())
sendKeys()
click()
isDisplayed()
▶️ Test Execution
Run using Maven
mvn clean test

OR

Right-click pom.xml → Run as → Maven Test
⚙️ Cucumber Runner Configuration
@RunWith(Cucumber.class)
@CucumberOptions(
    features = { ".//features/login.feature" },
    glue = "stepsDefinitions",
    monochrome = true,
    plugin = {"pretty"}
)
📦 Dependencies (pom.xml)
Selenium Java – UI Automation
Cucumber Java – BDD Step Definitions
Cucumber JUnit – Test Runner
📊 Assertions Used
Assert.assertTrue(status);

Used to verify:

Dashboard page is displayed
Login was successful
🚀 Key Highlights
✔️ Parameterized step definitions
✔️ Real-time web application automation
✔️ Clean and simple BDD implementation
✔️ Maven-based project structure
✔️ Easy to extend for more test cases
👩‍💻 Author

Bindu DM
Software Test Engineer
