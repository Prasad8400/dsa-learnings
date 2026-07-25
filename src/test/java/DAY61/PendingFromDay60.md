LESSSGOOO 😈🔥
**23 July — Day 61**

First we’ll complete the **pending Day 60 parts**, then start today’s fresh plan.

# ✅ Pending From Last Session

```text
1. API Basics — REST Assured Path Params vs Query Params
2. Spoken Technical Answer — TestNG/framework topic
3. DSA Fun Puzzle Round
```

After this, today’s plan:

```text
1. Java coding interview problem
2. Selenium real-time coding
3. Framework/TestNG/API spoken drill
4. DSA fun puzzle
```

---

# 🔥 Pending Part 1 — API Basics

## Path Params vs Query Params

### ✅ Path Parameter

Path param is part of the URL path and is used to identify a specific resource.

Example:

```text
/users/{id}
```

REST Assured:

```java
given()
    .pathParam("id", 101)
.when()
    .get("/users/{id}")
.then()
    .statusCode(200);
```

Final URL becomes:

```text
/users/101
```

Use case:

```text
Get user by ID
Get order by order ID
Get employee by employee ID
```

---

### ✅ Query Parameter

Query param is passed after `?` in URL and is mostly used for filtering, searching, sorting, or pagination.

Example:

```text
/users?role=admin&page=2
```

REST Assured:

```java
given()
    .queryParam("role", "admin")
    .queryParam("page", 2)
.when()
    .get("/users")
.then()
    .statusCode(200);
```

Use case:

```text
Filter users by role
Search products by name
Pagination
Sorting
```

---

## 🎯 Interview Answer

```text
Path parameter is used to identify a specific resource and it is part of the URL path, like /users/{id}.

Query parameter is used to filter or search data and it comes after question mark in the URL, like /users?role=admin.

In REST Assured, we use pathParam() for path parameters and queryParam() for query parameters.
```

Memory line:

```text
Path param = specific resource
Query param = filter/search/sort
```

---

# 🔥 Pending Part 2 — Spoken Technical Answer

## TestNG Framework Topic

Question:

**How do you use TestNG in your automation framework?**

### ✅ Interview Answer

```text
In my automation framework, TestNG is used for organizing and executing test cases.

We use annotations like @BeforeMethod for setup activities, @Test for test methods, and @AfterMethod for cleanup activities like screenshot capture on failure or closing browser.

We also use TestNG features like priority, groups, dependsOnMethods, assertions, listeners, and parallel execution.

TestNG XML is used to run specific suites like smoke, regression, or module-wise test cases.

It helps in managing test execution, reporting, grouping, and controlling test flow.
```

### Short version

```text
TestNG is used in my framework for test execution and test management. We use annotations, assertions, groups, priorities, listeners, and XML suite files to control execution. It helps us run smoke, regression, and module-wise automation suites in a structured way.
```

---

# 🔥 Pending Part 3 — DSA Fun Puzzle

## LeetCode 3151 — Special Array I Revision

Suggested file name:

```java
SpecialArrayI3151Revision.java
```

Given an array `nums`, return `true` if every adjacent pair has different parity.

Parity means:

```text
even / odd
```

Example:

```java
nums = {2, 1, 4}
```

Output:

```text
true
```

Example:

```java
nums = {4, 3, 1, 6}
```

Output:

```text
false
```

Because `3` and `1` are both odd.

Logic memory:

```java
nums[i - 1] % 2 == nums[i] % 2
```

means same parity, so not special.

Attack this one first, then we’ll start today’s fresh plan 😈🔥
