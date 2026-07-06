/*
05-July-26

3,4,7,5,6,2,1

3 4 7 5 6 2 1
3 4 7 5 6 2 1
3 4 5 7 6 2 1
3 4 5 6 7 2 1
2 3 4 5 6 7 1
1 2 3 4 5 6 7

1, 4, 3, 5, 6, 2

Sample Output
1 4 3 5 6 2 
1 3 4 5 6 2 
1 3 4 5 6 2 
1 3 4 5 6 2 
1 2 3 4 5 6 

*/

import java.util.Arrays;
import java.util.List;

public class InsertionSortPart_II96 {

    private static void printList(List<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i));
            if (i < arr.size() - 1)
                System.out.print(" ");
        }
        System.out.println();
    }

    public static void insertionSort2(int n, List<Integer> arr) {
        // loop for unsorted array
        for (int i = 1; i < n; i++) {
            int j = i - 1;
            int key = arr.get(i);
            // loop for sorted array 
            while (j >= 0 && key < arr.get(j)) {
                arr.set(j+1, arr.get(j));
                j--;
            }
            arr.set(j+1, key);
            printList(arr);
        }

    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, 4, 3, 5, 6, 2);
        int n = arr.size();

        insertionSort2(n, arr);
    }
    
}