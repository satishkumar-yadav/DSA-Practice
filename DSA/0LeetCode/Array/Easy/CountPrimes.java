/*
    Count Primes - 204 

Given an integer n, return the number of prime numbers that are strictly less than n.

 Constraints:
0 <= n <= 5 * 10^6

Example 1:

Input: n = 10
Output: 4
Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.

Example 2:

Input: n = 0
Output: 0

Example 3:

Input: n = 1
Output: 0
 
Prime Numbers : 2,3,5,7,11,13,
*/

public class CountPrimes {
    public static int countPrimes(int n) {   // has time complexity of n^2
       int count=0;
       if(n<2) return count;
       for (int i = 2; i < n; i++) {
          boolean flag=true;
          for (int j = 2; j <= (i/2); j++) {
            if(i % j ==0) 
                {
                    flag = false;
                    break;
                }
          }
          if(flag) 
              count++;
            
       }
       return count;
    }

    /* 
     public static int countPrimes(int n) {  // time complexity n log logn
        if(n<=2) return 0;

        // Create a boolean array "isPrime[0..n]" and initialize all entries it as true.
        boolean [] isPrime = new boolean[n];
        for(int i=2; i<n; i++) isPrime[i] =true;

        //Sieve of Eratosthenes
        for (int p = 2; p*p < n; p++) {
            // is isPrime[p] is not changed then it is prime
            if(isPrime[p]){
                // Update all multiples of p starting from p*p
                for (int i = p*p; i < n; i+=p) {
                    isPrime[i]=false;
                }
            }
        }

        // Count remaining true values
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i])
                count++;
        }

        return count;
     }
*/


//    public static int countPrimes(int n)
//    {  
//        int count = 0;
//       for (int i = 1; i < n; i++) {
          
//           if(i<=n/2){
//             if((n%i !=0) && i<=n/2) count++;  
//           }
          
//       }
//       return count;
//    }
     

    public static void main(String[] args) {
       // int num= 499979;
        int num = 10;
        int n = countPrimes(num);
        System.out.println("\t"+n);
    }
}
