/*
07-July-26
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlippingTheMatrix117 {
    public static int flippingMatrix(List<List<Integer>> matrix) {
       int matrixSize = matrix.size();   //2N size
       int n = matrixSize/2;  // N size
       int maxQuadrantSum=0;

       //iterating through each row and column of upper-left NxN submatrix
       for (int i = 0; i < n; i++) {
          for (int j = 0; j < n; j++) {
               //track the four mirrored elements that can occupy the position (i,j)
               int topLeft = matrix.get(i).get(j);
               int topRight = matrix.get(i).get(matrixSize-1-j);
               int bottomLeft = matrix.get(matrixSize-1-i).get(j);
               int bottomRight = matrix.get(matrixSize-1-i).get(matrixSize-1-j);

               //greedily find maximum among these four choices
               int currMax = Math.max(topLeft, Math.max(topRight, Math.max(bottomLeft, bottomRight)));
               maxQuadrantSum += currMax;  // accumulating into total sum
          }
       }

       return maxQuadrantSum;
    }
    
    public static void main(String[] args) {
        List<List<Integer>> matrix = new ArrayList<>(Arrays.asList(
            Arrays.asList(1,2),
            Arrays.asList(3,4)
        ));

        System.out.println(flippingMatrix(matrix));
    }
}