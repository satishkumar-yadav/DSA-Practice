# 12 IMPORTANT INTERVIEW PROBLEMS.

## ✅ 1. Range Sum Query
### Problem : Given array and multiple queries (L, R), return sum in O(1).

### Java Code
```
class NumArray {
    int[] prefix;

    public NumArray(int[] nums) {
        prefix = new int[nums.length];
        prefix[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }
    }

    public int sumRange(int left, int right) {
        if (left == 0) return prefix[right];
        return prefix[right] - prefix[left - 1];
    }
}
```

- Time:
- Preprocessing = O(n)
- Query = O(1)

- Space = O(n)

------------------

## ✅ 2. Subarray Sum Equals K (VERY IMPORTANT)

This is one of the most asked problems.

- Brute Force → O(n²)

Prefix + HashMap → O(n)

- Core Idea

If:
```
prefix[j] - prefix[i] = k
```
Then: 
```
prefix[i] = prefix[j] - k
```

So we check if (currentSum - k) already exists.

### Java Code 
```
public static int subarraySum(int[] nums, int k) {
    Map<Integer, Integer> map = new HashMap<>();
    map.put(0, 1);

    int sum = 0;
    int count = 0;

    for (int num : nums) {
        sum += num;

        if (map.containsKey(sum - k)) {
            count += map.get(sum - k);
        }

        map.put(sum, map.getOrDefault(sum, 0) + 1);
    }

    return count;
}
```

### Dry Run

- nums = [1,1,1], k=2

- sum=1 → no
- sum=2 → yes (2-2=0)
- sum=3 → yes (3-2=1 exists once)

- Answer = 2

- Time = O(n)
- Space = O(n)

-----------------

## ✅ 3. Continuous Subarray Sum (Multiple of K)

Use prefix % k trick.

- Key idea:
If two prefix sums have same remainder → subarray between them is multiple of k.

- Time = O(n)

-----------------

## ✅ 4. Count Subarrays With Equal 0s and 1s

- Convert:
0 → -1
1 → 1

- Then find subarray sum = 0.

- Reuse subarray sum equals K logic.

- Time = O(n)

-------------

## ✅ 5. Longest Subarray With Sum K

Use HashMap to store first occurrence of prefix sum.

### Java Code
```
public static int longestSubarray(int[] nums, int k) {
    Map<Integer, Integer> map = new HashMap<>();
    int sum = 0;
    int maxLen = 0;

    for (int i = 0; i < nums.length; i++) {
        sum += nums[i];

        if (sum == k)
            maxLen = i + 1;

        if (map.containsKey(sum - k)) {
            maxLen = Math.max(maxLen, i - map.get(sum - k));
        }

        map.putIfAbsent(sum, i);
    }

    return maxLen;
}
```
- Time = O(n)

------------------------

## ✅ 6. Pivot Index

Left sum = Total sum - left sum - current

- Time = O(n)
- Space = O(1)

----------------

## ✅ 7. Product Except Self

- Prefix product + suffix product.

- Time = O(n)

-------------------

## ✅ 8. 2D Prefix Sum (Matrix)

Very important.
```
prefix[i][j] =
matrix[i][j]
+ prefix[i-1][j]
+ prefix[i][j-1]
- prefix[i-1][j-1]
```

- Time = O(n*m)

--------------

## ✅ 9. Maximum Subarray (Kadane’s = optimized prefix)

Kadane is optimized prefix sum.

- Time = O(n)

-------------

## ✅ 10. Check Subarray With Given Sum

Prefix sum set approach.

--------------------

## ✅ 11. Count Subarrays Divisible By K

Use remainder frequency.

- Time = O(n)

------------------

## ✅ 12. Longest Balanced Parentheses

- Convert '(' → +1, ')' → -1
- Use prefix and HashMap.

-------------------


# 🔥 IMPORTANT INTERVIEW QUESTIONS

## ❓ Why do we use HashMap with prefix sum?

Because we need to know:
Have we seen prefix sum before?

This allows constant time lookup.

---------------------

## ❓ Why do we store frequency?

Because there may be multiple previous prefix sums that satisfy condition.

-----------------

## ❓ Difference between Sliding Window & Prefix Sum?

Sliding Window:
Works when numbers are positive (monotonic property)

Prefix Sum:
Works for negative numbers too.

Example:
Subarray sum = K with negatives → Sliding window fails.

-----------------------

## ❓ When to use modulo trick?

When problem involves:

Divisible by K

Remainder logic

---------------

# 🔥 COMMON MISTAKES

1. Forgetting map.put(0,1)

2. Not handling negative remainder

3. Overwriting first occurrence (important for longest subarray)

4. Integer overflow (use long)

----------------

# 🔥 COMPLEXITY SUMMARY

```
| Problem Type   | Time        | Space  |
| -------------- | ----------- | ------ |
| Range query    | O(n) + O(1) | O(n)   |
| Subarray sum K | O(n)        | O(n)   |
| Divisible by K | O(n)        | O(n)   |
| 2D prefix      | O(n*m)      | O(n*m) |

```


