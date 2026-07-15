# ✅ Interview-ready answer

```text
findElement is used when we want to locate a single web element. It returns WebElement. If the element is not found, it throws NoSuchElementException.

findElements is used when multiple elements can match the locator. It returns List<WebElement>. If no element is found, it does not throw exception; it returns an empty list.

In automation, I use findElement for single fields like username, password, login button. I use findElements for multiple elements like links, product names, table rows, dropdown options, or price lists.
```

# Code example

```java
WebElement loginButton = driver.findElement(By.id("login"));
loginButton.click();
```

```java
List<WebElement> links = driver.findElements(By.tagName("a"));

for (WebElement link : links) {
    System.out.println(link.getText());
}
```

# Key difference table

| Point              | findElement                     | findElements              |
| ------------------ | ------------------------------- | ------------------------- |
| Return type        | `WebElement`                    | `List<WebElement>`        |
| Number of elements | First matching element          | All matching elements     |
| If not found       | Throws `NoSuchElementException` | Returns empty list        |
| Use case           | Login button, username field    | Links, rows, product list |

# Your polished one-liner

```text
findElement is used to locate a single element and returns WebElement, while findElements is used to locate multiple matching elements and returns List<WebElement>.
```

Score: **90/100** ✅
Add return type + exception behavior, and it becomes **100/100**.
