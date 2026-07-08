/*
07-July-26
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OrganizingContainersOfBalls112 {
     public static String organizingContainers(List<List<Integer>> container) {
      int n = container.size();

      long[] containerCapacities = new long[n];  // row sums
      long[] ballTypeTotals = new long[n];  // column sums

      //calculating sum of each row and column
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            int count = container.get(i).get(j);
            containerCapacities[i] += count;
            ballTypeTotals[j] += count;
        }
      }

      //Sorting both to compare them
      Arrays.sort(containerCapacities);
      Arrays.sort(ballTypeTotals);

      //Check if the sorted capacities match the sorted frequencies perfectly
      for (int i = 0; i < n; i++) {
        if(containerCapacities[i] != ballTypeTotals[i]) return "Impossible";
      }

      return "Possible";
    }

    public static void main(String[] args) {
        List<List<Integer>> containers = new ArrayList<>(Arrays.asList(
            Arrays.asList(1,3),
            Arrays.asList(2,3)
        ));

        System.out.println(organizingContainers(containers));
    }
    
}