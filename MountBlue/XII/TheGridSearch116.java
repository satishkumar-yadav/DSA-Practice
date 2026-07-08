/*
07-July-26
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TheGridSearch116 {
   public static String gridSearch(List<String> G, List<String> P) {
     int R = G.size();  // Rows in large grid
     int C = G.get(0).length();  // Columns in large grid
     int r = P.size();  //rows in pattern grid
     int c = P.get(0).length();  // columns in pattern grid

     //loop through all possible top-left corners where the pattern can fit
     for (int i = 0; i <=R-r ; i++) {
        for (int j = 0; j <= C-c; j++) {
            boolean matchFound = true; //track if full pattern matches starting at coordinate(i,j)
            //validating rows of the pattern against the sub-rows of grid
            for (int k = 0; k < r; k++) {
                String gridSegment = G.get(i+k).substring(j, j+c);  //exrtact specific substring segment from grid row
                //if segment doesn't match pattern row, break early
                if(!gridSegment.equals(P.get(k))){
                    matchFound = false;
                    break;
                }
            }

            //if entire inner pattern loop matched perfectly , return yes
            if(matchFound) return "YES";
        }
     }

     return "NO";
    }

    public static void main(String[] args) {
        List<String> G = new ArrayList<>(Arrays.asList("1234567890","0987654321","1111111111","1111111111","2222222222"));
        List<String> P = new ArrayList<>(Arrays.asList("876543","111111","111111"));

        System.out.println(gridSearch(G, P));
    }
    
}