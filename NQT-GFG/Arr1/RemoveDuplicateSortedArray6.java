
/*
 * link - https://www.geeksforgeeks.org/problems/remove-duplicate-elements-from-sorted-array/1
 * Difficulty : Easy

  You are given a sorted array arr[] containing positive integers. Your task is to remove all duplicate elements from 
  this array such that each element appears only once. Return an array containing these distinct elements in the same 
  order as they appeared.

  Constraints: 
   1 <= arr.size()<= 10^5
   1 <= arr[i] <= 10^6
  
  Examples:
    1.
    Input: arr[] = [2, 2, 2, 2, 2]
    Output: [2]
    Explanation: After removing all the duplicates only one instance of 2 will remain i.e. [2] so modified array will 
    contains 2 at first position and you should return array containing [2] after modifying the array.

    2.
    Input: arr[] = [1, 2, 4]
    Output: [1, 2, 4]
    Explation:  As the array does not contain any duplicates so you should return [1, 2, 4].

 */

import java.util.ArrayList;

public class RemoveDuplicateSortedArray6 {
   static ArrayList<Integer> removeDuplicates(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
       // edge case 
       if(arr.length==0){
        return list;
       }

       //add first element
       list.add(arr[0]);

       for (int i = 1; i < arr.length; i++) {
         if(arr[i] != arr[i-1]){
            list.add(arr[i]);
         }
       }

        return list;
    }


    public static void main(String[] args) {
       // int arr[] = {2,2,2,2,9,2,3,7,2,9,3,5};
        int arr[] = {10, 23, 23, 27, 27, 32, 37, 48, 54, 66, 66, 90, 91, 91};

        System.out.println(removeDuplicates(arr));

    }
}
