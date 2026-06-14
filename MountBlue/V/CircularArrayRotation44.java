import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CircularArrayRotation44 {
    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
        List<Integer> res = new ArrayList<>();

        int n=a.size();
        k %= n;  // Handle cases where k > array length

        //if (k == 0)  return;

        // Triple Reversal
        reverse(a, 0, n - 1); // Reverse all
        reverse(a, 0, k - 1); // Reverse first k
        reverse(a, k, n - 1); // Reverse the rest

        for( int i : queries) {
            res.add(a.get(i));
        }

        // System.out.println(a);

        return res;
    }

    //private static void reverse(int[] nums, int start, int end) {
    private static void reverse(List<Integer> a, int start, int end) {
        while (start < end) {
            int temp = a.get(start);
            a.set(start, a.get(end));
            a.set(end, temp);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(3,4,5);
        List<Integer> q = Arrays.asList(1,2);
        int k=2;

        System.out.println(circularArrayRotation(ls, k, q));
    }
}
