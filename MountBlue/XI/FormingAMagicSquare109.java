/*
06-July-26
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FormingAMagicSquare109 {
    public static int formingMagicSquare(List<List<Integer>> s) {
        //there are exactly 8 possible 3*3 magic squares in mathematics
        int [][][] validMagicSquares = {
            {{8,1,6},{3,5,7},{4,9,2}},
            {{6,1,8},{7,5,3},{2,9,4}},
            {{4,3,8},{9,5,1},{2,7,6}},
            {{2,7,6},{9,5,1},{4,3,8}},
            {{2,9,4},{7,5,3},{6,1,8}},
            {{4,9,2},{3,5,7},{8,1,6}},
            {{6,7,2},{1,5,9},{8,3,4}},
            {{8,3,4},{1,5,9},{6,7,2}}
        };
        
        int minTotalCost = Integer.MAX_VALUE;

        //compare input matrix against each of 8 valid magic squares
        for (int m = 0; m < 8; m++) {
            int currPermutationCost = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int inputCell = s.get(i).get(j);
                    int magicCell = validMagicSquares[m][i][j];
                    //calculate absolute alteration cost
                    currPermutationCost += Math.abs(inputCell-magicCell);
                }
            }

            //track min cost variation found across all 8 setups
            if(currPermutationCost<minTotalCost) minTotalCost = currPermutationCost;
        }

        return minTotalCost;
    }
    
    public static void main(String[] args) {
         List<List<Integer>> s = new ArrayList<>(Arrays.asList(
            Arrays.asList(5, 3,4),
            Arrays.asList(1,5,8),
            Arrays.asList(6,4,2)
        ));

        System.out.println(formingMagicSquare(s));
    }
}