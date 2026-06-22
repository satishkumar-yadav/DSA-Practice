/*

Explaining Count sort in java with dry run, explanation, visualization and examples

Counting Sort : non-comparison sorting algorithm. Counts how many times each number occurs.

"Count Sort sorts integers by counting the frequency of each element and reconstructing the array without 
 performing element comparisons. "

Works best when : - numbers are integers.  - The range of numbers is small

Examples with Dry Run/ Working :

Array = [4,2,2,8,3,3,1]

Step 1: find max element
     max = 8;
     - create a count array of size (max+1)
     count = [0,0,0,0,0,0,0,0,0]
              0 1 2 3 4 5 6 7 8
     
Step 2: Count frequencies     
     Traverse the original array
    - Read 4
       count[4]++;
       count = [0,0,0,0,1,0,0,0,0]
    - Read 2
       count[2]++;
       count = [0,0,1,0,1,0,0,0,0]  
    - Read 2
       count[2]++;
       count = [0,0,2,0,1,0,0,0,0]
    - Read 8
       count[8]++;
       count = [0,0,2,0,1,0,0,0,1]
    - Read 3
       count[3]++;
       count = [0,0,2,1,1,0,0,0,1]
    - Read 3
       count[3]++;
       count = [0,0,2,2,1,0,0,0,1]
    - Read 1
       count[1]++;
       count = [0,1,2,2,1,0,0,0,1]

  Visualization       
        count = 0,1,2,2,1,0,0,0,1
        index = 0 1 2 3 4 5 6 7 8
  Meaning 
       1 appears 1 time
       2 appears 2 times
       3 appears 2 times
       4 appears 1 time
       8 appears 1 time 
       
Step 3: Build the Sorted array
     start from index 0 to 8
     count[1] = 1
     Sorted = [1]   

     count[2] = 2
     Sorted = [1,2,2]

     count[3] = 2
     Sorted = [1,2,2,3,3]  

     count[4] = 1
     Sorted = [1,2,2,3,3,4]

     count[8] = 1
     Sorted = [1,2,2,3,3,4,8]  

     Final Answer : 
     [1,2,2,3,3,4,8]  

Dry Run Table : 
    Element Read    Count Array
    4               [0,0,0,0,1,0,0,0,0]
    2               [0,0,1,0,1,0,0,0,0]
    2               [0,0,2,0,1,0,0,0,0]
    8               [0,0,2,0,1,0,0,0,1]
    3               [0,0,2,1,1,0,0,0,1]
    3               [0,0,2,2,1,0,0,0,1]
    1               [0,1,2,2,1,0,0,0,1]     

Visual Flow            0 1 2 3 4 5 6
     Original Array : [4,2,2,8,3,3,1]
                |
                v        0 1 2 3 4 5 6 7 8
     Count Frequencies: [0,1,2,2,1,0,0,0,1]
                |
                v         0 1 2 3 4 5 6
     Reconstruct Array : [1,2,2,3,3,4,8]
     
Time Complexity :
    Case        Complexity
    Best        O(n+k)
    Average     O(n+k)
    Worst       O(n+k)

    n=number of elements
    k=maximum value in the array

Space Complexity : O(k)
        because we create a count array of size (max+1)

*/

import java.util.Arrays;

public class CountingSort {
    public static void countingSort(int[] arr){
        int max= arr[0];

        //finding max element
        for (int i = 1; i < arr.length; i++)  if(arr[i]>max) max=arr[i];

        //create count array
        int[] count = new int[max+1];
    
        //counting frequency of each element
        for (int a : arr) count[a]++;
        
        //build sorted array
        int index = 0;

        for (int i = 0; i < count.length; i++) {
            while (count[i]>0) {
                arr[index]=i;
                index++;
                count[i]--;
            }
        }
        
    }

    public static void main(String[] args) {
        int[] arr = {4,2,2,8,3,3,1};
        System.out.println(Arrays.toString(arr));

        countingSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
