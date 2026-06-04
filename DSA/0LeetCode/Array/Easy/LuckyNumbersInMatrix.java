/*
1380


*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LuckyNumbersInMatrix {
     public static List<Integer> luckyNumbers(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;

       int [] rowMin=new int [r];
       int [] colMax = new int [c];

       //initialising rowMin with large number
       //colMax naturally initializes to 0
       Arrays.fill(rowMin,Integer.MAX_VALUE);
       
       for(int i=0; i<r; i++){
         for(int j=0; j<c; j++){
            rowMin[i]= Math.min(rowMin[i],matrix[i][j]);
            colMax[j]=Math.max(colMax[j],matrix[i][j]);
         }
       }

     List<Integer> result = new ArrayList<>();

     //checking element matching both criteria
     for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            if(matrix[i][j]==rowMin[i] && matrix[i][j]==colMax[j]){
                result.add(matrix[i][j]);
            }
        }
     }
      return result;
    }

    public static void main(String[] args) {
        int matrix [][] = {{3,7,8},{9,11,13},{15,16,17}};

        List<Integer> res = new ArrayList<>();
    
        res = luckyNumbers(matrix);

        System.out.println(res);
    
    }
}
