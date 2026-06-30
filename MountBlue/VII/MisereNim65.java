/*
30-Jun-26
*/

import java.util.Arrays;
import java.util.List;

public class MisereNim65 {
    public static String misereNim(List<Integer> s) {
       int xorSum=0;
       boolean allPilesAreOne = true;

       //one-pass calculation for both condition
       for (Integer pileSize : s) {
          xorSum ^= pileSize;  //calculating Nim-Sum
          if(pileSize>1) allPilesAreOne =false;  //found pile larger than 1
       }

       //Case 1: all piles contain exactly 1 stone
       if(allPilesAreOne){
        //if no of piles is even player 1 wins else player 2
        return (s.size() %2 ==0) ? "First" : "Second";
       }

       //Case 2: if piles hold >1 stone
       return (xorSum !=0) ? "First" : "Second";

    }

    public static void main(String[] args) {
        List<Integer> s = Arrays.asList();

        System.out.println(misereNim(s));
    }
    
}