
/*
  // Perfect Number - 507  //submitted

  Definition :  a perfect number is a positive integer that is equal to the sum of its positive proper divisors, 
  that is, divisors excluding the number itself.

A perfect number is a positive integer that is equal to the sum of its positive divisors, 
excluding the number itself. A divisor of an integer x is an integer that can divide x evenly.

Given an integer n, return true if n is a perfect number, otherwise return false.

 Constraints:
1 <= num <= 108

Example 1:

Input: num = 28
Output: true
Explanation: 28 = 1 + 2 + 4 + 7 + 14
1, 2, 4, 7, and 14 are all divisors of 28.
Example 2:

Input: num = 7
Output: false
 
*/

public class PerfectNumber {
    public static boolean checkPerfectNumber(int num) {
      if(num<1) return false;
      int sum=0; 
      for (int i = 1; i <=num/2 ; i++) {
          if(num % i == 0) sum+=i;
       }
       return num==sum;
    }

    public static void main(String[] args) {
      int num= -1;
      boolean perfect = checkPerfectNumber(num);
      if(perfect) System.out.println("Perfect Number");
      else System.out.println("Not perfect number");
    }
}
