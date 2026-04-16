/*
a: [1,3,4,5]
b: [2,4,3,1]

o/p: [1,3,4,5,2,4,3,1]

*/

import java.util.Arrays;

public class MergeTwoArray {
    public static void main(String[] args) {
        int a[] = { 1, 3, 4, 5 };
        int b[] = { 2, 4, 3, 1, 8, 9 };
        int m= a.length;
        int n= b.length;
        int c[] = new int[m+n];

        int c1=0, c2=0;
        for (int i = 0; i < c.length; i++) {
            if(c1<m) c[i] = a[c1++];
            else 
                c[i] = b[c2++];
        }

       System.out.println(Arrays.toString(c)); 
    }
}
