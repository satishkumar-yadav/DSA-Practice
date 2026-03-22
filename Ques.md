Here’s a well-organized set of 40 frequently asked DSA (Data Structures & Algorithms) questions for each level—easy, medium, and hard—drawn from major interview and coding sources. Each question is provided as a Java-friendly string (quoted) that you can use in your applications, along with clear explanations and working Java code examples. Due to space, I’ll demonstrate patterns for solutions (with code and explanations) for the first few in each category, then list the remaining questions with brief pointers. Let me know if you need full code for any specific question!

## Easy DSA Questions (Strings and Solutions)

1. "Two Sum"

- Problem: Given an array and a target, find indices of two numbers adding up to the target.
- Reason: Tests use of HashMap for quick look-up.
- Java Code:

```
java
public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        int complement = target - nums[i];
        if (map.containsKey(complement)) {
            return new int[] { map.get(complement), i };
        }
        map.put(nums[i], i);
    }
    return new int[0];
}
```

2. "Reverse a Linked List"

- Problem: Reverse a singly-linked list.
- Reason: Fundamental linked list manipulation.
- Java Code:

```
java
public ListNode reverseList(ListNode head) {
    ListNode prev = null;
    while (head != null) {
        ListNode next = head.next;
        head.next = prev;
        prev = head;
        head = next;
    }
    return prev;
}
```

3. "Merge Two Sorted Arrays"

- Problem: Merge two sorted arrays into one sorted array.
- Reason: Tests understanding of two-pointer technique.
- Java Code:

```
java
public int[] merge(int[] nums1, int[] nums2) {
    int n1 = nums1.length, n2 = nums2.length;
    int[] res = new int[n1 + n2];
    int i = 0, j = 0, k = 0;
    while (i < n1 && j < n2) res[k++] = nums1[i] < nums2[j] ? nums1[i++] : nums2[j++];
    while (i < n1) res[k++] = nums1[i++];
    while (j < n2) res[k++] = nums2[j++];
    return res;
}
```

4. "Palindrome String Check"

- Problem: Check if a string is a palindrome.
- Java Code:

```
java
public boolean isPalindrome(String s) {
    int l = 0, r = s.length() - 1;
    while (l < r) {
        if (s.charAt(l++) != s.charAt(r--)) return false;
    }
    return true;
}
```

5. "Maximum Subarray Sum (Kadane's Algorithm)"

- Problem: Find the maximum sum subarray.
- Java Code:

```
java
public int maxSubArray(int[] nums) {
    int max = nums[0], curr = nums[0];
    for (int i = 1; i < nums.length; i++) {
        curr = Math.max(nums[i], curr + nums[i]);
        max = Math.max(max, curr);
    }
    return max;
}
```

6. "Find the Missing Number in an Array"
7. "Check if Array is Sorted"
8. "Find Duplicate Element in Array"
9. "Linked List Cycle Detection"
10. "Implement Stack using Arrays"
11. "Binary Search"
12. "Find Intersection of Two Arrays"
13. "Find the Middle of a Linked List"
14. "Move Zeroes to End of Array"
15. "Check Balanced Parentheses"
16. "Calculate Factorial (Recursion)"
17. "Find Second Largest in Array"
18. "Remove Duplicates from Sorted Array"
19. "Implement Queue using Stack"
20. "Merge Two Linked Lists"
21. "Print FizzBuzz"
22. "Count Set Bits"
23. "Swap Nodes in Linked List"
24. "Find GCD of Two Numbers"
25. "Count Occurrences of Character"
26. "Reverse Words in a String"
27. "Sum of Digits"
28. "Check Power of Two"
29. "Sort Array (Bubble/Insertion Sort)"
30. "Remove Vowels from String"
31. "Find Min and Max in Array"
32. "Check for Anagram"
33. "Implement Stack using LinkedList"
34. "Delete Node in Linked List"
35. "Find First Non-Repeating Character"
36. "Rotate Array"
37. "Transpose Matrix"
38. "Frequency Count (HashMap)"
39. "Check Armstrong Number"
40. "Count Vowels in String"

## Medium DSA Questions (Strings and Solutions)

1. "3 Sum"

- Problem: Find all triplets that sum to zero in an array.
- Reason: Combines hashing, sorting, and two-pointer.

2. "Longest Substring Without Repeating Characters"

