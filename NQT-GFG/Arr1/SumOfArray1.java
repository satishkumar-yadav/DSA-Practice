/*
 * link - https://www.geeksforgeeks.org/problems/sum-of-array2326/1
 * Difficulty : Basic

  You are given an integer array arr[]. The task is to find the sum of it.

  Constraints:
    1 <= arr.size <= 105
    1 <= arr[i] <= 104
  
  Examples:
    1.
    Input: arr[] = [1, 2, 3, 4]
    Output: 10
    Explanation: 1 + 2 + 3 + 4 = 10.

    2.
    Input: arr[] = [1, 3, 3]
    Output: 7
    Explanation: 1 + 3 + 3 = 7.
 
 */

  package Arr1;

  public class SumOfArray1 
  {
    public  int arraySum(int arr[]) {
          int sum = 0;
          // for(int x:arr){
          // sum +=x;
          // }
          for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
          }
          return sum;
      }

  }