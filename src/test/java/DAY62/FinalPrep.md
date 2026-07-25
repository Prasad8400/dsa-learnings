# HSBC SDET Interview Revision Sheet

## Java Coding Questions

### 1. Duplicate Strings With Count

**Question**

Print duplicate strings with their count.

```java
String[] arr = {"java","selenium","java","api","selenium","java"};
```

**Approach**

* Use `HashMap<String, Integer>`
* Store word as key
* Store frequency as value
* Print entries where count > 1

**Explanation**

> I used HashMap to store each string as key and its frequency as value. Then I iterated over the map entries and printed only those whose count is greater than one.

---

## 2. First Non-Repeating Character

**Question**

```java
String s = "swiss";
```

Output

```
w
```

**Approach**

* Count frequency using HashMap
* Traverse original string again
* Print first character having count = 1

**Explanation**

> I first stored the frequency of each character in HashMap. Then I traversed the original string again so the original order is preserved and printed the first character whose count is one.

---

## 3. Reverse Each Word

**Question**

```java
java selenium api
```

Output

```
avaj muineles ipa
```

**Approach**

* Split string
* Reverse every word using `StringBuilder.reverse()`
* Join them back

**Explanation**

> I split the sentence into individual words, reversed every word using StringBuilder, and appended them back while maintaining the original word order.

---

## 4. Two Sum

```java
nums = {2,7,11,15}
target = 9
```

Output

```
0 1
```

**Approach**

* HashMap<Number, Index>
* remainder = target - current
* If remainder exists → answer found

**Explanation**

> I stored each number as key and its index as value. For every element, I calculated the required number and checked whether it already exists in the map.

---

## 5. Valid Parentheses

```
{[()]}
```

Output

```
true
```

**Approach**

* Stack
* Push opening brackets
* Match closing brackets
* Stack should be empty at end

**Explanation**

> I used Stack to store opening brackets. Whenever a closing bracket appeared, I verified whether the top element matches. Any mismatch or remaining elements in stack makes the expression invalid.

---

## 6. Remove Duplicate Characters

```
automation
```

Output

```
automin
```

**Approach**

* HashSet
* StringBuilder
* Append only first occurrence

**Explanation**

> HashSet helps me identify whether a character has already been seen. I append only unseen characters to StringBuilder.

---

## 7. Count Vowels & Consonants

```
automation testing
```

**Approach**

* Remove spaces
* Convert to lowercase
* Count vowels
* Remaining letters are consonants

---

# Selenium Questions

## findElement vs findElements

**findElement**

* Returns single WebElement
* Throws NoSuchElementException if not found

**findElements**

* Returns List<WebElement>
* Returns empty list if nothing found

---

## StaleElementReferenceException

**Occurs when**

DOM refreshes and previously located element becomes detached.

**Handling**

* Locate element again
* Use Explicit Wait
* Avoid storing stale references

---

## Broken Links

**Approach**

* Get all `<a>` tags
* Fetch href using `getAttribute("href")`
* Always check

```java
href != null && !href.trim().isEmpty()
```

---

## Checkbox Handling

**Approach**

* findElements()
* Loop through checkboxes
* Check

```java
checkbox.isSelected()
```

* Click only unchecked ones

---

## Dropdown Sorted Verification

**Approach**

* Select class
* getOptions()
* Store original list
* Copy list
* Sort copied list
* Compare both lists

---

## Print All Links

**Approach**

```java
driver.findElements(By.tagName("a"))
```

Print only displayed and non-empty text.

---

# Selenium Framework

## Page Object Model (POM)

**Definition**

POM is a design pattern used in Selenium where page elements and page actions are maintained in separate classes.

**Advantages**

* Easy maintenance
* Reusable code
* Better readability
* Locator changes happen at one place

---

# OOP

## Four Pillars

### Encapsulation

Wrapping data and methods together using private variables and getters/setters.

---

### Inheritance

One class acquires properties and methods from another class.

---

### Polymorphism

Method Overloading

Method Overriding

---

### Abstraction

Showing only essential functionality while hiding implementation details using abstract class or interface.

---

# Collections Revision

## HashMap

* Key → Value
* Fast lookup
* Frequency problems

---

## HashSet

* Unique elements only
* Duplicate detection

---

## ArrayList

* Ordered
* Index based
* Fast retrieval

---

## Stack

* LIFO
* Parentheses problems

---

# TestNG

## Priority

Controls execution order.

---

## dependsOnMethods

One test executes only after another test succeeds.

---

## Common Annotations

```java
@BeforeSuite
@BeforeClass
@BeforeMethod
@Test
@AfterMethod
@AfterClass
@AfterSuite
```

---

# REST Assured

## Path Parameter

Used for identifying a specific resource.

Example

```
/users/{id}
```

```java
.pathParam("id",101)
```

---

## Query Parameter

Used for filtering/searching.

Example

```
/users?role=admin
```

```java
.queryParam("role","admin")
```

---

# HR Questions

## Tell me about yourself

Hi, my name is Prasad Sutar.

I have around 4 years of experience in QA automation, primarily working with Java, Selenium WebDriver, TestNG, Cucumber, Maven, and REST Assured.

Currently I work at Persistent Systems on IBM Security Verify Governance, where I automate end-to-end workflows across modules like Authorization, Certification Manager, Analytics Dashboard, Console, Access Request Center, and Role Review Workflows.

I also use REST APIs for test data setup and focus on framework maintenance, automation development, regression execution, failure analysis, and defect reporting.

Now I am looking for a role where I can contribute as an SDET and continue growing in automation, API testing, and framework design.

---

## Explain Your Current Project

Currently I work on IBM Security Verify Governance, an Identity Governance product used for managing users, roles, access requests, approvals, and certifications.

We use Java, Selenium, Cucumber, TestNG, Maven, and Page Object Model for UI automation.

REST APIs are used for test data setup.

My responsibilities include automation development, maintenance, regression execution, failure analysis, framework improvements, and defect reporting.

---

## Why are you changing your job?

I joined Persistent as my first organization and over the last four years I've learned a lot technically and professionally.

Now I'm looking for new challenges, larger engineering teams, stronger automation practices, and opportunities to work on different products while continuing to grow as an SDET.

---

## Why should we hire you?

I have strong hands-on experience in Java Selenium automation, framework development, API testing, debugging automation failures, and maintaining large regression suites.

Along with technical skills, I enjoy learning continuously, take ownership of automation tasks, and focus on writing maintainable and reliable automation solutions.

---

# Quick Memory Lines

```
HashMap → Frequency
HashSet → Duplicate detection
Stack → Parentheses
ArrayList → Ordered collection
findElement → Single element
findElements → List
Path Param → Resource
Query Param → Filter
POM → Maintainability
TestNG Priority → Order
dependsOnMethods → Dependency
```
