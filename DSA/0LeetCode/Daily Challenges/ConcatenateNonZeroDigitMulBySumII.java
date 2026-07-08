/*
Medium
3756: Concatenate Non Zero Digits and Multiply by Sum II
08-July-26
*/

import java.util.Arrays;

public class ConcatenateNonZeroDigitMulBySumII {

    //TLE
    private static int sumAndMultiply(long n) {
        long x = 0;  int i = 1;
        while (n > 0) {
            long digit = n % 10;
            if (digit != 0) {
                x = (digit * i) + x;
                i *= 10;
            }
            n /= 10;
        }
        long m = x; int sum = 0;
        while (m > 0) {
            sum += m % 10;
            m /= 10;
        }
        long ans = (x * sum) % 1000000007 ;
        // (int) (ans = (ans+"".length()>9) ? (ans % ((int)Math.pow(10, 9)+7)) : ans);
        // (int) (ans = (ans + "".length() > 9) ? (ans % 1000000007) : ans);
        return (int) ans ;
    }
//TLE
    public static int[] sumAndMultiply2(String s, int[][] queries) {
        int n = queries.length;  int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            long num = Long.parseLong(s.substring(queries[i][0], queries[i][1]+1));
            answer[i] = sumAndMultiply(num);
        }
        return answer;
    }

    //optimal solution
    public static int[] sumAndMultiply(String s, int[][] queries) {
       int n = s.length();
       int MOD = 1_000_000_007;

       //precompute powers of 10 modulo 10^9+7
       long[] pow10 = new long[n+1];
       pow10[0] = 1;
       for (int i = 1; i <=n ; i++) pow10[i] = (pow10[i-1]*10) % MOD;
       
       //prefix arays
       long[] sumD = new long[n+1];   // prefix sum of digits
       int[] cntN0 = new int[n+1];  // prefix count of non-zero digits
       long[] p = new long[n+1];  // prefix concatenated number mod 10^9 + 7

       for (int i = 0; i < n; i++) {
         int digit = s.charAt(i)-'0';
         sumD[i+1] = sumD[i] + digit;
         cntN0[i+1] = cntN0[i] + (digit != 0 ? 1 : 0);
         if(digit != 0) p[i+1] = (p[i]*10 + digit) % MOD;
         else p[i+1] = p[i];  // zeroes do not append to non-zero concat
       }
       
       int[] answer = new int[queries.length];
       for (int i = 0; i < queries.length; i++) {
        int l = queries[i][0];
        int r = queries[i][1];
        long currSum = sumD[r+1] - sumD[l];  // cal sum of digits in s[l,r]
        int nonZeroCount = cntN0[r+1] - cntN0[l];  // cal no of non-zero digit in s[l,r]
        //Isolate the value of x formed by s[l,r]
        long x = (p[r+1]- (p[l]*pow10[nonZeroCount]) % MOD + MOD) % MOD;
        //multiply x by its digit sum
        answer[i] = (int) ((x*currSum) % MOD);
       } 

       return answer;
    }    

    public static void main(String[] args) {
        String s= "58578833985";
        int[][] queries = {{0,0},{0,1},{0,2},{0,3},{0,5},{0,7},{0,8},{0,9},{0,10},{1,1},{1,2},{1,3},{1,5},
        {1,6},{1,8},{1,9},{1,10},{2,2},{2,3},{2,4},{2,6},{2,7},{2,8},{2,9},{2,10},{3,5},{3,6},{3,7},{3,8},
        {3,9},{4,4},{4,5},{4,6},{4,7},{4,9},{4,10},{5,6},{5,7},{5,8},{5,9},{5,10},{6,6},{6,7},{6,8},{6,9},
        {7,7},{7,9},{7,10},{8,8},{8,9},{8,10},{9,9},{9,10},{10,10}};

        System.out.println(Arrays.toString(sumAndMultiply(s, queries)));
    }
}
