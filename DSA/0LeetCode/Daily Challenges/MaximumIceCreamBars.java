/*
Medium
1833 : Maximum Ice Cream Bars
21-Jun-26

*/

import java.util.Arrays;

public class MaximumIceCreamBars {
    public static int maxIceCream3(int[] costs, int coins) {
         Arrays.sort(costs);
         int count = 0;
         
         for (int c : costs) {
            if(coins<c || coins==0) break;
            coins -= c;
            count++;
         }

         return count;
    }

public static int maxIceCream4(int[] costs, int coins) {
    final int MAX_COST = 100000;

    int[] freq = new int[MAX_COST + 1];

    for(int cost:costs)
    {
        freq[cost]++;
    }

    int answer = 0;

    for(int cost = 1;cost<=MAX_COST;cost++)
    {

        if (freq[cost] == 0) {
            continue;
        }

        int canBuy = Math.min(freq[cost], coins / cost);

        answer += canBuy;

        coins -= canBuy * cost;
    }

    return answer;
}

public static int maxIceCream2(int[] costs, int coins) {
    int max = costs[0];
    // finding max element
    for (int i = 1; i < costs.length; i++)
        if (costs[i] > max) max = costs[i];

    // create count array
    int[] freq = new int[max + 1];

    // counting frequency of each element
    for (int cost : costs) freq[cost]++;

    // build sorted array
    int index = 0;

    for (int i = 0; i < freq.length; i++) {
        while (freq[i] > 0) {
            costs[index] = i;
            index++;
            freq[i]--;
        }
    }
    
    int count = 0;

    for (int c : costs) {
        if (coins < c || coins == 0)
            break;
        coins -= c;
        count++;
    }

    return count;
}    

  public static int maxIceCream(int[] costs, int coins) {
    int max = costs[0];
    // finding max element
    for (int i = 1; i < costs.length; i++)
        if (costs[i] > max) max = costs[i];

    // create count array
    int[] freq = new int[max + 1];

    // counting frequency of each element
    for (int cost : costs)  freq[cost]++;

    int count = 0;

    for (int cost = 1; cost <= max; cost++) {

        if (freq[cost] == 0)    continue;
        
        int canBuy = Math.min(freq[cost], coins / cost);

        count += canBuy;

        coins -= canBuy * cost;
    }

    return count;
}


    public static void main(String[] args) {
       //int costs[] = {1,3,2,4,1}, coins = 7;  //4
       //int  costs[] ={10,6,8,7,7,8}, coins = 5;  //0
       int costs[] = {1,6,3,1,2,5}, coins = 20;  //6

       System.out.println(maxIceCream(costs, coins));
    }
}
