/*
    // Pallindrome Number - 9  // submitted

Given an integer x, return true if x is a palindrome, and false otherwise.

 Constraints:
-231 <= x <= 231 - 1
 
Follow up: Could you solve it without converting the integer to a string?

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.

Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 
*/

class Pallindrome
{
    public static boolean isPalindrome(int x) {
        int rev=0;
        int n=x;
        while(n>0){
            rev=(rev*10) +(n%10);
            n/=10;
        }
        return (rev==x);
    }

    public static void main(String []args){
        int n = -121;
        if(isPalindrome(n)) System.out.println("Palindrome Number");
        else System.out.println("Not Palindrome Number");
        
    }
}