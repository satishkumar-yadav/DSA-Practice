/*
Easy
3754: Concatenate Non Zero Digits and Multiply by Sum
07-July-26
*/

public class ConcatenateNonZeroDigitMulBySum {
    public static long sumAndMultiply(int n) {
       int x = 0;
       int i =1;
       while (n>0) {
         int digit = n % 10;
         if(digit != 0) {
            x = (digit*i) + x;
            i *= 10;
         } 
         n /= 10;   
       }
        
       int m =x;
       int sum = 0;
       while (m>0) {
           sum += m%10;
           m /= 10;
       }
       System.out.println("x: "+x+", sum: "+sum);
       return (long)x*sum;
    }
    
    public static void main(String[] args) {
        int n = 65463628 ;   // 10203004 - 12340       // 1000  - 1
        
        System.out.println(sumAndMultiply(n));
    }
}