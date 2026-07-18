/*
Easy
1979: Find Greatest Common Divisor Of Array
18-July-26

Constraints:
2 <= nums.length <= 1000
1 <= nums[i] <= 1000

*/

import java.util.Arrays;

public class EFindGreatestCommonDivisorOfArray {

    // Slow 6ms 
    public static int getGCD2(int a, int b) {
        if (b == 0) {
            return Math.abs(a); // Ensure positive result
        }
        return getGCD2(b, a % b);
    }

    public static int findGCD2(int[] nums) {
       Arrays.sort(nums);
       int smallest = nums[0];
       int largest = nums[nums.length-1];
       int gcd = getGCD2(smallest,largest);

       return gcd;
    }

    //////////
    
    //0ms
    public static int findGCD(int[] nums) {
        int min = nums[0];
        int max = nums[0];

        // Step 1: Find min and max in one pass
        for (int num : nums) {
            if (num < min)
                min = num;
            if (num > max)
                max = num;
        }

        // Step 2: Calculate GCD of min and max
        return gcd(min, max);
    }

    // Euclidean Algorithm
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
       // int [] nums = {2,5,6,9,10};
       // int [] nums = {7,5,6,8,3};
        int [] nums = {3,3};

       System.out.println(findGCD(nums));
    }
}