- Technique: Sliding window and HashSet.

3. "Merge Intervals"

- Key: Sorting and merging overlapping intervals.

4. "Product of Array Except Self"
5. "Find All Anagrams in a String"
6. "Set Matrix Zeroes"
7. "Search in Rotated Sorted Array"
8. "Find the Peak Element"
9. "Group Anagrams"
10. "Word Search in Matrix"
11. "Kth Smallest Element in BST"
12. "Find the Celebrity"
13. "Binary Tree Level Order Traversal"
14. "Detect Cycle in a Directed Graph"
15. "LRU Cache Implementation"
16. "Valid Sudoku"
17. "Clone Graph"
18. "Course Schedule"
19. "Find Number of Islands"
20. "Spiral Order Traversal"
21. "Add Two Numbers as Linked List"
22. "Longest Palindromic Substring"
23. "Permutation in String"
24. "Insert Interval"
25. "Top K Frequent Elements"
26. "Find Median from Data Stream"
27. "Rearrange Array in ZigZag"
28. "Kth Largest Element"
29. "Minimum Window Substring"
30. "Trapping Rain Water"
31. "Maximum Subarray Sum Circular"
32. "Binary Tree Right Side View"
33. "Subarray Sum Equals K"
34. "Number of Connected Components in Graph"
35. "Word Ladder"
36. "Edit Distance"
37. "Find Median of Two Sorted Arrays"
38. "House Robber"
39. "Coin Change"
40. "Count Bits"

## Hard DSA Questions (Strings and Solutions)

1. "Trapping Rain Water"

- Advanced two-pointer/cumulative sum technique.

2. "Median of Two Sorted Arrays"

- Binary search partitioning.

3. "LFU Cache Design"

- Multi-level HashMap + List data structures.

4. "Regular Expression Matching"
5. "Word Ladder II (All Shortest Transformations)"
6. "N-Queens Problem"
7. "Edit Distance (Levenshtein distance)"
8. "Merge K Sorted Linked Lists (Heap)"
9. "Serialize and Deserialize Binary Tree"
10. "Maximum Profit in Job Scheduling"
11. "Max Path Sum in Binary Tree"
12. "Longest Consecutive Sequence"
13. "Shortest Path in Weighted Graph (Dijkstra/A\*)"
14. "Minimum Window Substring"
15. "Remove Invalid Parentheses"
16. "Read N Characters Given Read4"
17. "The Skyline Problem"
18. "Kth Smallest Element in a Sorted Matrix"
19. "Palindrome Partitioning II"
20. "Count of Smaller Numbers After Self"
21. "Burst Balloons"
22. "Wildcard Matching"
23. "Largest Rectangle in Histogram"
24. "Sliding Window Maximum"
25. "Max Points on a Line"
26. "Subarrays with K Different Integers"
27. "Hard Binary Search Variants"
28. "Find Duplicate Subtrees"
29. "Split Array Largest Sum"
30. "Number of Distinct Islands"
31. "Cut Off Trees for Golf Event"
32. "Minimum Genetic Mutation"
33. "Freedom Trail (DP and Graph)"
34. "Remove Boxes"
35. "Alien Dictionary (Topological Sorting)"
36. "Best Time to Buy/Sell Stock IV"
37. "Max Value of Equation"
38. "Text Justification"
39. "Implement Trie with Wildcard"
40. "Chess Knight Minimum Steps"

### How to Use these Questions

- Each question string (e.g., "Two Sum") can be used in a Java array of questions for quiz/practice apps.
- For detailed code for any item above or the next in the list, specify the question string or number.
- All Java codes above are standard patterns and interviewer-expected solutions.
- These sets cover the “classic” and most-asked DSA topics by frequency and importance.

---

Great! Let's now provide DSA questions based solely on topic — one topic at a time — and break them down by difficulty: easy, medium, hard, and only related to Strings for now (you asked for Strings first).

I’ll list 40 common and most-asked questions for the String topic, organized as:

- ✅ Easy (15)
- 🟡 Medium (15)
- 🔴 Hard (10)

# 📘 STRING QUESTIONS (Only Strings)

## ✅ Easy String Questions (15)

