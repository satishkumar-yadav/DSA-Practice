
# 🎯 INTERVIEW QUESTIONS (Solved Conceptually)

1. Why does two pointer reduce complexity?

2. When can it NOT be used?

3. Difference between sliding window and two pointer?

4. Why sorted array helps?

5. How to avoid duplicates in 3Sum?

-----------------------

# 🔥 TWO POINTERS – IMPORTANT INTERVIEW QUESTIONS (DETAILED ANSWERS)

## ❓1. Why does Two Pointer reduce time complexity?
### ✅ Normal Approach

If finding pair/triplet:
- Brute force → nested loops
- Time = O(n²) or O(n³)

### ✅ Two Pointer Approach

- We eliminate unnecessary checks using ordering logic.
- Example: Pair Sum in Sorted Array
1. Brute force:
```
for i
   for j
```
Time = O(n²)

2. Two Pointer:
```
left=0
right=n-1
while left<right
```
Time = O(n)

-------

### 💡 WHY does it work?

Because sorted property allows:

- If sum < target → all elements left of right are smaller → so increase left
- If sum > target → decrease right
- We eliminate one full side every iteration.

- So instead of checking all combinations, we systematically shrink search space.

-------

### 🎯 Interview Ready Answer:

Two pointer reduces complexity because it leverages sorted order or structural symmetry to eliminate half of the search space in each step, converting nested loop problems from O(n²) to O(n).

------------------------------------------------------------

## ❓2. When can Two Pointers NOT be used?
Two pointer does NOT work when:

- ❌ Data is unsorted and no ordering property
- ❌ Need random access comparisons
- ❌ No monotonic behavior
- ❌ Problem requires global memory (like longest substring without repetition → sliding window instead)

------

### Example Where It Fails:

- Find pair sum in unsorted array.

- Two pointer directly won't work because moving left or right has no meaning.

- Instead → use HashMap (O(n)).

------------

### Interview Answer:

Two pointer requires either sorted data, symmetry, or monotonic property. Without that, pointer movement does not logically reduce search space.

-----------------------------------

## ❓3. Difference Between Two Pointer and Sliding Window?

This is VERY important interview question.
```
| Two Pointer                | Sliding Window                  |
| -------------------------- | ------------------------------- |
| General technique          | Specific type of two pointer    |
| Can move independently     | Usually move in same direction  |
| Often used in sorted array | Often used in subarray problems |
| Focus: pair/triplet        | Focus: subarray/substring       |

```

------------

### Example
1. Two Pointer:
    - Pair sum
    - Reverse array
    - 3Sum

2. Sliding Window:
    - Longest substring without repeat
    - Max sum subarray of size k
    - Smallest window containing characters

-----

### Interview Answer:

Sliding window is a special case of two pointers where both pointers move in one direction to maintain a valid window range.

---------------------

## ❓4. Why is sorted array important in Two Pointer?

Because sorted array provides:

Monotonic property:

- If arr[left] + arr[right] < target →
- All elements before left are smaller → so increase left.

Without sorting → you cannot eliminate safely.

------------------

### Example

1. Sorted: [1,2,3,10]
If 1 + 10 < target → increasing left increases sum.

2. Unsorted: [10,1,3,2]
Movement gives no guarantee.

-----------------

### Interview Answer:

Sorting ensures monotonic growth or reduction of values, which makes pointer movement meaningful and guarantees correctness.


-------------------------

## ❓5. How to Avoid Duplicates in 3Sum?

This is VERY commonly asked.

- Problem:
[-1,0,1,2,-1,-4]

- After sorting:
[-4,-1,-1,0,1,2]

We must skip duplicate numbers.

### Correct Approach
```
for (int i = 0; i < nums.length - 2; i++) {

    if (i > 0 && nums[i] == nums[i - 1]) continue;

    int left = i + 1;
    int right = nums.length - 1;

    while (left < right) {

        int sum = nums[i] + nums[left] + nums[right];

        if (sum == 0) {
            result.add(Arrays.asList(nums[i], nums[left], nums[right]));

            while (left < right && nums[left] == nums[left + 1]) left++;
            while (left < right && nums[right] == nums[right - 1]) right--;

            left++;
            right--;
        }
        else if (sum < 0) left++;
        else right--;
    }
}
```
------------------

### Why skip duplicates?

Because sorted array groups duplicates together.

If not skipped:
You’ll generate same triplet multiple times.

-------------------

### Interview Answer:

We skip duplicates by checking if current element equals previous one, because sorting groups duplicates together and ensures unique triplets.

----------------------

## ❓6. What are different Two Pointer Variations?

### Important question.

#### 1️⃣ Opposite Direction

Example: Pair Sum, Container With Most Water

#### 2️⃣ Same Direction (Slow & Fast)

Example: Remove duplicates, Move zeroes

#### 3️⃣ Partition Type

Example: Dutch National Flag

#### 4️⃣ Expand From Center

Example: Longest Palindromic Substring

-------

### Interview Tip:
Always classify pointer type before coding.

------------------

## ❓7. What are common mistakes candidates make?

1. Forgetting to sort before applying pattern

2. Not skipping duplicates

3. Incorrect pointer update

4. Infinite loop

5. Off-by-one errors

------------------

## ❓8. Why is Two Pointer considered Greedy in some problems?

Example: Container With Most Water

We always move the smaller height pointer.

Why?
Because area is limited by smaller height.

This is greedy elimination.

-------------------------

## ❓9. Can Two Pointer be applied to Linked List?

Yes.

Example:

- Find middle node
- Detect cycle
- Reverse linked list

But here it becomes Fast/Slow Pointer pattern. 

------------

## ❓10. Time and Space Complexity Rule of Thumb?

Usually:
Time: O(n)
Space: O(1)

Unless nested (like 3Sum → O(n²))

--------------------------

# 🚀 INTERVIEW LEVEL SUMMARY
If interviewer gives:

```
| Problem Type          | Think          |
| --------------------- | -------------- |
| Sorted + pair/triplet | Two pointer    |
| Remove duplicates     | Slow/Fast      |
| Reverse something     | Two pointer    |
| Subarray window       | Sliding window |
| Cycle detection       | Fast/Slow      |

```

