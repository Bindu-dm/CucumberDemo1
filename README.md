📘 CucumberDemo1 – Selenium BDD Framework
📌 Overview

This project is a BDD automation framework built using Java, Selenium WebDriver, and Cucumber (JUnit).

It automates the login functionality of:
🔗 OrangeHRM

🧰 Tech Stack
Java
Selenium WebDriver
Cucumber (BDD)
JUnit
Maven
📂 Structure
src/test/java
 ├── stepsDefinitions
 ├── testRunner
features
 └── login.feature
pom.xml
Scenario: Successful Login
Given user is on login page  
When user enters valid credentials  
And clicks login  
Then Dashboard should be displayed  
Scenario: Successful Login
Given user is on login page  
When user enters valid credentials  
And clicks login  
Then Dashboard should be displayed  
▶️ Run Tests
mvn clean test
🚀 Highlights
BDD with Gherkin
Parameterized steps
Simple & scalable design
