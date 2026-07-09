# ✅ Selenium Waits — Interview Prep

## 1️⃣ `Thread.sleep()`

```java
Thread.sleep(5000);
```

Meaning:

```text
Stop execution for fixed 5 seconds.
```

Problem:

```text
Even if element appears in 1 second, it still waits 5 seconds.
If element appears after 6 seconds, test still fails.
```

So in interviews:

```text
Thread.sleep is hard wait and not recommended in automation except for temporary debugging.
```

---

## 2️⃣ Implicit Wait

```java
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
```

Meaning:

```text
Driver will wait up to 10 seconds while finding elements.
```

Applies to:

```java
driver.findElement()
driver.findElements()
```

Interview answer:

```text
Implicit wait is a global wait applied to all findElement calls.
```

---

## 3️⃣ Explicit Wait

```java
WebDriverWait wait = new WebDriverWait(driver, 10);

WebElement loginButton = wait.until(
    ExpectedConditions.elementToBeClickable(By.id("login"))
);

loginButton.click();
```

Meaning:

```text
Wait until a specific condition is true.
```

Examples:

```text
elementToBeClickable
visibilityOfElementLocated
presenceOfElementLocated
alertIsPresent
frameToBeAvailableAndSwitchToIt
```

Interview answer:

```text
Explicit wait is condition-based wait. It waits only until the expected condition is satisfied.
```

---

## 4️⃣ Fluent Wait

```java
Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
    .withTimeout(Duration.ofSeconds(30))
    .pollingEvery(Duration.ofSeconds(2))
    .ignoring(NoSuchElementException.class);

WebElement element = wait.until(driver -> 
    driver.findElement(By.id("login"))
);
```

Meaning:

```text
Wait maximum 30 seconds.
Check every 2 seconds.
Ignore selected exceptions.
```

Interview answer:

```text
Fluent wait is an advanced explicit wait where we can customize timeout, polling interval, and ignored exceptions.
```

---

# 🎯 Best Interview Answer

Say this:

```text
Thread.sleep is a fixed wait and it stops execution for a fixed time, so it is not recommended.

Implicit wait is a global wait applied to all findElement calls.

Explicit wait is condition-based wait and is preferred because it waits only until a specific condition is met, like element visibility or clickability.

Fluent wait is an advanced form of explicit wait where we can define polling interval and ignored exceptions.

In my automation framework, I prefer explicit waits because they make tests more stable and reduce unnecessary waiting.
```

# Very important money line 😈

```text
I avoid Thread.sleep and prefer explicit wait for dynamic web elements.
```