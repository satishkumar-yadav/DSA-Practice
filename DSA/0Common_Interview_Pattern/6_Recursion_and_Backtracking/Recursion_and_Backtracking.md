# 🔥 PATTERN 6: RECURSION & BACKTRACKING (Complete Deep Guide – Java)

This covers:
- Subsets
- Permutations
- Combination Sum
- N-Queens
- Sudoku
- Word Search

Very important for product companies.

-------------------

# 📌 PART 1: RECURSION

## ✅ 1. WHAT IS RECURSION?

A function that calls itself.

Every recursive function has:

1. Base Case (Stopping condition)

2. Recursive Call (Break into smaller problem)

----------------------

## ✅ 2. WHY USE RECURSION?

Used when:

- Problem can be divided into smaller subproblems

- Tree-like exploration

- Exhaustive search

- Divide & Conquer

----------------------

## 🧠 BASIC TEMPLATE

```
void solve(input) {
    if (base condition)
        return;

    // do something

    solve(smaller input);
}
```

-------------------

## 🔥 VERY IMPORTANT CONCEPT

Recursion uses:

- ➡ Call Stack
- ➡ Each function call waits until deeper calls finish

Time = depends on number of calls
Space = recursion depth (stack space)

---------------

# 📌 PART 2: BACKTRACKING (MOST IMPORTANT)

## ✅ 1. WHAT IS BACKTRACKING?

Backtracking is:

Try → Explore → Undo → Try next

Used for:

- Generating all combinations

- Permutations

- Subsets

- Constraint problems

-----------

## 🧠 CORE TEMPLATE
```
void backtrack(List<Integer> temp, ...) {

    if (base case) {
        result.add(new ArrayList<>(temp));
        return;
    }

    for (choices) {
        // choose
        temp.add(choice);

        // explore
        backtrack(temp, ...);

        // unchoose (BACKTRACK)
        temp.remove(temp.size() - 1);
    }
}
```
The “unchoose” step is VERY important.

---------------------

## 🔥 HOW TO IDENTIFY BACKTRACKING?

If problem asks:

- Generate all subsets

- All permutations

- All combinations

- N-Queens

- Sudoku

- Word search

- Path finding

Immediately think Backtracking.

-------------------------

## 