1. "Check if a String is Palindrome"
2. "Reverse a String"
3. "Count Vowels and Consonants"
4. "Count Occurrences of a Character"
5. "Check if Two Strings are Anagrams"
6. "Remove Duplicates from String"
7. "Convert String to Lowercase/Uppercase"
8. "Implement strstr() or IndexOf Function"
9. "Check if String Contains Only Digits"
10. "Count Words in a String"
11. "Find First Non-Repeating Character"
12. "Remove Vowels from String"
13. "Toggle Case of Each Character"
14. "Check Rotations of Each Other"
15. "Reverse Words in a String"

## 🟡 Medium String Questions (15)

1. "Longest Substring Without Repeating Characters"
2. "Group Anagrams"
3. "Valid Palindrome After Deletion"
4. "Longest Palindromic Substring"
5. "String Compression (Leetcode 443)"
6. "Implement Atoi (String to Integer Conversion)"
7. "Minimum Additions to Make Valid Parentheses"
8. "Permutation in String (Leetcode 567)"
9. "Check if Two Strings are Isomorphic"
10. "Check if a Sentence is a Pangram"
11. "Multiply Two Large Numbers Represented as Strings"
12. "Longest Common Prefix (from a List of Strings)"
13. "Zigzag Conversion"
14. "Compare Version Numbers"
15. "Remove All Adjacent Duplicates"

## 🔴 Hard String Questions (10)

1. "Wildcard Pattern Matching (\* and ?)"
2. "Regular Expression Matching (. and \*)"
3. "Word Break II (Return All Possible Sequences)"
4. "Minimum Window Substring (Leetcode 76)"
5. "Palindrome Partitioning II (Min Cuts)"
6. "Text Justification"
7. "Longest Duplicate Substring (Suffix Array, Rolling Hash)"
8. "Remove Invalid Parentheses (Return All Possibilities)"
9. "Smallest Substring of All Characters (Minimum Cover Substring)"
10. "Count Different Palindromic Subsequences"

### 🔁 Next Topics:

- Arrays
- Linked Lists
- Stacks
- Queues
- Trees
- Heaps
- Graphs
- HashMaps / HashSets
- Tries
- Segment Trees / BIT / Suffix Trees

---

Perfect! Since you want to go topic by topic with first getting the questions only, we’ll now cover Arrays, just like we did with Strings.

We’ll list:

- ✅ 15 Easy Array Questions
- 🟡 15 Medium Array Questions
- 🔴 10 Hard Array Questions

Each item will be a common and frequently asked interview problem focused on Arrays – no code yet, just problem titles as strings, all categorized by difficulty.

# 📗 ARRAY QUESTIONS (Only Arrays)

## ✅ Easy Array Questions (15)

1. "Find the Maximum and Minimum Element in an Array"
2. "Find the Kth Smallest and Largest Element"
3. "Find the Missing Number in 1 to N"
4. "Check if Array is Sorted"
5. "Reverse the Array"
6. "Move All Zeroes to End"
7. "Find the Duplicate Element"
8. "Count Occurrences of a Number"
9. "Remove Duplicates from Sorted Array"
10. "Left Rotate the Array by One Place"
11. "Second Largest Element in Array"
12. "Find Common Elements in Two Arrays"
13. "Find the Frequency of Each Element"
14. "Merge Two Sorted Arrays"
15. "Sort an Array of 0s, 1s, and 2s (Dutch National Flag)"

## 🟡 Medium Array Questions (15)

1. "Kadane's Algorithm - Maximum Subarray Sum"
2. "Find Leaders in an Array"
3. "Find Equilibrium Index of Array"
4. "Find Subarray with Given Sum (Sliding Window)"
5. "Count Inversions in Array"
6. "Merge Intervals"
7. "Rotate Array by K Steps"
8. "Next Permutation"
9. "Majority Element (Boyer-Moore Voting)"
10. "Set Matrix Zeroes"
11. "Product of Array Except Self"
12. "Spiral Traversal of a Matrix"
13. "Find Peak Element"
14. "Largest Sum Contiguous Subarray (Modified Kadane)"
15. "Sort an Array Using QuickSort (or MergeSort)"

## 🔴 Hard Array Questions (10)

1. "Maximum Product Subarray"
2. "Median of Two Sorted Arrays"
3. "Trapping Rain Water"
4. "Subarray Sum Equals K"
5. "Count of Subarrays with XOR = K"
6. "Minimum Swaps to Sort Array"
7. "Merge K Sorted Arrays"
8. "Sliding Window Maximum (Deque or Heap)"
9. "Split Array Largest Sum (Binary Search on Answer)"
10. "Longest Subarray with Equal Number of 0s and 1s"

