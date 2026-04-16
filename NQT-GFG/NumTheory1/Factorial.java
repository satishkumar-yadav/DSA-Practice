/*
link : https://www.geeksforgeeks.org/problems/factorial5739/1
Difficulty: Basic
Constraints: 0 ≤ n ≤ 12

Given a positive integer, n. Find the factorial of n.

Examples :
Input: n = 5
Output: 120
Explanation: 1 x 2 x 3 x 4 x 5 = 120

Input: n = 4
Output: 24
Explanation: 1 x 2 x 3 x 4 = 24

*/

public class Factorial {
    // Function to calculate factorial of a number.

  static int factRecursion(int n, int fact){
   if(n==1) return fact;
   fact *= n;
   return factRecursion(n-1, fact);
  }  

  static int factRecursion(int n){
    return factRecursion(n,1);
  }

   static int factorial(int n) {
        int fact = 1;
        for(int i=1; i<=n; i++) fact *= i;
        return fact;
    }

    public static void main(String[] args) {
        int n=5;
        System.out.println(factorial(n));
        System.out.println(factRecursion(n));
    }
}
