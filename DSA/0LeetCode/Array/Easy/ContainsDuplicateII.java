/*
219 

Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.

Example 1:

Input: nums = [1,2,3,1], k = 3
Output: true

Example 2:
Input: nums = [1,0,1,1], k = 1
Output: true

Example 3:
Input: nums = [1,2,3,1,2,3], k = 2
Output: false

Constraints:

1 <= nums.length <= 10^5
-10^9 <= nums[i] <= 10^9
0 <= k <= 10^5

*/

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicateII {

    // time limit exceed
    public static boolean containsNearbyDuplicate2(int[] nums, int k) {
          for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
               if(nums[i]==nums[j] && (Math.abs(i-j)<=k)) return true;                
            }
          }
          return false;
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
      Set<Integer> set = new HashSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            // Remove the element that is now outside the window
            if (i > k) {
                set.remove(nums[i - k - 1]);
            }
            
            // Try to add the current element. If it fails, a duplicate exists.
            if (!set.add(nums[i])) {
                return true;
            }
        }
        
        return false;

    }    

    public static void main(String[] args) {
        int []nums = {1,0,1,1};
        int k=1;

        System.out.println(containsNearbyDuplicate(nums, k));
    }
}