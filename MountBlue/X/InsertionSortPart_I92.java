/*
04-July-26

Constraints
1<= n <= 1000
-10000<=arr[i]<=10000

n=5
arr = [1,2,4,5,3]

Start at the rightmost index. Store the value of arr[4]=3 . Compare this to each element to the left until a smaller value is reached. Here are the results as described:

1 2 4 5 5
1 2 4 4 5
1 2 3 4 5

-----
5
2 4 6 8 3

2 4 6 8 8 
2 4 6 6 8 
2 4 4 6 8 
2 3 4 6 8 

Explanation

3 is removed from the end of the array.
In the 1st line 8>3, so 8 is shifted one cell to the right.
In the 2nd line 6>3, so 6 is shifted one cell to the right.
In the 3rd line 4>3, so 4 is shifted one cell to the right.
In the 4th line 2<3, so 3 is placed at position 1.


*/

import java.util.List;

public class InsertionSortPart_I92 {
    public static void insertionSort1(int n, List<Integer> arr) {
    // Write your code here

    }
    
}