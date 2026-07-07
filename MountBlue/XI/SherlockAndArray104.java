/*
06-July-26
*/

import java.util.Arrays;
import java.util.List;

public class SherlockAndArray104 {
   public static String balancedSums(List<Integer> arr) {
      int n = arr.size();

      int[] fwSum = new int[n];
      int[] bwSum = new int[n];

      for (int i = 0; i < n; i++) {
        if(i==0){
            fwSum[0]=arr.get(0);
            bwSum[n-1-i] = arr.get(n-1);
        }
        else{
            fwSum[i] = fwSum[i-1] + arr.get(i);
            bwSum[n-1-i] = bwSum[n-i] + arr.get(n-1-i); 
        }
      }

      for (int i = 0; i < n; i++) if(fwSum[i]==bwSum[i]) return "YES";
      
       return "NO";
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(0,0,2,0);
        // 5,6,8,11   - Yes     // 1 - Yes    // 1,2,3  - No     //1,2,3,3  - Yes
        // 1,1,4,1,1  - Yes     // 2,0,0,0  - Yes     // 0,0,2,0  - Yes


        System.out.println(balancedSums(arr));
    }
    
}