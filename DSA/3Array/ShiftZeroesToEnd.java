import java.util.Arrays;

public class ShiftZeroesToEnd {
   public static void main(String[] args) {
     int a[] = { 0, 2, 0, 4, 0, 3 };
        int b[] = new int[a.length];
        int count =0;

        for (int i = 0;i<a.length;i++) {
            if(a[i]!=0)
                b[count++]=a[i];
        }  

        System.out.println(Arrays.toString(b));
    }
      
}
