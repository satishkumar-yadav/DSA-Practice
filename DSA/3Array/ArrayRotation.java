import java.util.Arrays;

public class ArrayRotation {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        // Handle cases where k > array length
        k %= n;   //k = k % n  - for handling k>n  i.e. k=12, n=5 ,  k=12%5 = 2
        if (k == 0)
            return;

        // Triple Reversal
        reverse(nums, 0, n - 1); // Reverse all
        reverse(nums, 0, k - 1); // Reverse first k
        reverse(nums, k, n - 1); // Reverse the rest
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int []arr = {2,4,8,6,9};
        int k = 3;
        
        rotate(arr, k);

        System.out.println(Arrays.toString(arr));
    }
}
