Now we polish it into interview-ready format.

# ✅ Correct Interview Answer

```text
StaleElementReferenceException occurs when Selenium is holding a reference to a WebElement, but that element is no longer attached to the DOM.

It usually happens when the page is refreshed, DOM is updated dynamically, AJAX call happens, or the element is re-rendered.

To handle it, we should not use the old WebElement reference. We should locate the element again and then perform the action.

In my framework, I would use explicit wait and re-locate the element using ExpectedConditions like visibilityOfElementLocated or elementToBeClickable before interacting with it.
```

# 🔥 Important correction

You said:

```text
use explicit wait and wait till element is present or visible
```

That is good, but add this key line:

```text
Re-locate the element again.
```

Because stale means this old object is gone:

```java
WebElement button = driver.findElement(By.id("submit"));
```

After DOM refresh, this `button` reference may become stale. So we should do:

```java
driver.findElement(By.id("submit")).click();
```

again after wait.

# ✅ Code example

```java
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

WebElement button = wait.until(
    ExpectedConditions.elementToBeClickable(By.id("submit"))
);

button.click();
```

Or advanced:

```java
WebElement button = wait.until(
    ExpectedConditions.refreshed(
        ExpectedConditions.elementToBeClickable(By.id("submit"))
    )
);

button.click();
```

# Your final 4-line answer to remember

```text
StaleElementReferenceException occurs when a previously located WebElement is no longer attached to the DOM.

It usually happens due to page refresh, AJAX update, or dynamic DOM re-rendering.

To handle it, we should re-locate the element instead of using the old reference.

In my framework, I use explicit waits and locate the element again before performing actions.
```

This is clean. This is enough. ✅