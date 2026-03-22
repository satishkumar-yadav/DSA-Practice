Now we enter one of the most powerful and highest-ROI interview patterns:

# 🔥 PATTERN 5: BINARY SEARCH (Complete Deep Guide – Java)

VERY IMPORTANT for product companies.

Covers:
- Search problems
- Rotated array
- Peak element
- Minimum in rotated array
- Aggressive cows type problems
- Koko eating bananas
- Capacity to ship packages

This includes:

- Classic Binary Search

- Lower Bound / Upper Bound

- First & Last Occurrence

- Search in Rotated Array

- Find Peak Element

- Minimum in Rotated Array

- Binary Search on Answer (VERY IMPORTANT)

- Advanced Interview Variations

----------------------

## ✅ 1. WHAT IS BINARY SEARCH?

Binary Search is used on sorted data.

It reduces search space by half every step.

Time Complexity:
O(log n)

-----------------

## ✅ 2. WHEN TO USE BINARY SEARCH?

If problem contains:

- Sorted array

- Search in O(log n)

- Minimize / maximize something

- Monotonic function

- Find smallest/largest satisfying condition

Immediately think Binary Search.

------------

## ✅ 3. CORE TEMPLATE (VERY IMPORTANT)

Always use this safe version:

```
public static int binarySearch(int[] arr, int target) {
    int left = 0;
    int right = arr.length - 1;

    while (left <= right) {
        int mid = left + (right - left) / 2;

        if (arr[mid] == target)
            return mid;
        else if (arr[mid] < target)
            left = mid + 1;
        else
            right = mid - 1;
    }
    return -1;
}
```

Why this mid formula?

To avoid integer overflow.

-----------------------



