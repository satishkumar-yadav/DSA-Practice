/*
05-July-26
*/

import java.util.Arrays;
import java.util.List;

public class LargestPermutation100 {
    public static List<Integer> largestPermutation(int k, List<Integer> arr) {
        int n = arr.size();

        //create an index lookup map,  pos[x] will store current array index of number x
        int[] pos = new int[n+1];
        for (int i = 0; i < n; i++) pos[arr.get(i)] = i;
            
        //Greedily place the largest possible numbers at the beginning
        for (int i = 0; i < n && k>0; i++) {
            int expectedValue = n-i;
            //if current element is already the maximum possible value, skip it
            if(arr.get(i)==expectedValue) continue;

            //find where the expected value is currently sitting
            int targetIndex = pos[expectedValue];
            int currentValue = arr.get(i);

            //perform swap in original list
            arr.set(targetIndex, currentValue);
            arr.set(i, expectedValue);

            //update position in our lookup map to reflect the swap
            pos[currentValue] = targetIndex;
            pos[expectedValue] = i;

            k--;  //consume one swap operation
        }

        return arr;
    }
    
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1,2,3,4);
        int k = 9;

        System.out.println(largestPermutation(k, arr));
    }
}