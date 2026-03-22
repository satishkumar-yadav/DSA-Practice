
# 🔥 PATTERN 1: TWO POINTERS

## ✅ 1. WHAT IS TWO POINTERS PATTERN?

It uses two indices (pointers) to traverse data (usually array or string).

Pointers may:
- Move toward each other
- Move in same direction
- One fast, one slow

## ✅ 2. WHEN TO USE TWO POINTERS?

Use when:
- ✔ Array/String is sorted
- ✔ Need pair/triplet with condition
- ✔ Remove duplicates
- ✔ Reverse array
- ✔ Compare elements from both ends
- ✔ Partition type problems

## ✅ 3. HOW TO IDENTIFY IN INTERVIEW?

Ask yourself:
- Is input sorted?
- Do I need pair/triplet?
- Can I avoid nested loops?
- Is there symmetry (start & end comparison)?

If YES → Think Two Pointers.

## ✅ 4. GENERAL ALGORITHM (Sorted Array Pair Sum Example)
#### Problem: Find if pair exists with sum = target
#### Simple Algorithm

1. Start left = 0
2. Start right = n - 1
3. While left < right:
    - If arr[left] + arr[right] == target → found
    - If sum < target → move left++
    - If sum > target → move right--

Why?
Because sorted array allows directional elimination.

## ⏱ Time & Space

- Time: O(n)
- Space: O(1)

