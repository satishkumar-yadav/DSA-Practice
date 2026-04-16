/*
  i/p:    int a[] = { 1, 1,1,1, 2, 2, 3, 3, 4, 4, 5, 6, 7, 8, 8, 8, 9, 10 };
  o/p:  1 2 3 4 5 6 7 8 9 10

*/

import java.util.Arrays;

public class RemoveDuplicateElement {
    public static void main(String[] args) {
        int a[] = { 1, 1, 1, 1, 2, 2, 3, 3, 4, 4, 5, 6, 7, 8, 8, 8, 9, 10 };

        int count =0;
        for (int i = 0; i < a.length; i++) {
            if(a[count]!=a[i]){
                count++;
                a[count]=a[i];
            }
        }
        System.out.println(Arrays.toString(a));

        for (int i = 0; i <= count; i++) {
            System.out.print(a[i] + " ");
        }

    }
}