### ✅ Done with Arrays!

Next in order (per your pipeline) is:

### ➡️ Linked Lists

---

Great! Proceeding next with Linked List 📘.

Here is the categorized list of the most common and frequent Linked List interview questions, structured as:

- ✅ 15 Easy
- 🟡 15 Medium
- 🔴 10 Hard

# 📙 LINKED LIST QUESTIONS

## ✅ Easy Linked List Questions (15)

1. "Reverse a Linked List"
2. "Find the Middle of Linked List"
3. "Detect Loop in a Linked List"
4. "Remove Duplicates from Sorted Linked List"
5. "Print Linked List in Reverse (using Recursion)"
6. "Check if Linked List is Palindrome"
7. "Find Nth Node from End"
8. "Delete a Node (without head pointer)"
9. "Merge Two Sorted Linked Lists"
10. "Find Length of Linked List"
11. "Insert Node at Given Position"
12. "Remove Kth Node from End"
13. "Detect Intersection Point of Two Lists"
14. "Insert Node in Sorted Linked List"
15. "Create Circular Linked List and Detect Circular Structure"

## 🟡 Medium Linked List Questions (15)

1. "Reverse Linked List in Groups of K"
2. "Detect and Remove Loop in Linked List"
3. "Add Two Numbers Represented by Linked Lists"
4. "Flatten a Multilevel Linked List"
5. "Clone a Linked List with Random Pointers"
6. "Reorder List (Rearrange in first-last-first-last order)"
7. "Delete N Nodes After M Nodes"
8. "Rotate Linked List by K Nodes"
9. "Segregate Even and Odd Nodes"
10. "Partition Linked List around a Value"
11. "Sort a Linked List using Merge Sort"
12. "Swap Nodes in Pairs"
13. "Split Circular Linked List into Two Halves"
14. "Remove Duplicates from Unsorted Linked List"
15. "Convert Binary Number in Linked List to Integer"

## 🔴 Hard Linked List Questions (10)

1. "Reverse Nodes in K-Group Recursively"
2. "Merge K Sorted Linked Lists (Using MinHeap)"
3. "Copy List with Random Pointer (Without Extra Space)"
4. "Linked List Cycle II (Find Starting Node of Loop)"
5. "Reverse Alternate K Nodes in Linked List"
6. "Flatten a Linked List with Child Pointers"
7. "Palindrome Linked List (O(1) space optimized)"
8. "Add Numbers Without Modifying Input Lists"
9. "LRU Cache Using Doubly Linked List + HashMap"
10. "Find Intersection Node by Cycle Detection Technique"

### ✅ Done with Linked Lists.

Up next in queue is:

### ➡️ Stacks

---

Awesome! Moving forward in order — we now cover the topic of Stacks 📚 — one of the key structures in DSA interviews.

As per the format, here are:

- ✅ 15 Easy Stack Questions
- 🟡 15 Medium Stack Questions
- 🔴 10 Hard Stack Questions

# 📕 STACK QUESTIONS

## ✅ Easy Stack Questions (15)

1. "Implement Stack using Array"
2. "Implement Stack using Linked List"
3. "Check for Balanced Parentheses"
4. "Reverse a String using Stack"
5. "Find the Length of Longest Valid Parentheses"
6. "Evaluate Postfix Expression"
7. "Push, Pop, Peek Operations in Stack"
8. "Check Redundant Brackets"
9. "Insert at Bottom of Stack (Recursively)"
10. "Sort a Stack using Recursion"
11. "Design Stack that Tracks Minimum Element"
12. "Check Palindrome Sequence using Stack"
13. "Check Duplicate Parentheses in Expression"
14. "Delete Middle Element of Stack (with Recursion)"
15. "Next Greater Element (Naive with Stack)"

## 🟡 Medium Stack Questions (15)

