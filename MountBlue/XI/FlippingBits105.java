/*
06-July-26
*/

public class FlippingBits105 {
    //not solved
    public static long flippingBits2(long n) {

        //long - bin
        long bin =0;
        long m = n;
        int i = 1;
        while (m>0) {
            int bit = (int) m % 2;
           // bit = (bit==0) ? 1 : 0;
            bin = bit*i + bin;
            System.out.println("bin: "+bin+", bit: "+bit);
            m /= 2;
            i *= 10;
        }
        System.out.println("fin bin: "+bin);
        int len = String.valueOf(bin).length();
        System.out.println(len);

        System.out.println("1'C of bin: "+(~bin));

        //bin = long
        long l = 0;
        int j = 1;
        while (bin>0) {
            int bit = (int) bin % 10;
            l += bit*j;
            System.out.println("Long: " + l + ", bit: " + bit);
            bin /= 10;
            j *= 2;
        }
        System.out.println("fin Long: "+l+", bin: "+bin);


        return l;
    }
    
    public static long flippingBits(long n) {
        //~n ; flips all bits 
        // & 0xFFFFFFFFL : 32-bitmask(consist exactly 32 1's) strips away higher sign bits, forcing a 32-bit 
        // unsigned format
        return (~n) & 0xFFFFFFFFL;

        /*
        Alternative:
        long maxUnsignedInt = 4294967295L;    //equal to 2^32 - 1
        return maxUnsignedInt - n;
        */
    }

    public static void main(String[] args) {
        long n = 9;

       // System.out.println(flippingBits(n));

       int b = 100;
       int a = ~b;

       System.out.println(a);
    }
}