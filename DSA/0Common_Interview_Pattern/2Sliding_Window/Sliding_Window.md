🔥 NOW MOVING TO NEXT PATTERN

# 🪟 PATTERN 2: SLIDING WINDOW

This is EXTREMELY important.

## ✅ 1. What is Sliding Window?

A technique to maintain a range (window) over array/string.

- Instead of recalculating every subarray:
- We adjust window dynamically.

### or
Instead of generating all subarrays (O(n²)),
we maintain a window range [left, right] and update it dynamically.

It is actually a special case of Two Pointers, where both pointers move forward.

------

## ✅ 2. When to Use?

If question contains:

- ✔ Subarray
- ✔ Substring
- ✔ Longest
- ✔ Smallest/shortest
- ✔ Maximum sum
- ✔ At most K
- ✔ Exactly K
- Without repeating

→ Immediately think Sliding Window (90% chance).

---------------

## ✅ 3. Types of Sliding Window
- 1️⃣ Fixed Size Window

Example:

Max sum of subarray size k

- 2️⃣ Variable Size Window

Example:

Longest substring without repeating characters

--------------

## ✅ 4. General Algorithm (Variable Window)

- Initialize left = 0

- Expand right pointer

- If window invalid → shrink from left

- Update result

---------------------


We’ll do Sliding Window COMPLETELY:

- Fixed Size Window (10 solved)

- Variable Size Window (10 solved)

- How to identify

- Dry runs

- Time & Space complexity

- Interview traps

This is one of the MOST IMPORTANT patterns for FAANG & product companies.