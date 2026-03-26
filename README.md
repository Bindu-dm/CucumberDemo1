#  CucumberDemo1 – Selenium BDD Framework

##  Overview

This project is a **BDD automation framework** built using **Java, Selenium WebDriver, and Cucumber (JUnit)**.

It automates the login functionality of the OrangeHRM application and demonstrates a solid foundation of real-world test automation.

---

##  Tech Stack

* Java
* Selenium WebDriver
* Cucumber (BDD)
* JUnit
* Maven

---

## Project Structure

```
CucumberDemo1
│── src/test/java
│   ├── stepsDefinitions
│   │     └── Steps.java
│   │
│   ├── testRunner
│   │     └── TestRun.java
│
│── features
│   └── login.feature
│
│── pom.xml
```

---

##  Test Scenario

```gherkin
Scenario: Successful Login
  Given user is on login page  
  When user enters valid credentials  
  And clicks login  
  Then Dashboard should be displayed  
```

---

##  Run Tests 

### 1️ Using Maven (Terminal)

```bash
mvn clean test
```

---

### 2️ Using Eclipse / IDE

* Right click on `pom.xml`
* Click **Run As → Maven Test**

---

### 3️ Using run.bat (One-Click Execution)

Create a file named **run.bat** in your project and add and save:

```bat
cd C:\Users\Bindu DM\eclipse-workspace\CucumberDemo1
mvn clean test
```

 Double-click `run.bat` to execute tests automatically.

---


##  Highlights

 Real-time web application automation
 
 Clean and simple BDD implementation
 
 Maven-based project structure
 
 Easy to extend for more test cases
 
 Simple & scalable design
 
---

##  Author

Bindu DM
