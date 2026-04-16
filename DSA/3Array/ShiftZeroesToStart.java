import java.util.Arrays;

public class ShiftZeroesToStart {
    public static void main(String[] args) {
        int a[] = { 0, 2, 0, 4, 0, 3 };
        int b[] = new int[a.length];
        int count =b.length-1;

        for (int i = a.length-1; i >= 0; i--) {
            if(a[i]!=0)
                b[count--]=a[i];
        }  

        System.out.println(Arrays.toString(b));
    }
}
