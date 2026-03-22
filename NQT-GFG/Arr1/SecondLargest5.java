
/*
 * link - https://www.geeksforgeeks.org/problems/second-largest3735/1
 * Difficulty : Easy

  Given an array of positive integers arr[], return the second largest element from the array. If the second largest element doesn't exist then return -1.

Note: The second largest element should not be equal to the largest element.

  Constraints: 
   2 <= arr.size()<= 10^5
   1 <= arr[i] <= 10^5
  
  Examples:
    1.
    Input: arr[] = [12, 35, 1, 10, 34, 1]
    Output: 34
    Explanation: The largest element of the array is 35 and the second largest element is 34.

    2.
    Input: arr[] = [10, 5, 10]
    Output: 5
    Explanation: The largest element of the array is 10 and the second largest element is 5.

    3.
    Input: arr[] = [10, 10, 10]
    Output: -1
    Explanation: The largest element of the array is 10 and the second largest element does not exist.
 
 */

public class SecondLargest5 {
    public static int getSecondLargest(int[] arr) {
       int largest = arr[0];
       int secLargest = -1;

       for (int i = 0; i < arr.length; i++) {
       if (arr[i] > largest & largest)
       largest = arr[i];
       else if (largest > secLargest)
       secLargest = largest;
       }
       
       return secLargest ;
 
    }

    public static void main(String[] args) {
      int arr[] = {12, 35, 1, 10, 34, 1};
 
       System.out.println(getSecondLargest(arr));
    }
}
