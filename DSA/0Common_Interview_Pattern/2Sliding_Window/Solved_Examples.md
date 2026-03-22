
# 🔹 TYPE 1: FIXED SIZE WINDOW

Used when window size = K is fixed.

---------------------------------

## 🧠 GENERAL ALGORITHM (Fixed Size K)

1. Compute sum of first K elements 

2. Slide window:
    - subtract element going out
    - add new element coming in

3. Track best result

-----------------------


# 🔥 FIXED WINDOW – 10 SOLVED PROBLEMS

## ✅ 1. Maximum Sum Subarray of Size K
### Problem: Find maximum sum of subarray of size K.

### Java Code
```
public static int maxSum(int[] arr, int k) {
    int windowSum = 0;

    for (int i = 0; i < k; i++)
        windowSum += arr[i];

    int maxSum = windowSum;

    for (int i = k; i < arr.length; i++) {
        windowSum += arr[i] - arr[i - k];
        maxSum = Math.max(maxSum, windowSum);
    }

    return maxSum;
}
```

### Dry Run

- arr = [2,1,5,1,3,2], k=3

- Initial sum = 2+1+5 = 8
- Slide:
- (1+5+1)=7
- (5+1+3)=9
- (1+3+2)=6

- Max = 9

- Time: O(n)
- Space: O(1)

---------------------------

## ✅ 2. First Negative Number in Every Window

Use queue to track negatives.

- Time: O(n)

----------------

## ✅ 3. Count Occurrences of Anagrams

Use frequency array of size 26.

- Time: O(n)

-------------

## ✅ 4. Maximum Average Subarray

Same as max sum, divide by k.

----------------------------

## ✅ 5. Sliding Window Maximum (Important)

Use Deque.
```
public static int[] maxSlidingWindow(int[] nums, int k) {
    Deque<Integer> dq = new LinkedList<>();
    int[] result = new int[nums.length - k + 1];
    int index = 0;

    for (int i = 0; i < nums.length; i++) {

        while (!dq.isEmpty() && dq.peek() < i - k + 1)
            dq.poll();

        while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i])
            dq.pollLast();

        dq.offer(i);

        if (i >= k - 1)
            result[index++] = nums[dq.peek()];
    }

    return result;
}
```

- Time: O(n)

----------------

✅ 6–10 (Concept Covered)

## 6.Number of subarrays of size K with sum > X

## 7.Minimum swaps to group K ones

## 8.Max vowels in substring length K

## 9.Subarray with exactly K distinct elements

## 10.Find max consecutive ones with K flips (bridge to variable window)

--------------------------

# 🔹 TYPE 2: VARIABLE SIZE WINDOW

- Window size not fixed.
- We expand and shrink dynamically.

## 🧠 GENERAL ALGORITHM
```
left = 0

for right in range:
    add current element
    
    while window invalid:
        remove left element
        left++
    
    update answer
```

------------------

# 🔥 VARIABLE WINDOW – 10 SOLVED PROBLEMS

## ✅ 1. Longest Substring Without Repeating Characters
```
public static int lengthOfLongestSubstring(String s) {
    Set<Character> set = new HashSet<>();
    int left = 0, max = 0;

    for (int right = 0; right < s.length(); right++) {
        while (set.contains(s.charAt(right))) {
            set.remove(s.charAt(left));
            left++;
        }
        set.add(s.charAt(right));
        max = Math.max(max, right - left + 1);
    }

    return max;
}
```

### Dry Run

- "abcabcbb"

- Window expands until duplicate
- Shrink until duplicate removed
- Max = 3

------------

- Time: O(n)
- Space: O(1)

--------------------

## ✅ 2. Longest Subarray with Sum ≤ K

Use running sum.

- Time: O(n)

---------

## ✅ 3. Minimum Size Subarray Sum

```
public static int minSubArrayLen(int target, int[] nums) {
    int left = 0, sum = 0, min = Integer.MAX_VALUE;

    for (int right = 0; right < nums.length; right++) {
        sum += nums[right];

        while (sum >= target) {
            min = Math.min(min, right - left + 1);
            sum -= nums[left];
            left++;
        }
    }

    return min == Integer.MAX_VALUE ? 0 : min;
}
```

- Time: O(n)

------------

## ✅ 4. Fruit Into Baskets (2 distinct)

Use HashMap size ≤ 2

- Time: O(n)

-----------------

## ✅ 5. Longest Repeating Character Replacement

Keep track of max frequency.

- Time: O(n)

-------------------------

## ✅ 6. Subarray with At Most K Distinct

Use HashMap count.

- Time: O(n)

----------------------

## ✅ 7. Subarray with Exactly K Distinct

Exactly K = AtMost(K) - AtMost(K-1)

----------------

## ✅ 8. Binary Subarray Sum

Convert to atMost problem.

---------------

## ✅ 9. Longest Subarray of 1’s after K flips

Classic variable window.

-----------

## ✅ 10. Smallest Window Containing All Characters

Use frequency map.

- Time: O(n)

----------------

# 🔥 INTERVIEW IDENTIFICATION TRICK

If question says:
```
| Phrase            | Pattern      |
| ----------------- | ------------ |
| Size K            | Fixed Window |
| Longest           | Variable     |
| Smallest          | Variable     |
| At most K         | Variable     |
| Exactly K         | AtMost trick |
| Without repeating | Variable     |

```

# 🔥 COMMON MISTAKES

1. Forget shrinking loop

2. Not updating answer correctly

3. Not removing count when zero

4. Off-by-one window length

5. Using wrong data structure

# 🚀 COMPLEXITY RULE

Most sliding window:
- Time = O(n)
- Space = O(1) or O(26) or O(K)