1. "Infix to Postfix Conversion"
2. "Infix to Prefix Conversion"
3. "Evaluate Infix Expression"
4. "Largest Rectangle in Histogram"
5. "Next Greater Element using Stack"
6. "Next Smaller Element using Stack"
7. "Stock Span Problem"
8. "Celebrity Problem (Stack-Based)"
9. "Implement 2 Stacks in an Array"
10. "Sort a Stack using Another Stack"
11. "Reverse Stack using Only Stack Operations"
12. "Postfix to Infix Conversion"
13. "Prefix to Infix Conversion"
14. "Span Problem with Longest Valid Parentheses"
15. "Min Stack with O(1) Space"

## 🔴 Hard Stack Questions (10)

1. "Expression Evaluation with Parentheses and Operators"
2. "Design Stack with getMin(), getMax() in O(1)"
3. "Implement K Stacks in a Single Array"
4. "Max Rectangle in Binary Matrix (using Histogram logic)"
5. "Decode String (Nested Bracketed Pattern like 3[a2[c]])"
6. "Remove K Digits to get Smallest Number"
7. "Smallest Subsequence of Distinct Characters (Monotonic Stack)"
8. "Largest Rectangle under Histogram with All 1s"
9. "Design Stack that Supports Middle Element Retrieval"
10. "Exclusive Time of Functions (Nested Interval Parsing)"

#### ✅ Done with Stacks!

Next in line:

#### ➡️ Queues (and their variations).

---

Awesome! Let's proceed to the next data structure in line — Queues 🔁

As before, here's a carefully curated list of:

- ✅ 15 Easy Queue Questions
- 🟡 15 Medium Queue Questions
- 🔴 10 Hard Queue Questions

# 📗 QUEUE QUESTIONS

## ✅ Easy Queue Questions (15)

"Implement Queue using Array"

"Implement Queue using Linked List"

"Implement Circular Queue"

"Implement Stack using Queue"

"Check if Queue is Empty/Full"

"Reverse a Queue using Stack or Recursion"

"Find Front and Rear Elements in Queue"

"Delete Middle of Queue"

"Interleave First and Second Halves of Queue"

"Check Palindrome using Queue"

"Generate Binary Numbers from 1 to N using Queue"

"Level Order Traversal of Binary Tree using Queue"

"Sum of Elements in Queue"

"Insert Element in Queue without STL"

"Copy Queue without Changing Order"

🟡 Medium Queue Questions (15)
"First Non-Repeating Character in a Stream"

"Implement Deque (Double Ended Queue)"

"Sliding Window Maximum"

"Reverse First K Elements of Queue"

"Rotten Oranges Problem (Multi-source BFS)"

"Distance of Nearest Cell Having 1 in Matrix"

"Circular Tour (Gas Station Problem)"

"LRU Cache using Queue and HashMap"

"Queue Reversal using Deque"

"Job Scheduling with Arrival and Burst Time (Queue Simulation)"

"Implement Priority Queue using Heap"

"Max Queue (O(1) Max Operation)"

"Course Schedule using Queue (Topological Sort BFS)"

"Design Hit Counter (Rate-Limiting Queue)"

"BFS Traversal and Shortest Path in Graph"

🔴 Hard Queue Questions (10)
"Sliding Window Median using 2 Heaps and MultiSet"

"Minimum Time to Inform All Employees (Corporate Hierarchy BFS)"

"Design Task Scheduler with Cooldown Time"

"Design Circular Deque"

"Minimum Number of Refueling Stops"

"Design Double-Ended Priority Queue (DEPQ)"

"Shortest Subarray with Sum ≥ K (Using Monotonic Queue)"

"Number of Islands (Multi-source Queue BFS)"

"Sum of Minimums of All Subarrays (Monotonic Queue)"

"Find Max Sum Submatrix No Larger Than K (BFS Variant)"

✅ Done with Queues! Up next in the knowledge flow:

➡️ Trees 🌳

---

Great! Now let’s continue with the next core data structure: Trees 🌲 — foundational to many DSA problems.

Following the same format as earlier, here’s a categorized list of:

✅ 15 Easy Tree Questions

🟡 15 Medium Tree Questions

🔴 10 Hard Tree Questions

🌳 TREE QUESTIONS
✅ Easy Tree Questions (15)
"Inorder Traversal of Binary Tree (Recursive & Iterative)"

"Preorder Traversal of Binary Tree"

"Postorder Traversal of Binary Tree"

"Level Order Traversal (BFS)"

"Check if a Binary Tree is Balanced"

"Height of a Binary Tree"

"Count the Number of Nodes in a Binary Tree"

