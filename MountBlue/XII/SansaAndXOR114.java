/*
07-July-26
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SansaAndXOR114 {
    public static int sansaXor(List<Integer> arr) {
       int n = arr.size();

       //if n is even, all elements appear an even no of times , Freq = (i+1)*(n-i) subarray, and cancel out each other in xor
       if(n%2==0) return 0;
       
       //if n is odd, only elements at even indices matter
       int xorSum=0;
       for (int i = 0; i < n; i+=2) xorSum ^= arr.get(i);

       return xorSum;
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3));

        System.out.println(sansaXor(arr));
    }
}