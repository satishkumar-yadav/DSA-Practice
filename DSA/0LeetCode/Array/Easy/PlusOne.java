/*
66

You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.

Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
Example 2:

Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].
Example 3:

Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].
 

Constraints:

1 <= digits.length <= 100
0 <= digits[i] <= 9
digits does not contain any leading 0's.

*/

import java.util.Arrays;

public class PlusOne {

    public static int[] plusOne2(int[] digits) {
        int n = digits.length;
        if (digits[n - 1] < 9) {
            digits[n - 1] = digits[n - 1] + 1;
            int res[] = new int[n];
            for (int i = 0; i < n; i++)
                res[i] = digits[i];
            return res;
        } else if (digits[n - 1] == 9) {
            int res[] = new int[n + 1];
            int m = res.length;
            for (int i = 0; i < n - 1; i++)
                res[i] = digits[i];
            res[m - 1] = 0;
            res[m - 2] = 1;
            return res;
        } else
            return digits;
    }

    public static int[] plusOne3(int[] digits) {
     int n = digits.length;
     int res[];
     if(digits[0]==9) { res = new int[n+1];}
     else { res = new int[n];}

     int m=res.length;
     int carry=0, k=1;
     for (int i = n-1, j=m-1; i >= 0; i--,j--) {
        int sum = digits[i]+carry+k;
        if(sum>9){
            res[j] = sum % 10;
            carry = sum / 10;
            k=0;
        }
        else{
            res[j] = sum ;
            k=0;
            carry=0;
        }
        if(i==0 && carry!=0) res[0]=carry;
      }

      return res;
    }    

    public static int[] plusOne(int[] digits){
        // Traverse from last digit
        for (int i = digits.length - 1; i >= 0; i--) {

        // If digit is less than 9,increment and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            // Digit becomes 0, due to carry
            digits[i] = 0;
        }

        // All digits were 9 create new array
        int[] ans = new int[digits.length + 1];
        ans[0] = 1;
        return ans;
    }

    public static void main(String[] args) {
        //int []digits = {1,2,3};
       // int []digits = {9};
       // int []digits = {9,9,9,9}; // 2 fails
        //int []digits = {9,9,9,9,9,9,9,9,9};
        //int []digits = {4,3,2,1,8};
       // int []digits = {0,2,8,6,9};
       // int []digits = {0,9,9,9,9};
        int []digits = {9,8,7,6,5,4,3,2,1,0};  // 3 fails

        System.out.println(Arrays.toString(plusOne(digits)));
    }
    
}