"Find Maximum Value in Binary Tree"

"Search an Element in Binary Search Tree (BST)"

"Insert Element in BST"

"Check if Two Trees are Identical"

"Mirror a Binary Tree"

"Sum of All Nodes in Binary Tree"

"Find Minimum Depth of Binary Tree"

"Print All Leaf Nodes of the Tree"

🟡 Medium Tree Questions (15)
"Left View / Right View of Binary Tree"

"Top View / Bottom View of Binary Tree"

"Zigzag Level Order Traversal"

"Lowest Common Ancestor (LCA) in Binary Tree"

"Diameter of Binary Tree"

"Convert Sorted Array to Balanced BST"

"Check if Binary Tree is Symmetric"

"Sum of Left Leaves"

"Path from Root to Given Node"

"Sum of Root to Leaf Numbers"

"Root to Leaf Path with Target Sum"

"Tree to Double Linked List (Inorder Flatten)"

"Find Kth Ancestor of a Node"

"Check if Tree is BST (Valid BST Check)"

"Construct Binary Tree from Inorder and Preorder/Postorder"

🔴 Hard Tree Questions (10)
"Serialize and Deserialize a Binary Tree"

"Vertical Order Traversal of Binary Tree"

"Binary Tree Maximum Path Sum"

"Recover BST if Two Nodes Swap by Mistake"

"Count Nodes Equal to Average of Subtree"

"Find All Duplicate Subtrees"

"Burning Tree Problem (Node Burn Propagation)"

"Kth Smallest Element in Binary Search Tree"

"Flatten Binary Tree to Linked List (Leetcode 114)"

"Binary Tree Cameras (Minimum Monitors Required)"

✅ Done with Trees!
Next topic in your DSA roadmap:
➡️ Heaps (Priority Queues)

---

Great! Let's move on to the next topic in your DSA preparation journey — Heaps / Priority Queues ⛏️

Like before, we’ll go over:

✅ 15 Easy Heap Questions

🟡 15 Medium Heap Questions

🔴 10 Hard Heap Questions

⛏️ HEAP QUESTIONS (Priority Queue-Based)
✅ Easy Heap Questions (15)
"Implement Min Heap from Scratch"

"Implement Max Heap from Scratch"

"Insert and Delete from Heap (Min/Max)"

"Peek Top Element of a Heap"

"Build Heap from Unsorted Array"

"Heapify a Subtree"

"Check if a Given Array is Heap Representable"

"K Largest Elements in an Array (Using Max Heap)"

"K Smallest Elements in an Array (Using Min Heap)"

"Check Min-Heap or Max-Heap Property in Tree"

"Sort a Nearly Sorted (K-Sorted) Array"

"Merge Two Binary Heaps"

"Convert Min Heap to Max Heap"

"Find the Median in a Stream (Naive Approach)"

"Count of Elements Smaller than X using Min Heap"

🟡 Medium Heap Questions (15)
"Kth Largest Element in an Array"

"Kth Smallest Element in an Array"

"Merge K Sorted Arrays (Using Heap)"

"Find Median from Data Stream (Two Heaps)"

"Top K Frequent Elements"

"Reorganize String to Avoid Adjacent Duplicates"

"Sort Characters by Frequency"

"Task Scheduler (CPU Tasks with Cooling Time)"

"K Closest Numbers to Target"

"K Closest Points to Origin"

"Connect N Ropes with Minimum Cost"

"Minimum Cost to Hire K Workers"

"Sliding Window Maximum (Using Heap)"

"Minimum Number of Platforms Needed"

"Least Frequent Element Removal (Using Max Heap)"

🔴 Hard Heap Questions (10)
"Design Twitter (Mini Social Media Feed with Max Heap)"

"Skyline Problem (Use Max Heap of Heights)"

"Trapping Rain Water II (Using Min Heap BFS over Matrix)"

"Find Median in Large Dataset (2-Pointer + Heap based)"

"Smallest Range Covering Elements from K Lists"

"Rearrange Words in Sentence by Lexical Order and Frequency"

"Maximum Sum Combinations (2 Arrays - Top K sums)"

"Find K Pairs with Smallest Sums (From Two Arrays)"

"Maximum Score from Performing K Operations on Array"

"Minimize Deviation in Array (Using Max Heap pattern)"

✅ Done with Heaps / Priority Queues!
Next on your roadmap:

