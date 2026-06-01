/*
747

*/

class LargestNoAtLeastTwiceOfOther {

    public static int dominantIndex(int[] nums) {
        if (nums == null || nums.length == 0)
            return -1;
        if (nums.length == 1)
            return 0;

        int max = -1;
        int secondMax = -1;
        int maxIndex = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                secondMax = max;
                max = nums[i];
                maxIndex = i;
            } else if (nums[i] > secondMax)
                secondMax = nums[i];
        }

        if (max >= 2 * secondMax)
            return maxIndex;
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {3,6,1,0};
       // int arr[] = {1,2,3,4};

        System.out.println(dominantIndex(arr));
    }

}