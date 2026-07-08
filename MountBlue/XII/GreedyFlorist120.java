/*
07-July-26
*/

import java.util.Arrays;

public class GreedyFlorist120 {
    static int getMinimumCost(int k, int[] c) {
        //buy expensive first to keep total cost low
        int n = c.length;
        Arrays.sort(c);  // sort flower cost in asc order

        int minTotalCost = 0;
        int flowerBought = 0;

        //iterating from expensive to cheapest
        for (int i = n-1; i >=0; i--) {
            //multiplier = (no of flowers this friend has already bought)+1 , flowerBought/k = distribute evenly
            int multiplier = (flowerBought / k) + 1;
            minTotalCost += multiplier * c[i];
            flowerBought++;  //making a flower purchase complete 
        } 

        return minTotalCost;
    }

    public static void main(String[] args) {
        int[] c = {2,5,6};
        int k =3;

        System.out.println(getMinimumCost(k, c));
    }
    
}