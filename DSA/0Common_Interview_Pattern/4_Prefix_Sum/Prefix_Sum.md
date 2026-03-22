
# 🔥 PATTERN 4: PREFIX SUM

This is one of the most important patterns for:

- Subarray sum problems
- Range queries
- Count subarrays
- Exactly K problems
- Balanced arrays
- Cumulative frequency problems

----------------

## ✅ 1. WHAT IS PREFIX SUM?

Prefix Sum means:

At index i, store sum of all elements from index 0 to i.

- Example:

- Array: [2, 4, 6, 8]

Prefix array:
```
[2,
 2+4=6,
 6+6=12,
 12+8=20]
```

So prefix[i] = sum(0 → i)

-----------------------------

## ✅ 2. WHY DO WE USE PREFIX SUM?

1. Without prefix sum:

To calculate sum of subarray (L to R),
you must loop → O(n)

2. With prefix sum:
```
sum(L,R) = prefix[R] - prefix[L-1]
```
Time becomes O(1)

------------------------------

## ✅ 3. WHEN TO USE PREFIX SUM?

If question contains:

- Subarray sum

- Range sum

- Exactly K sum

- Count number of subarrays

- Equal number of 0s and 1s

- Balanced parentheses count

- Running totals

Immediately think Prefix Sum.

------------------

## ✅ 4. BASIC TEMPLATE
```
int[] prefix = new int[n];
prefix[0] = arr[0];

for (int i = 1; i < n; i++) {
    prefix[i] = prefix[i - 1] + arr[i];
}
```

--------------

## 🔥 CRITICAL FORMULA

Subarray sum from L to R:
```
if (L == 0)
    sum = prefix[R];
else
    sum = prefix[R] - prefix[L - 1];
```


