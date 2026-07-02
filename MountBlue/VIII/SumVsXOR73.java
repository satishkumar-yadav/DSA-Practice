/*
01-July-26
*/

public class SumVsXOR73 {
    //TLE  O(n)  - 10^15
     public static long sumXor2(long n) {
        int count=0;
        for (int i = 0; i <=n ; i++) if((n+i)==(n^i)) count++;

        return count;
    }

    // O(logn) = 50 times maximum for 10^15 size
    public static long sumXor(long n) {
       //Base Case: if n=0, only valid i is 0 (2^0=1)
       if(n==0) return 1;

       long zeroCount=0;
       //looping through bits of n until it becomes 0
       while (n>0) {
         //if last bit is 0, increment count
         if((n&1)==0) zeroCount++;
         //right shift n by 1 to check next bit
         n >>=1;
       }

       //returning 2 raised to the power of zeroCount
       //1L <<zeroCount is ultra-fast way to compute Math.pow(2,zeroCount) for long values
       return 1L <<zeroCount;
    }   

    public static void main(String[] args) {
        long n = 10;

        System.out.println(sumXor(n));
    }
    
}