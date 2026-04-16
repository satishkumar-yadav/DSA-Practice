
/*


*/

import java.util.Arrays;

public class RemoveDuplicateElement {
    public static void main(String[] args) {
        int a[] = { 1, 1,1,1, 2, 2, 3, 3, 4, 4, 5, 6, 7, 8, 8, 8, 9, 10 };
        int n = a.length;

       int c=0;
       
        for (int i = 1; i < n; i++) {
          if(a[c]!=a[i]){
            c++;
            a[c] = a[i];
          }
        }

        System.out.println(Arrays.toString(a));

        for (int i = 0; i <= c; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
