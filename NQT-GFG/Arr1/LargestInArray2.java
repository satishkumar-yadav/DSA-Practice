
/*
 * link - https://www.geeksforgeeks.org/problems/largest-element-in-array4009/1
 * Difficulty : Basic

  Given an array arr[]. The task is to find the largest element and return it.

  Constraints:
   1 <= arr.size()<= 10^6
   0 <= arr[i] <= 10^6
  
  Examples:
    1.
    Input: arr[] = [1, 8, 7, 56, 90]
    Output: 90
    Explanation: The largest element of the given array is 90.

    2.
    Input: arr[] = [5, 5, 5, 5]
    Output: 5
    Explanation: The largest element of the given array is 5.

    3.
    Input: arr[] = [10]
    Output: 10
    Explanation: There is only one element which is the largest.
 
 */

package Arr1;

public class LargestInArray2 {
    public static int largest(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
       int large = arr[0];
       for (int num : arr) {   
          if(num>large) large=num;
       }
    // for (int i = 0; i < arr.length; i++) {
    //     if (arr[i] > large)
    //         large = arr[i];
    // }
       return large;
    }
}
