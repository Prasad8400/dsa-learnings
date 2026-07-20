```text
In POM, we don’t keep only XPaths.
We keep locators/WebElements + page-specific reusable methods/actions.
```

# ✅ Interview-ready answer: Page Object Model

```text
Page Object Model is a design pattern used in Selenium automation.

In POM, we create separate page classes for each application page, and inside those classes we keep locators/WebElements and reusable methods for actions on that page.

It helps improve code maintainability because if any locator changes, we need to update it only in one page class instead of changing it in multiple test cases.

In my framework, we use a hybrid approach with BDD Cucumber and Page Object Model, where feature files contain scenarios, step definitions call page methods, and page classes handle UI actions.

For example, for a Login page, we keep username field, password field, login button locator, and a login method inside the LoginPage class.
```

# 🔥 Short version to remember

```text
POM is a Selenium design pattern where each page has its own page class.

We keep locators and reusable page actions inside that class.

It helps maintainability because locator changes are handled at one place.

In my framework, feature files call step definitions, and step definitions call POM methods.

Example: LoginPage contains username, password, login button, and login method.
```

# Example code

```java
public class LoginPage {

    WebDriver driver;

    By username = By.id("username");
    By password = By.id("password");
    By loginButton = By.id("login");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String user, String pass) {
        driver.findElement(username).sendKeys(user);
        driver.findElement(password).sendKeys(pass);
        driver.findElement(loginButton).click();
    }
}
```

# Score

```text
Raw answer: 75/100 ✅
After polish: 100/100 ✅
```

Main upgrade line:

```text
POM = locators + reusable actions, not only XPaths.
```
