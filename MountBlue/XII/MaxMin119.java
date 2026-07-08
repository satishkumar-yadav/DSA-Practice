/*
07-July-26
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxMin119 {
    public static int maxMin(int k, List<Integer> arr) {
      //convert the dynamic list into primitive array for high performance
      int n = arr.size();
      int[] num = new int[n];
      for (int i = 0; i < n; i++) num[i] = arr.get(i);

      Arrays.sort(num); //sorting array in ascending order
      int minUnfairness = Integer.MAX_VALUE;

      //use a sliding window of size k, last valid window starts at index(n-k)
      for (int i = 0; i <= n-k ; i++) {
          int currMin = num[i];
          int currMax = num[i+k-1];
          int currUnfairness = currMax-currMin;
          if(currUnfairness<minUnfairness) minUnfairness = currUnfairness;
      }

      return minUnfairness;
    }
    
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(1,4,7,2));
        int k =2;

        System.out.println(maxMin(k, arr));
    }
}