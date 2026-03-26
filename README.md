# 📘 CucumberDemo1 – Selenium BDD Framework

## 📌 Overview
This project is a **BDD automation framework** built using **Java, Selenium WebDriver, and Cucumber (JUnit)**.

It automates the login functionality of the OrangeHRM application and demonstrates a solid foundation of real-world test automation.

---

## 🧰 Tech Stack
- Java  
- Selenium WebDriver  
- Cucumber (BDD)  
- JUnit  
- Maven  

---

## 📂 Project Structure

CucumberDemo1
│── src/test/java
│ ├── stepsDefinitions
│ │ └── Steps.java
│ │
│ ├── testRunner
│ │ └── TestRun.java
│
│── features
│ └── login.feature
│
│── pom.xml


---

## 🧪 Test Scenario
```gherkin
Scenario: Successful Login
  Given user is on login page  
  When user enters valid credentials  
  And clicks login  
  Then Dashboard should be displayed  
▶️ Run Tests
mvn clean test
🚀 Highlights
BDD with Gherkin
Parameterized step definitions
Simple & scalable design
👩‍💻 Author

Bindu DM
