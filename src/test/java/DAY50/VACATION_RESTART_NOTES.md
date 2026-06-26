# Vacation Restart Notes

## Vacation Break

I am on vacation from **27 June to 2 July**.

Restart date: **3 July**

Goal after vacation: Restart slowly, revise core patterns, and avoid jumping into new heavy topics immediately.

---

# What I Learned Before Vacation

## Binary Search

Problems completed:

* LeetCode 704 — Binary Search
* LeetCode 35 — Search Insert Position

Core pattern:

```java
int start = 0;
int end = nums.length - 1;

while (start <= end) {
    int mid = start + (end - start) / 2;

    if (nums[mid] == target) {
        return mid;
    } else if (nums[mid] < target) {
        start = mid + 1;
    } else {
        end = mid - 1;
    }
}

return -1;
```

Important memory points:

* Binary Search works on sorted arrays.
* `start <= end` because when both are same, one element is still left to check.
* Use `start = mid + 1` when target is bigger.
* Use `end = mid - 1` when target is smaller.
* In Search Insert Position, return `start` if target is not found.

---

# Two Pointer / N-Sum Patterns

## Pair Sum in Sorted Array

Pattern:

```text
sort + left/right pointers
```

Memory line:

```text
sum small → left++
sum big   → right--
sum match → store pair, move both
```

---

## 3Sum

Problem completed:

* LeetCode 15 — 3Sum

Memory line:

```text
3Sum = sort + fix i + two pointer
```

Pattern:

```java
Arrays.sort(nums);

for (int i = 0; i < nums.length - 2; i++) {
    if (i > 0 && nums[i] == nums[i - 1]) {
        continue;
    }

    int start = i + 1;
    int end = nums.length - 1;

    while (start < end) {
        int sum = nums[i] + nums[start] + nums[end];

        if (sum == 0) {
            // add triplet
            start++;
            end--;

            while (start < end && nums[start] == nums[start - 1]) {
                start++;
            }

            while (start < end && nums[end] == nums[end + 1]) {
                end--;
            }
        } else if (sum < 0) {
            start++;
        } else {
            end--;
        }
    }
}
```

---

## 4Sum

Problem completed:

* LeetCode 18 — 4Sum

Memory line:

```text
4Sum = sort + fix i + fix j + two pointer
```

Important:

```java
long sum = (long) nums[i] + nums[j] + nums[start] + nums[end];
```

Use `long` to avoid integer overflow.

Duplicate skipping:

```java
if (i > 0 && nums[i] == nums[i - 1]) continue;

if (j > i + 1 && nums[j] == nums[j - 1]) continue;
```

---

# Two Pointer Counting Trick

Problem completed:

* LeetCode 2824 — Count Pairs Whose Sum is Less than Target

Important line:

```java
count += end - start;
```

Meaning:

```text
If nums[start] + nums[end] is valid,
then nums[start] with every element from start + 1 to end is also valid.
```

Because the array is sorted.

---

# Queue / Deque Status

Completed:

* Queue basics
* Deque basics
* Crawler Log Folder using depth
* Crawler Log Folder using Deque

Important note:

```java
Deque<Integer> dq = new ArrayDeque<>();
```

Prefer `ArrayDeque` for stack/queue/deque style operations.

Advanced Deque pending:

```text
Monotonic Deque
LeetCode 239 — Sliding Window Maximum
```

Do not start this immediately after vacation. Revise basics first.

---

# First Day Back Plan — 3 July

## Step 1: Light Restart

Do not start a new topic immediately.

## Step 2: Retention Problems

Solve these from memory:

1. `BinarySearch704FromMemory.java`
2. `SearchInsertPosition35FromMemory.java`
3. `CountPairsWhoseSumIsLessThanTarget2824FromMemory.java`
4. `ThreeSum15FromMemory.java`
5. `FourSum18FromMemory.java`

## Step 3: If retention is good

Continue with:

```text
Binary Search variations
```

Possible next problems:

* LeetCode 278 — First Bad Version
* LeetCode 69 — Sqrt(x)
* LeetCode 744 — Find Smallest Letter Greater Than Target

## Step 4: Fun Puzzle Round

Do 2 easy problems only.

---

# Rules After Vacation

```text
No panic.
No guilt.
No “I forgot everything” drama.
Restart with retention.
One pattern at a time.
```

Memory line:

```text
DSA is not memorization. It is pattern recall through repetition.
```
