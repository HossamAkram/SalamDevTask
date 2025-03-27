# Web Automation Task for SalamDev Website

## Overview
Test Automation for the **SalamDev Website** using **Selenium with Java**, based on **Maven** and **TestNG**.

- Implements **Fluent Page Object Model (POM)** for structuring test scripts.
- Automates a basic user flow including **navigation and interactions**.
- Manages **test data using external files** for flexibility.
- Generates **detailed test reports with logs and screenshots**.
- Supports **local execution** and can be extended for **remote execution in cloud environments**.

---
## Features

### **Structure of "main" Folder**
- Implements **Page Object Model (POM)** with reusable page components.
- Uses **locators and actions** to interact with web elements efficiently.

### **Structure of "test" Folder**
- Includes **Base Test Class** to manage test setup and teardown.
- Uses **annotations** for configuring browser sessions.
- Ensures tests start from a **clean state** by resetting the session per test.

### **Assertions**
- **Hard assertions** ensure critical checkpoints are met before proceeding.
- **Soft assertions** allow validations within the test without stopping execution.

### **Reporting**
- Generates **detailed test reports** with steps and screenshots.
- Captures **failure details** including screenshots and logs.

### **Configurations**
- Reads **global variables and settings** from a properties file.
- Supports **different execution types** (local, cloud – future support).
- Allows configuring **browser types** (Chrome, Firefox, Edge).

### **Test Data Management**
- Uses **external JSON files** to store test data.
- Supports **static data storage** (messages, page titles, credentials).
- Allows **updating test data dynamically** for future test runs.

---
## Prerequisites
- Install **Java (JDK 11+ recommended)**.
- Install an **IDE** such as **IntelliJ IDEA** or **Eclipse**.
- Install **Maven** (if not bundled with your IDE).
- Ensure necessary **WebDriver binaries** are available (**ChromeDriver, GeckoDriver, etc.**).

---
## Running the Tests Using an IDE
### **Web Tests (Selenium)**
1. Open the project in your **IDE**.
2. Navigate to `src/test/java/org/salamdev/tests/`.
3. Open the test class you want to execute.
4. Right-click inside the class and select **Run 'ClassName'**.

---
# Mobile Website Automation Task

## Overview
Test Automation for the **SwagLabs mobile website** using **Appium with Java**, based on **Maven and TestNG**.

- Automates **login functionality**.
- Uses **Appium’s UIAutomator2** for interacting with mobile web elements.
- Implements **scroll actions** where necessary.
- Supports testing on **real devices and emulators**.

---
## Mobile Web Automation Steps
1. Launch the browser on a **mobile device**.
2. Navigate to **SwagLabs login page**.
3. Enter **credentials** and perform login.
4. Validate **successful login**.

---
## Prerequisites
- Install **Java (JDK 11+ recommended)**.
- Install **Appium Server**.
- Install required dependencies (**Appium Java Client, WebDriverManager**).
- Ensure **Appium Inspector** is available for identifying elements.
- Connect a **real device** or set up an **emulator**.

---
## Running the Mobile Web Tests
1. Open the project in your **IDE**.
2. Navigate to `src/test/java/org/swaglabs/tests/`.
3. Open the test class for **mobile web automation**.
4. Right-click inside the class and select **Run 'ClassName'**.

---
