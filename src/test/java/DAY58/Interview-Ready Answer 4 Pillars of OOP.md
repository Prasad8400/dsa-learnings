# ✅ Interview-Ready Answer: 4 Pillars of OOP

```text
OOP has 4 main pillars: Encapsulation, Inheritance, Polymorphism, and Abstraction.

Encapsulation means wrapping data and methods together and restricting direct access using private variables with public getters/setters or methods.

Inheritance means one class can acquire properties and methods of another class using extends. For example, a child class can reuse methods from a parent class.

Polymorphism means one thing can behave in multiple ways. Method overloading is compile-time polymorphism, and method overriding is runtime polymorphism.

Abstraction means hiding internal implementation details and exposing only required functionality. It can be achieved using abstract classes and interfaces.
```

---

# 🔥 Automation Framework Example

```text
In automation framework, POM is an example of encapsulation because locators and page actions are wrapped inside page classes.

Inheritance is used when test classes extend BaseTest or BaseClass to reuse driver setup, teardown, and common utilities.

Polymorphism can be seen when we overload utility methods, for example clickElement(By locator) and clickElement(WebElement element).

Abstraction is used through WebDriver interface, where we write WebDriver driver = new ChromeDriver(), and Selenium hides browser-specific implementation.
```

---

# Very Strong Final Answer

Use this in interview:

```text
OOP has 4 pillars: Encapsulation, Inheritance, Polymorphism, and Abstraction.

In my automation framework, encapsulation is used in Page Object Model, where locators and page actions are kept inside page classes.

Inheritance is used when test classes extend a base class to reuse driver setup and common methods.

Polymorphism is used through method overloading and overriding, like having reusable click or wait methods with different parameters.

Abstraction is used through interfaces like WebDriver, where we interact with browser actions without worrying about internal browser implementation.
```
Main memory line:

```text
Encapsulation = data hiding
Inheritance = reuse parent class
Polymorphism = many forms
Abstraction = hide implementation
```