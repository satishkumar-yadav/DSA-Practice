/*
229 : Majority Element II  - print element which appears more than n/3 in an array
21-Jun-26

Constraints:

1 <= nums.length <= 5 * 10^4
-10^9 <= nums[i] <= 10^9
 

Follow up: Could you solve the problem in linear time and in O(1) space?

we can return max two element

Boyer-Moore Majority Voting Algorithm.
 - This algorithm can be used to return the highest K elements that appeared in the array more than 
   array_size/(K+1) times. In our case, K = 2.

- The major Intuition behind this algorithm is that maintaining voting variable for the candidates:
    - Increase the variable if you faced the candidate in your iteration.
    - Decrease the variable if you faced another element.
    - If the variable reaches 0, look for another promising candidate.  

    

*/

import java.util.ArrayList;
import java.util.List;

public class MajorityElementII {
     public static List<Integer> majorityElement(int[] nums) {
        List<Integer> ls  = new ArrayList<>();
         int n = nums.length;  //3
         int m = Integer.MAX_VALUE;

      for(int i=0; i<=n-1; i++){  // 0*          1           2
           int count=1;            //1
         if(nums[i]==m) continue; 
         for(int j=i+1; j<n; j++){   // 1                  2
            if(nums[i]==nums[j]) {   //nums[0]=nums[1]     //nums[0]=nums[2]
                count++;            // 2                   //3
                nums[j]=m;
            }
         } 

         if(count>n/3) ls.add(nums[i]);

      }
        return ls;
    }

    public static void main(String[] args) {
       // int []nums = {3,2,3};  // [3]
       // int[] nums = { 1 }; // [1]
       // int[] nums = { 1,2 }; // [1,2]
       // int []nums = {0,0,0};  // [0]
       // int nums[] = {1, 1, 1, 2, 2, 2, 4, 4, 4}; //Answer  = []
          int []nums = {1,2,2,3,1,3,3,1,2};

        System.out.println(majorityElement(nums));
    }
}
