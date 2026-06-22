/*
Day 1 : 20-Jun-26


*/

import java.util.List;

public class PlusMinus {
    public static void plusMinus(List<Integer> arr) {
        int l= arr.size();
        int p =0;
        int n= 0;
        int z=0;

        for (int a : arr) {
            if(a>0) p++;
            else if(a==0) z++;
            else n++;
        }

        System.out.printf("%.6f\n",(float)p/l);
        System.out.printf("%.6f\n",(float)n/l);
        System.out.printf("%.6f\n",(float)z/l);
    }

    public static void main(String[] args) {
    //     List<Integer> arr = Arrays.asList(1,1,0,-1,-1);
    //    plusMinus(arr);

       
    }
}
