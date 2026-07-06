/*
05-July-26

Constraints
1<= n <= 1000
-10000<=arr[i]<=10000

n=5
arr = [1,2,4,5,3]

Start at the rightmost index. Store the value of arr[4]=3 . Compare this to each element to the left until 
a smaller value is reached. Here are the results as described:

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

import java.util.Arrays;
import java.util.List;

public class InsertionSortPart_I92 {

    //helper method to print the list separated by spaces, without square brackets
    private static void printList(List<Integer> arr){
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i));
            if (i<arr.size()-1) System.out.print(" ");
        }
        System.out.println();
    }

    public static void insertionSort1(int n, List<Integer> arr) {

        //solution as per requirement
        int targetIndex = n-1;
        int temp = arr.get(targetIndex);
        int j = targetIndex-1;

        //shifting element to right as long as they are greater than temp
        while (j>=0 && arr.get(j)>temp) {
            arr.set(j+1, arr.get(j));
            printList(arr);
            j--;
        }

        //placing temp into its correct sorted position
        arr.set(j+1, temp);
        printList(arr);

       // loop for unsorted array
        // for (int i = arr.size()-1; i >=0 ; i--) {
        //     int j = i-1;
        //     int temp = arr.get(i);
        //     //loop for sorted array
        //     while (j >= 0 && temp < arr.get(j)) {
        //         arr.set(j + 1, arr.get(j));
        //         System.out.println(arr);
        //         j--;
        //     }
        //     arr.set(j + 1, temp);
        // }
        // System.out.println(arr);

        //loop for unsorted array , insertion sort from start
        // for (int i = 1; i < arr.size(); i++) {
        //     int j = i-1;
        //     int temp = arr.get(i);
        //     //loop for sorted array 
        //     while(j>=0 && temp<arr.get(j)) {
        //         arr.set(j+1, arr.get(j));
        //         j--;
        //     }
        //     System.out.println(arr);
        //     arr.set(j+1, temp);
        //     System.out.println("pass: "+i+", j: "+(j+1)+" -> "+arr);
        //     System.out.println();
        // }

        // loop for unsorted array  ,  insertion sort from back
        // for (int i = arr.size()-2; i >=0; i--) {
        //     int j = i + 1;
        //     int temp = arr.get(i);
        //     // loop for sorted array
        //     while (j <arr.size() && temp > arr.get(j)) {
        //         arr.set(j - 1, arr.get(j));
        //         j++;
        //     }
        //     System.out.println(arr);
        //     arr.set(j - 1, temp);
        //     System.out.println("pass: " + i + ", j: " + (j + 1) + " -> " + arr);
        //     System.out.println();
        // }
    }
    
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, 2, 4, 5, 3 );  //  1,2,4,5,3    // 2, 4, 6, 8, 3    // 9,2,7,1,6

        insertionSort1(5, arr);
    }
}