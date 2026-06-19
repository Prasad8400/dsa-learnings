# SOLID Principles for Automation Frameworks

## S - Single Responsibility Principle (SRP)

### Definition

A class should have only one reason to change.

### Interview One-Liner

One class should have one responsibility.

### Bad Example

```java
class LoginPage {

    void login() {}

    void logout() {}

    void writeLogs() {}

    void sendEmail() {}
}
```

LoginPage is handling:

* Login
* Logging
* Email

Too many responsibilities.

### Good Example

```java
class LoginPage {
    void login() {}
    void logout() {}
}

class LoggerUtil {
    void writeLogs() {}
}

class EmailUtil {
    void sendEmail() {}
}
```

### Framework Example

```text
pages/
 └── LoginPage.java

tests/
 └── LoginTest.java

utils/
 └── DriverFactory.java
```

Each class has one responsibility.

### Memory Trick

One Class = One Job

---

## O - Open Closed Principle (OCP)

### Definition

Software entities should be open for extension but closed for modification.

### Interview One-Liner

Add new functionality without modifying existing code.

### Bad Example

```java
class BrowserLauncher {

    void launch(String browser) {

        if(browser.equals("chrome")) {
            System.out.println("Chrome");
        }
        else if(browser.equals("firefox")) {
            System.out.println("Firefox");
        }
    }
}
```

Every new browser requires modifying existing code.

### Good Example

```java
interface Browser {
    void launch();
}
```

```java
class ChromeBrowser implements Browser {

    public void launch() {
        System.out.println("Chrome");
    }
}
```

```java
class FirefoxBrowser implements Browser {

    public void launch() {
        System.out.println("Firefox");
    }
}
```

Tomorrow add Edge?

```java
class EdgeBrowser implements Browser {
    public void launch() {
        System.out.println("Edge");
    }
}
```

No old code changed.

### Memory Trick

Extend, Don't Modify

---

## L - Liskov Substitution Principle (LSP)

### Definition

Child classes should be able to replace parent classes without breaking the program.

### Interview One-Liner

A child should not surprise its parent.

### Bad Example

```java
class Bird {

    void fly() {
        System.out.println("Flying");
    }
}

class Penguin extends Bird {

    @Override
    void fly() {
        throw new RuntimeException();
    }
}
```

Penguin cannot safely replace Bird.

LSP violated.

### Good Example

```java
interface Flyable {
    void fly();
}
```

```java
class Bird {

    void eat() {
        System.out.println("Eating");
    }
}
```

```java
class Duck extends Bird implements Flyable {

    public void fly() {
        System.out.println("Flying");
    }
}
```

```java
class Penguin extends Bird {

    void swim() {
        System.out.println("Swimming");
    }
}
```

Duck is Flyable.

Penguin is not Flyable.

Correct design.

### Framework Example

```java
interface Browser {
    void launch();
    void quit();
}
```

```java
class ChromeBrowser implements Browser
```

```java
class FirefoxBrowser implements Browser
```

Both can safely replace Browser.

### Memory Trick

Child Should Not Surprise Parent

---

## I - Interface Segregation Principle (ISP)

### Definition

Clients should not be forced to depend on methods they do not use.

### Interview One-Liner

Large interfaces should be split into smaller interfaces.

### Bad Example

```java
interface WebActions {

    void click();

    void type();

    void uploadFile();

    void takeScreenshot();
}
```

Every class must implement everything.

### Good Example

```java
interface Clickable {
    void click();
}
```

```java
interface Typeable {
    void type();
}
```

```java
interface Uploadable {
    void uploadFile();
}
```

LoginPage:

```java
class LoginPage implements Clickable, Typeable
```

UploadPage:

```java
class UploadPage implements Clickable, Uploadable
```

Only implements required methods.

### Memory Trick

One Interface = One Purpose

---

## D - Dependency Inversion Principle (DIP)

### Definition

High-level modules should not depend on low-level modules.
Both should depend on abstractions.

### Interview One-Liner

Depend on interfaces, not implementations.

### Bad Example

```java
class LoginTest {

    ChromeBrowser browser =
        new ChromeBrowser();
}
```

Direct dependency on Chrome.

### Good Example

```java
interface Browser {

    void launch();

    void quit();
}
```

```java
class ChromeBrowser implements Browser
```

```java
class FirefoxBrowser implements Browser
```

```java
Browser browser =
    new ChromeBrowser();
```

Tomorrow:

```java
Browser browser =
    new FirefoxBrowser();
```

Test code remains unchanged.

### Framework Example

DriverFactory returns Browser interface instead of concrete browser classes.

### Memory Trick

Depend On Interface, Not Implementation

---

# Quick Interview Revision

SRP = One Class = One Responsibility

OCP = Extend, Don't Modify

LSP = Child Should Not Surprise Parent

ISP = One Interface = One Purpose

DIP = Depend On Interface, Not Implementation