➡️ Graphs 📊

---

Awesome! Let’s move forward to the next foundational DSA category: Graphs 📊 — often considered one of the most crucial and challenging topics in technical interviews.

Here’s the breakdown:

✅ 15 Easy Graph Questions

🟡 15 Medium Graph Questions

🔴 10 Hard Graph Questions

📊 GRAPH QUESTIONS
✅ Easy Graph Questions (15)
"Create Adjacency List Representation of a Graph"

"DFS Traversal of Graph"

"BFS Traversal of Graph"

"Detect Cycle in Undirected Graph (DFS/BFS)"

"Check if Graph is Connected"

"Count Number of Connected Components"

"Find Number of Provinces (Connected Components using DSU or DFS)"

"Check if Graph is Bipartite"

"Clone a Graph (Graph Copy using BFS/DFS)"

"Find Path Between Two Vertices in Undirected Graph"

"Detect Self Loop or Parallel Edges"

"Check Graph is Tree (No cycles + connected)"

"Transpose of a Directed Graph"

"Get All Neighbors of a Node in Graph"

"List All Nodes Reachable from a Source Vertex"

🟡 Medium Graph Questions (15)
"Detect Cycle in Directed Graph (DFS with Rec Stack)"

"Topological Sort (Kahn’s Algorithm – BFS)"

"Topological Sort using DFS Post-order"

"Course Schedule I & II (Cycle + Topo Sort)"

"Number of Islands (DFS/BFS on grid)"

"Rotten Oranges Problem (Multi-source BFS)"

"Shortest Path in Unweighted Graph (BFS)"

"Minimum Steps to Reach Target (Knight Moves – BFS)"

"Word Ladder I (Transform using BFS)"

"Flood Fill Algorithm"

"Surrounded Regions (Flip enclosed O regions)"

"Graph Coloring Using BFS / DFS"

"Check Strongly Connected Components (Kosaraju’s Algorithm)"

"Walls and Gates (Multi-source BFS on Grid)"

"Reconstruct Itinerary from Flight List (Eulerian Path)"

🔴 Hard Graph Questions (10)
"Dijkstra’s Algorithm for Shortest Path"

"Bellman-Ford Algorithm (Negative Weights)"

"Floyd-Warshall All-Pairs Shortest Path"

"Minimum Spanning Tree (Prim’s Algorithm)"

"Minimum Spanning Tree (Kruskal’s + DSU)"

"Number of Distinct Islands using DFS Encoding"

"Alien Dictionary (Topological Sort via Directed Acyclic Graph)"

"Critical Connections in a Network (Tarjan’s Bridge-Finding)"

"Word Ladder II – All Shortest Transformation Paths"

"Path with Maximum Probability (Graph Weighted with Probabilities)"

✅ Done with Graphs!

Next in this DSA roadmap:
➡️ HashMaps / HashSets (Hashing-related questions)

---

Great! Now continuing with the next DSA topic in sequence: HashMaps / HashSets 🔐 — key tools for efficient lookups and frequency-based logic.

Below is the structured list of frequently asked:

✅ 15 Easy Hashing Questions

🟡 15 Medium Hashing Questions

🔴 10 Hard Hashing Questions

🔐 HASHMAP / HASHSET / HASHING QUESTIONS
✅ Easy HashMap/HashSet Questions (15)
"Find the Frequency of Elements in an Array"

"Check if Two Strings are Anagrams using HashMap"

"Find First Repeating Element in Array"

"Find First Non-Repeating Character in String"

"Check for Duplicates in an Array"

"Intersection of Two Arrays (Using HashSet)"

"Find Missing Number Using HashSet/Map"

"Check if a Subarray with Sum Zero Exists"

"Find the Element with Odd Occurrences"

"Count Pairs with Given Sum"

"Group Anagrams Using HashMap"

"Find All Duplicates in Array"

"Count Character Frequency in String"

"Check if Two Arrays are Equal (Ignore Order)"

"Find Elements Occurring More Than N/K Times"

🟡 Medium HashMap/HashSet Questions (15)
"Longest Consecutive Sequence"

"Subarray with Given XOR"

"Find All Subarrays with Zero Sum"

"Four Sum Problem (Using HashMap)"

"Find the Largest Subarray with Equal 0s and 1s"

