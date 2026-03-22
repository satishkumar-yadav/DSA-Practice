/*
  // Happy Number - 202  // submitted

Write an algorithm to determine if a number n is happy.

A happy number is a number defined by the following process:

Starting with any positive integer, replace the number by the sum of the squares of its digits.
Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy.
Return true if n is a happy number, and false if not.

 Constraints:
1 <= n <= 231 - 1

Example 1:

Input: n = 19
Output: true
Explanation:
1^2 + 9^2 = 82
8^2 + 2^2 = 68
6^2 + 8^2 = 100
1^2 + 0^2 + 0^2 = 1
Example 2:

Input: n = 2
Output: false


*/



public class HappyNumber {
    public static boolean isHappy(int n) {
        int sum=0;
        while (n>0) {
            sum+= (n%10)*(n%10);
            n/=10;
            if(n==0 && (sum!=1 && sum!=4)){
                n=sum;
                sum=0;
            }
        } 
        
        return sum==1;
    }

    public static void main(String[] args) {
        //int num=19;
        //int num=1111111;
        int num=2;
        if(isHappy(num)) System.out.println("Happy Number");
        else System.out.println("Not Happy Number");
    }
}
