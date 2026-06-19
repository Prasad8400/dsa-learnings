😈🔥💣

Let's do **Core Java first**.

# ☕ Collections Framework (Interview Edition)

You already use:

```java
ArrayList
HashMap
HashSet
```

daily in DSA.

Now let's understand when to use each.

---

# 1️⃣ ArrayList

### What is it?

A dynamic array.

```java
ArrayList<String> names = new ArrayList<>();
```

---

### Good At

✅ Fast access by index

```java
names.get(0);
```

Time:

```text
O(1)
```

---

### Bad At

❌ Insert/delete in middle

Because elements shift.

```text
10 20 30 40

Insert 25

10 20 25 30 40
         ↑
     shifting
```

---

### Use When

```text
Need ordered collection
Need frequent reading
```

---

# 2️⃣ LinkedList

### What is it?

Nodes connected by references.

```text
10 → 20 → 30 → 40
```

---

### Good At

✅ Insert/delete near known node

---

### Bad At

❌ Access by index

To get:

```java
list.get(50);
```

must travel node by node.

---

### Use When

```text
Frequent insertions/deletions
```

---

# ArrayList vs LinkedList

| Operation     | ArrayList | LinkedList |
| ------------- | --------- | ---------- |
| get(index)    | ✅ Fast    | ❌ Slow     |
| insert middle | ❌ Slow    | ✅ Better   |
| memory        | ✅ Less    | ❌ More     |

---

# 3️⃣ HashSet

### Purpose

Store unique values.

```java
HashSet<Integer> set = new HashSet<>();
```

---

### Example

```java
set.add(1);
set.add(1);
set.add(2);
```

Result:

```text
[1,2]
```

Duplicate ignored.

---

### DSA Example

Contains Duplicate

```java
if(set.contains(num))
```

😈🔥

---

# 4️⃣ HashMap

### Purpose

Store key-value pairs.

```java
HashMap<String,Integer> map = new HashMap<>();
```

---

### Example

```java
map.put("Prasad", 100);
```

---

Access:

```java
map.get("Prasad");
```

Output:

```text
100
```

---

### DSA Examples

✅ Two Sum

✅ Valid Anagram

✅ Top K Frequent

✅ Subarray Sum Equals K

---

# Interview Question 😈

When would you use:

```java
HashSet
```

instead of

```java
ArrayList
```

Answer:

```text
When uniqueness or fast lookup is required.
```

Example:

```java
set.contains(x)
```

Average:

```text
O(1)
```

while

```java
list.contains(x)
```

is:

```text
O(n)
```

---

# Quick Memory Sheet

```text
ArrayList
=
Dynamic Array

LinkedList
=
Connected Nodes

HashSet
=
Unique Elements

HashMap
=
Key Value Pair
```

😄🔥💣

Now before Selenium Waits, answer this:

### Interview Question

You have:

```java
1,1,2,3,3,4,4
```

and need to quickly check whether a number already exists.

Would you choose:

```java
ArrayList
LinkedList
HashSet
HashMap
```

and why? 😈🔥