"Longest Substring Without Repeating Characters"

"Minimum Window Substring with All Characters"

"Check if Array Can Be Divided into Pairs with Equal Sum"

"Check Isomorphic Strings"

"Find All Pairs in Array with Difference = K"

"Smallest Window with All Unique Characters"

"Sort Characters by Frequency"

"Top K Frequent Elements in Array"

"Check If a Sudoku is Valid (HashSet based validation)"

"Count Subarrays with Equal Number of 0s and 1s"

🔴 Hard HashMap/HashSet Questions (10)
"Subarray Sum Equals K (Prefix Sum + HashMap)"

"Longest Palindromic Subsequence (Memo + Map)"

"Concatenated Words Problem"

"Word Ladder II (Convert Words with Buckets via HashMap)"

"Minimum Operations to Reduce X to Zero (Prefix + Map)"

"Find All Starting Indices of Anagrams in a String"

"Count of Distinct Elements in Every K-size Window"

"Minimum Index Sum of Two Lists"

"Count Pairs with XOR in Range [L, R]"

"Longest Subarray with Sum Divisible by K"

✅ Done with Hashing-based (Map/Set) Questions!

Next and final core topic:
➡️ Tries (Prefix Trees), then optionally SegTree / BIT / Suffix structures

---

Perfect! You're progressing steadily 💪
Now we arrive at a particularly powerful data structure used in string and prefix-based problems: Trie (Prefix Tree) 📚🌲

Let’s break this down as:

✅ 15 Easy Trie Questions

🟡 15 Medium Trie Questions

🔴 10 Hard Trie Questions

🌲 TRIE (PREFIX TREE) QUESTIONS
✅ Easy Trie Questions (15)
"Implement Trie (Insert and Search)"

"Search for Word in Trie with Prefix Support"

"Check if a String is a Prefix of Any Word in Trie"

"Insert a List of Words and Find Count of Prefix Matches"

"Find Word Starting with Given Prefix"

"Count Distinct Words in Trie"

"Longest Word in Dictionary (All Prefixes Present)"

"Check if Two Words are One Modification Apart (Trie Variant)"

"Check if String Exactly Exists in Trie"

"Delete Word from Trie"

"Auto-complete Suggestions Based on Prefix (Basic Matching)"

"Check Word Existence with Optional Wildcard ‘.’"

"Find Shortest Prefix that is Unique"

"Find Frequency of Words Using Trie Counts"

"Convert Dictionary Array to Trie"

🟡 Medium Trie Questions (15)
"Design Add and Search Word Data Structure (with . wildcard)"

"Implement Magic Dictionary (1-character edit allowed)"

"Word Search II (Find All Words in 2D Grid using Trie)"

"Replace Words with Root Words (Prefix Matching)"

"Find All Words Matching Prefix from List"

"Find Longest Common Prefix among N Words (Using Trie)"

"Maximum XOR of Two Numbers in Array (Trie-based Bitwise)"

"Sum of All Words in Trie with Prefix X"

"Count Words With Given Prefix"

"Implement Phone Directory Search System"

"Find Shortest Unique Prefix for Every Word"

"Design Contacts Application using Trie"

"Search Suggestions System (Amazon-style Autocomplete)"

"Find Prefix Score of All Words"

"Insert and Find Palindrome Pairs (Advanced Trie Use)"

🔴 Hard Trie Questions (10)
"Implement Word Dictionary with Support for Wildcard (\*)"

"Palindrome Pairs in Array of Words"

"Find Maximum XOR Pair in Array Using Trie (Leetcode 421)"

"Prefix and Suffix Search in One Query (Wrap Trie)"

"Find Number of Equal Prefix-Suffix Pairs (Advanced Prefix Tree)"

"Count of Unique Substrings Using Trie"

"Design File System (Insert and Search Paths Using Trie)"

"Design DNS Resolver using Trie and IP Mapping"

"Dynamic Insert and Longest Prefix Query Combined (Online Queries)"

"XOR Queries over Array with Trie Optimization"

✅ Done with Tries (Prefix Trees)!

Optional Data Structures coming up (advanced, mostly competitive):

🧠 Next up (optional advanced layer):

➡️ Suffix Trees / Suffix Arrays

➡️ Segment Tree / Binary Indexed Tree (Fenwick)

➡️ Disjoint Set Union (Union Find)

---
