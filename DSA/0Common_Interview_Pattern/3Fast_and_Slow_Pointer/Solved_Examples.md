
# 🔥 10 IMPORTANT PROBLEMS (WITH CODE + DRY RUN)

## ✅ 1. Detect Cycle in Linked List
 ### Java Code
 ```
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public static boolean hasCycle(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;

    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;

        if (slow == fast) {
            return true;
        }
    }
    return false;
}
 ```

 -------------------

 ### Dry Run

- 1 → 2 → 3 → 4 → 2 (cycle)

- Step1: slow=2, fast=3
- Step2: slow=3, fast=2
- Step3: slow=4, fast=4 → meet

- Cycle exists.

- Time: O(n)
- Space: O(1)

-----------------------

## ✅ 2. Find Start of Cycle

After meeting:

- Reset one pointer to head
- Move both one step at a time
- They meet at cycle start.

### Java Code
```
public static ListNode detectCycle(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;

    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;

        if (slow == fast) {
            ListNode ptr = head;
            while (ptr != slow) {
                ptr = ptr.next;
                slow = slow.next;
            }
            return ptr;
        }
    }
    return null;
}
```

- Time: O(n)
- Space: O(1)

-------------------

## ✅ 3. Find Middle of Linked List

```
public static ListNode middleNode(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;

    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }

    return slow;
}
```

### Dry Run:

1→2→3→4→5

slow: 1→2→3
fast: 1→3→5

Return 3

- Time: O(n)
- Space: O(1)

-----------------

## ✅ 4. Check Linked List Palindrome

Steps:

1. Find middle
2. Reverse second half
3. Compare

- Time: O(n)
- Space: O(1)

--------------------

## ✅ 5. Happy Number (Cycle in digits)

Treat number transformation as linked list.

```
public static boolean isHappy(int n) {
    int slow = n;
    int fast = n;

    do {
        slow = sumOfSquares(slow);
        fast = sumOfSquares(sumOfSquares(fast));
    } while (slow != fast);

    return slow == 1;
}

private static int sumOfSquares(int n) {
    int sum = 0;
    while (n > 0) {
        int digit = n % 10;
        sum += digit * digit;
        n /= 10;
    }
    return sum;
}
```

- Time: O(log n)
- Space: O(1)

---------------

## ✅ 6. Find Duplicate Number (Important)

Array of size n+1, numbers 1 to n.

Treat as linked list.

```
public static int findDuplicate(int[] nums) {
    int slow = nums[0];
    int fast = nums[0];

    do {
        slow = nums[slow];
        fast = nums[nums[fast]];
    } while (slow != fast);

    slow = nums[0];
    while (slow != fast) {
        slow = nums[slow];
        fast = nums[fast];
    }

    return slow;
}
```

- Time: O(n)
- Space: O(1)

VERY IMPORTANT INTERVIEW PROBLEM.

------------

## ✅ 7. Remove Nth Node From End

Use fast pointer N steps ahead.

- Time: O(n)

--------------------------

## ✅ 8. Split Linked List in Half

Same as middle node.

-----------------------------------

## ✅ 9. Detect Cycle Length

After meeting, move one pointer until it meets again counting steps.

------------------------------

## ✅ 10. Circular Array Loop

Variation using fast & slow pointer.

-------------------

# 🔥 INTERVIEW QUESTIONS & ANSWERS

## ❓ Why does Floyd’s algorithm work?

- Because in a cycle:
- Distance covered by fast = 2 × slow
- Relative speed = 1 step
- So they must meet.

-------------

## ❓ Why is space O(1)?

No extra memory used unlike HashSet approach.

--------------

## ❓ Alternative way to detect cycle?

Using HashSet (O(n) space)

------------

## ❓ When to prefer fast/slow over HashSet?

When space constraint exists.

-------------

## ❓ What if list length is even?

Middle returns second middle by default.

---------------

# 🔥 COMPLEXITY SUMMARY

```
| Problem        | Time     | Space |
| -------------- | -------- | ----- |
| Cycle detect   | O(n)     | O(1)  |
| Middle node    | O(n)     | O(1)  |
| Find duplicate | O(n)     | O(1)  |
| Happy number   | O(log n) | O(1)  |

```

