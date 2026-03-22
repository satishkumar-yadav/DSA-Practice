# 🔥 SIMPLE RECURSION PROBLEMS

## ✅ 1. Factorial
```
public static int factorial(int n) {
    if (n == 0) return 1;
    return n * factorial(n - 1);
}
```

### Dry Run: factorial(4)

- 4 × fact(3)
- 3 × fact(2)
- 2 × fact(1)
- 1 × fact(0)
- = 24

- Time = O(n)
- Space = O(n)

----------------------

## ✅ 2. Fibonacci

```
public static int fib(int n) {
    if (n <= 1) return n;
    return fib(n - 1) + fib(n - 2);
}
```
Time = O(2^n)
Space = O(n)

(Interview trap: must optimize using DP later)

---------------

# 🔥 IMPORTANT BACKTRACKING PROBLEMS (Detailed)

## ✅ 1. Generate All Subsets

Input: [1,2,3]

### Java Code 
```
public static List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    backtrack(result, new ArrayList<>(), nums, 0);
    return result;
}

private static void backtrack(List<List<Integer>> result,
                              List<Integer> temp,
                              int[] nums,
                              int start) {

    result.add(new ArrayList<>(temp));

    for (int i = start; i < nums.length; i++) {
        temp.add(nums[i]);
        backtrack(result, temp, nums, i + 1);
        temp.remove(temp.size() - 1);
    }
}
```

### Dry Run

- Start: []
- Add []
- Add 1 → [1]
- Add 2 → [1,2]
- Add 3 → [1,2,3]
- Backtrack → [1,2]
- Add 3 → [1,3]
...

- Time = O(2^n)
- Space = O(n)

-------------

## ✅ 2. Permutations
```
public static List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    backtrack(result, new ArrayList<>(), nums);
    return result;
}

private static void backtrack(List<List<Integer>> result,
                              List<Integer> temp,
                              int[] nums) {

    if (temp.size() == nums.length) {
        result.add(new ArrayList<>(temp));
        return;
    }

    for (int num : nums) {
        if (temp.contains(num)) continue;

        temp.add(num);
        backtrack(result, temp, nums);
        temp.remove(temp.size() - 1);
    }
}
```
Time = O(n!)

-----------------

## ✅ 3. Combination Sum

Choose unlimited times.

```
public static List<List<Integer>> combinationSum(int[] candidates, int target) {
    List<List<Integer>> result = new ArrayList<>();
    backtrack(result, new ArrayList<>(), candidates, target, 0);
    return result;
}

private static void backtrack(List<List<Integer>> result,
                              List<Integer> temp,
                              int[] nums,
                              int remain,
                              int start) {

    if (remain < 0) return;
    if (remain == 0) {
        result.add(new ArrayList<>(temp));
        return;
    }

    for (int i = start; i < nums.length; i++) {
        temp.add(nums[i]);
        backtrack(result, temp, nums, remain - nums[i], i);
        temp.remove(temp.size() - 1);
    }
}
```

Time = Exponential

------------------

## ✅ 4. N-Queens (Very Famous)

Core idea:
Place queen → check valid → recurse → remove queen.

Time ≈ O(N!)

--------------------

## ✅ 5. Word Search

DFS + Backtracking.

--------------

## ✅ 6. Palindrome Partitioning

Generate partitions recursively.

----------------

## ✅ 7. Letter Combinations of Phone Number

Classic recursion tree problem.

---------------------

✅ 8. Generate Parentheses

```
public static void backtrack(List<String> result,
                             String current,
                             int open,
                             int close,
                             int max) {

    if (current.length() == max * 2) {
        result.add(current);
        return;
    }

    if (open < max)
        backtrack(result, current + "(", open + 1, close, max);

    if (close < open)
        backtrack(result, current + ")", open, close + 1, max);
}
```
Time = Catalan number (≈ 4^n / sqrt(n))

----------------------

# 🔥 INTERVIEW QUESTIONS
## ❓ Why is backtracking exponential?

Because it explores all possible combinations.

------------------

## ❓ What is recursion stack space?

Depth of recursion.

-------------------------

## ❓ Difference between recursion and backtracking?

Recursion = technique
Backtracking = recursion + undo choice

------------

## ❓ When to prune branches?

If constraint violated.

Example:
remain < 0 → stop.

---------------------

## ❓ How to avoid duplicates?

Sort input
Skip duplicates in loop

------------------


# 🔥 COMMON MISTAKES

1. Forgetting to remove element (unchoose)

2. Not copying list before adding

3. Infinite recursion

4. Wrong base case

5. Stack overflow

-------------------------

# 🔥 COMPLEXITY SUMMARY

```
| Problem         | Time        |
| --------------- | ----------- |
| Subsets         | O(2^n)      |
| Permutations    | O(n!)       |
| N-Queens        | O(n!)       |
| Combination sum | Exponential |

```



