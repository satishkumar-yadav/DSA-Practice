# 🔥 PART 1: CLASSIC PROBLEMS (Sorted Array)

## ✅ 1. Binary Search (Basic)
- Dry Run

- Array: [1,3,5,7,9], target=7

- left=0 right=4
- mid=2 → 5 <7 → left=3
- mid=3 → 7 found

- Time = O(log n)
- Space = O(1)

---------------------

## ✅ 2. First Occurrence

Modify logic:

If found → move right to mid - 1
```
public static int firstOccurrence(int[] arr, int target) {
    int left = 0, right = arr.length - 1;
    int ans = -1;

    while (left <= right) {
        int mid = left + (right - left) / 2;

        if (arr[mid] == target) {
            ans = mid;
            right = mid - 1;
        } else if (arr[mid] < target)
            left = mid + 1;
        else
            right = mid - 1;
    }
    return ans;
}
```

-----------------------

## ✅ 3. Last Occurrence

Move left = mid + 1 when found.

---------------

## ✅ 4. Count Occurrences
```
count = lastIndex - firstIndex + 1
```
Time = O(log n)

------------------------

## ✅ 5. Lower Bound

Smallest index where arr[i] ≥ target

Very common in interviews.


---------------------------------

# 🔥 PART 2: MODIFIED BINARY SEARCH

## ✅ 6. Search in Rotated Sorted Array

- Example: [4,5,6,7,0,1,2]

- Key logic: One half is always sorted.

```
public static int search(int[] nums, int target) {
    int left = 0, right = nums.length - 1;

    while (left <= right) {
        int mid = left + (right - left) / 2;

        if (nums[mid] == target)
            return mid;

        if (nums[left] <= nums[mid]) { // left sorted
            if (nums[left] <= target && target < nums[mid])
                right = mid - 1;
            else
                left = mid + 1;
        } else { // right sorted
            if (nums[mid] < target && target <= nums[right])
                left = mid + 1;
            else
                right = mid - 1;
        }
    }
    return -1;
}
```
Time = O(log n)

--------------

## ✅ 7. Find Minimum in Rotated Array

```
public static int findMin(int[] nums) {
    int left = 0, right = nums.length - 1;

    while (left < right) {
        int mid = left + (right - left) / 2;

        if (nums[mid] > nums[right])
            left = mid + 1;
        else
            right = mid;
    }
    return nums[left];
}
```

-------------------

## ✅ 8. Find Peak Element

- Peak means:
- nums[i] > neighbors

```
public static int findPeak(int[] nums) {
    int left = 0, right = nums.length - 1;

    while (left < right) {
        int mid = left + (right - left) / 2;

        if (nums[mid] > nums[mid + 1])
            right = mid;
        else
            left = mid + 1;
    }
    return left;
}
```

------------------------

# 🔥 PART 3: BINARY SEARCH ON ANSWER (MOST IMPORTANT)

This is advanced and VERY common.

Used when:

- We don’t search for element,
- We search for MINIMUM or MAXIMUM possible value.

------------------

## ✅ HOW TO IDENTIFY BINARY SEARCH ON ANSWER?

1. If problem says:

- Minimize the maximum

- Maximize the minimum

- Smallest possible

- Largest possible

- Capacity

- Speed

- Distance

And the answer is numeric.

2. Then think:

- "Is there a monotonic property?"

If YES → Binary search on answer.

----------------------

## 🧠 TEMPLATE

```
int left = minimumPossible;
int right = maximumPossible;

while (left <= right) {
    int mid = left + (right - left) / 2;

    if (isPossible(mid))
        right = mid - 1;  // try smaller
    else
        left = mid + 1;   // increase
}

return left;
```

-----------------

## 🔥 IMPORTANT PROBLEMS
### ✅ 9. Koko Eating Bananas

Find minimum eating speed.

Monotonic property:
- If speed works → larger speeds also work.

```
public static int minEatingSpeed(int[] piles, int h) {
    int left = 1;
    int right = Arrays.stream(piles).max().getAsInt();

    while (left <= right) {
        int mid = left + (right - left) / 2;

        int hours = 0;
        for (int pile : piles)
            hours += (pile + mid - 1) / mid;

        if (hours <= h)
            right = mid - 1;
        else
            left = mid + 1;
    }
    return left;
}
```

Time = O(n log max)

-----------------------

### ✅ 10. Capacity To Ship Packages

Same logic.

Binary search on weight capacity.

--------------------------

### ✅ 11. Aggressive Cows (Very Famous)

Maximize minimum distance.

If distance works → smaller distances also work.

-------------------

### ✅ 12. Allocate Books

Minimize maximum pages.

----------------

# 🔥 INTERVIEW QUESTIONS

## ❓ Why binary search works in O(log n)?

Because we halve search space every iteration.

----------------

## ❓ When binary search fails?

If no monotonic property.

----------

## ❓ Difference between classical and answer search?

Classical:
Search element in sorted array.

Answer search:
Search solution space.

------------------

## ❓ Why check condition inside helper function?

Because we need a monotonic predicate.

----------------

# 🔥 COMMON MISTAKES

- Infinite loop (wrong condition)

- mid overflow

- Using left < right incorrectly

- Not understanding monotonic property

- Returning wrong pointer at end

------------------

# 🔥 COMPLEXITY SUMMARY

```
| Type          | Time           |
| ------------- | -------------- |
| Classical     | O(log n)       |
| Rotated       | O(log n)       |
| Peak          | O(log n)       |
| Answer search | O(n log range) |

```

