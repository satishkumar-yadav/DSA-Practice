/*
Easy
3658: GCD of Odd and Even Sums
15-July-26

Constraints:

1 <= n <= 10​​​​​​​00

*/

public class EGcdOfOddAndEvenSums {

    public static int gcd(int a, int b) {
        if (b == 0) {
            return Math.abs(a); // Ensure positive result
        }
        return gcd(b, a % b);
    }

    public static int gcdOfOddEvenSums(int n) {
        int sumOdd = 0, sumEven = 0;

        int count =0;
        for (int i = 1; i < 2000; i+=2) {
            if(count==n) break;
            sumOdd += i;
            sumEven += i+1;
            count++; 
        }

        return gcd(sumEven, sumOdd);
    }

    public static void main(String[] args) {
        int n = 4;

        System.out.println(gcdOfOddEvenSums(n));
    }
}
