# 🔥 SOLVED EXAMPLES (10 Problems)

## 🧠 Example 1: Two Sum (Sorted Array)
### Problem : Return indices of two numbers whose sum = target.

### Java Code
```
public static int[] twoSum(int[] arr, int target) {
    int left = 0;
    int right = arr.length - 1;

    while (left < right) {
        int sum = arr[left] + arr[right];

        if (sum == target) {
            return new int[]{left, right};
        } else if (sum < target) {
            left++;
        } else {
            right--;
        }
    }
    return new int[]{-1, -1};
}
```

### Dry Run
- Input: [1,2,4,6,8], target = 10
- left=0 right=4 → 1+8=9 <10 → left++
- left=1 right=4 → 2+8=10 → Found

- Time: O(n)
- Space: O(1)

-------------------------------

## 🧠 Example 2: Remove Duplicates from Sorted Array
### Algorithm :
- Use slow pointer for unique position.
- Use fast pointer to scan.

### Java Code
```
public static int removeDuplicates(int[] arr) {
    if (arr.length == 0) return 0;

    int slow = 0;

    for (int fast = 1; fast < arr.length; fast++) {
        if (arr[fast] != arr[slow]) {
            slow++;
            arr[slow] = arr[fast];
        }
    }
    return slow + 1;
}
```

### Dry Run

- [1,1,2,2,3]
- slow=0 fast=1 → equal
- fast=2 → not equal → slow=1 assign 2
- fast=4 → slow=2 assign 3
- Result: [1,2,3]

- Time: O(n)
- Space: O(1)


----------------------------------------

## 🧠 Example 3: Reverse String

```
public static void reverse(char[] arr) {
    int left = 0;
    int right = arr.length - 1;

    while (left < right) {
        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        left++;
        right--;
    }
}
```
- Time: O(n)
- Space: O(1)

------------------------------------

## 🧠 Example 4: Valid Palindrome

```
public static boolean isPalindrome(String s) {
    int left = 0, right = s.length() - 1;

    while (left < right) {
        if (s.charAt(left) != s.charAt(right)) {
            return false;
        }
        left++;
        right--;
    }
    return true;
}
```
- Time: O(n)

---------------------------------------------

## 🧠 Example 5: 3 Sum (Important)

Sort first → then use two pointers inside loop.

```
public static List<List<Integer>> threeSum(int[] nums) {
    Arrays.sort(nums);
    List<List<Integer>> result = new ArrayList<>();

    for (int i = 0; i < nums.length - 2; i++) {
        int left = i + 1;
        int right = nums.length - 1;

        while (left < right) {
            int sum = nums[i] + nums[left] + nums[right];

            if (sum == 0) {
                result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                left++;
                right--;
            } else if (sum < 0) {
                left++;
            } else {
                right--;
            }
        }
    }
    return result;
}
```
- Time: O(n²)
- Space: O(1)

--------------------------------------

## 🧠 Example 6: Container With Most Water
Two pointers from ends.

- Time: O(n)

---------------------------------------------

## 🧠 Example 7: Move Zeroes

```
public static void moveZeroes(int[] nums) {
    int slow = 0;

    for (int fast = 0; fast < nums.length; fast++) {
        if (nums[fast] != 0) {
            int temp = nums[slow];
            nums[slow] = nums[fast];
            nums[fast] = temp;
            slow++;
        }
    }
}
```
- Time: O(n)

-------------------------------------

## 🧠 Example 8: Remove Element
Same slow/fast pattern.

----------------------------------------

## 🧠 Example 9: Squared Sorted Array
Start left & right → compare squares → fill from end.

- Time: O(n)

--------------------------------

## 🧠 Example 10: Dutch National Flag (0,1,2 sort)
3 pointers:
low, mid, high

- Time: O(n)