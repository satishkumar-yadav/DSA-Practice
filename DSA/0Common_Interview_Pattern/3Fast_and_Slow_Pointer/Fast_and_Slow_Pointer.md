# 🔥 PATTERN 3: FAST & SLOW POINTER (Floyd’s Algorithm)

This pattern is EXTREMELY important for:

- Linked List problems

- Cycle detection

- Middle element

- Duplicate number in array

- Happy number

- Loop problems

Many companies love this.

---------------

## ✅ 1. WHAT IS FAST & SLOW POINTER?

Two pointers move at different speeds:

- Slow → moves 1 step

- Fast → moves 2 steps

Used to detect:

- Cycles

- Midpoint

- Convergence points

------------------

## ✅ 2. WHEN TO USE?

If question contains:

- Cycle detection

- Find middle node

- Linked list loop

- Duplicate number without modifying array

- Circular array

- Happy number

Immediately think Fast & Slow.

--------------------------

## ✅ 3. WHY DOES IT WORK? (Mathematical Logic)

If a cycle exists:

- Fast moves 2 steps
- Slow moves 1 step

Eventually fast laps slow → they meet.

This is called Floyd’s Cycle Detection Algorithm.

-----------------

## 🧠 GENERAL ALGORITHM (Cycle Detection)

```
slow = head
fast = head

while fast != null && fast.next != null:
    slow = slow.next
    fast = fast.next.next
    
    if slow == fast:
        cycle exists
```

- Time: O(n)
- Space: O(1)

-------------------------

