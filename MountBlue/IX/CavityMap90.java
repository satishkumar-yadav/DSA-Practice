/*
03-July-26
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CavityMap90 {
    //fails,  passes only 13/23 test cases
     public static List<String> cavityMap(List<String> grid) {
      int n = grid.size();
      
      //convert string array into 2D char matrix for easy modification
      char[][] matrix = new char[n][n];
      for (int i = 0; i < n; i++) {
          matrix[i] = grid.get(i).toCharArray();
      }

      //iterating only through inner elements (skipping border)
      for (int i = 1; i < n-1; i++) {
          for (int j = 1; j < n-1; j++) {
               char current = grid.get(i).charAt(j);
               //compare with original values from input grid array
               char top = grid.get(i-1).charAt(j);
               char bottom = grid.get(i+1).charAt(j);
               char left = grid.get(i).charAt(j-1);
               char right = grid.get(i).charAt(j+1);

               //check if current cell is strictly deeper than all 4 neighbours
               if(current>top && current>bottom && current>left && current>right) matrix[i][j]= 'X'; // mark cavity in mutable matrix
          }
      }

         //convert the modified 2D matrix back into array of strings
         List<String> res = new ArrayList<>();
         for (int i = 0; i < n; i++) res.add(new String(matrix[i]));
            
         return res;
         
    }

    public static void main(String[] args) {
        List<String> grid = Arrays.asList();

        System.out.println(cavityMap(grid));


        /*
         * 989
         * 191
         * 111
         * 
         * o/p :
         * 989
         * 1X1
         * 111
         * 
         * 
         * grid = ['1112', '1912', '1892', '1234'] ;
         * o/p: 1112
         * 1X12
         * 18X2
         * 1234
         */
    }
    
}