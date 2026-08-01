# QA Selenium Portfolio

A test automation framework built with **Selenium WebDriver**, **Java**, and **TestNG**, following the **Page Object Model (POM)** design pattern. Built to demonstrate practical automation testing skills for QA Engineer roles.

## Tech Stack
- **Language:** Java 25
- **Automation Tool:** Selenium WebDriver 4.46.0
- **Test Framework:** TestNG 7.10.2
- **Build Tool:** Maven
- **Design Pattern:** Page Object Model (POM)

## Test Coverage

| Feature | Test Type | What's Verified |
|---|---|---|
| Login | Positive | Valid credentials log in successfully |
| Login | Negative | Invalid credentials show the correct error message |
| Dropdown | Positive | Selecting an option correctly updates the selected value |
| Checkboxes | Positive | Toggling a checkbox correctly changes its selected state |

All tests run against [the-internet.herokuapp.com](https://the-internet.herokuapp.com), a public site built for practicing automation testing.

## Key Practices Demonstrated
- **Page Object Model** — locators and page actions are fully separated from test/assertion logic, so UI changes only require updates in one place
- **Explicit Waits** — used instead of hard-coded `Thread.sleep()`, to reliably handle dynamic page content without flaky failures
- **Positive and negative testing** — covers both expected success and expected failure scenarios, not just happy-path cases
- **Reusable setup/teardown** — TestNG's `@BeforeMethod`/`@AfterMethod` annotations handle browser lifecycle automatically for every test

## How to Run

1. Clone the repository
2. Open the project in IntelliJ IDEA (or any Maven-compatible IDE)
3. Let Maven resolve dependencies automatically
4. Right-click any test class inside `src/test/java/tests/` → **Run**

## About

Built as part of a hands-on QA Engineer career transition, alongside API testing (Postman/Newman) and database testing (SQL) work.

## Project Structure

src/test/java/
├── pages/ # Page Object classes — locators + page actions
│ ├── LoginPage.java
│ ├── DropdownPage.java
│ └── CheckboxPage.java
└── tests/ # Test classes — test logic + assertions
├── LoginTest.java
├── DropdownTest.java
└── CheckboxTest.java