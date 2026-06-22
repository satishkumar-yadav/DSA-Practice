/*
Hard
1840 : Maximum Building Height
20-Jun-26

*/

import java.util.ArrayList;
import java.util.List;

public class HMaximumBuildingHeight {
    public static int maxBuilding(int n, int[][] restrictions) {
         List<int[]> ls = new ArrayList<>();
         ls.add(new int[]{1,0});   // building 1 must have height =0

         for (int[] res : restrictions) {
            ls.add(res);
         }

         //sort restriction by building id
         ls.sort((a,b)-> Integer.compare(a[0], b[0]));

         //if last building isn't restricted, add it
         if(ls.get(ls.size()-1)[0] != n) ls.add(new int[]{n,n-1});

        int m= ls.size();

        //Step 1 : Forward Pass
        for (int i = 1; i < m; i++) {
            int []prev = ls.get(i-1);
            int []curr = ls.get(i);
            int dist = curr[0]-prev[0];
            curr[1]=Math.min(curr[1], prev[1]+dist);
        }

        // Step 2 : Backward Pass
        for (int i = m-2; i >=0; i--) {
            int[] next = ls.get(i + 1);
            int[] curr = ls.get(i);
            int dist = next[0]- curr[0];
            curr[1] = Math.min(curr[1], next[1] + dist);
        }

        //finding max absolute peak b/w any consecutive restrictions
        int maxHeight =0;
        for (int i = 0; i < m-1; i++) {
            int []a = ls.get(i);
            int []b = ls.get(i+1);
            int peak = (a[1] + b[1] + (b[0]-a[0])) /2;
            maxHeight=Math.max(maxHeight, peak);
        }

        return maxHeight;
    }  

    public static void main(String[] args) {
       int n = 5;
       int [][] restrictions = {{2,1},{4,1}};

       System.out.println(maxBuilding(n, restrictions));
    }
}
