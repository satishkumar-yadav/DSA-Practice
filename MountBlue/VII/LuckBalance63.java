/*

27-Jun-26

*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LuckBalance63 {
    public static int luckBalance(int k, List<List<Integer>> contests) {
        int totalLuck=0;
        List<Integer> impContests = new ArrayList<>();

        //processing input matrix
        for (List<Integer> contest : contests) {
            int luck = contest.get(0);
            int importance = contest.get(1);

            if(importance==0){
                //Eagerly lose all unimportant contests to claim full luck value
                totalLuck += luck;
            }
            else{
                // save important contests aside for greedy processing
                impContests.add(luck);
            }
        }

        //Sort important contests in descending order (largest luck first)
        Collections.sort(impContests, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2){ return o2.compareTo(o1);}
        });

        //Looping through sorted important contests
        for (int i = 0; i < impContests.size(); i++) {
            int luckValue = impContests.get(i);
            if(i<k){
                //within the allowable threshold 'k' -> lose them for +ve luck
                totalLuck += luckValue;
            }
            else{
                //must win the remaining lower-value important contests -> Subtract luck
                totalLuck -= luckValue;
            }
        }

        return totalLuck;
    }

    public static void main(String[] args) {
        int k=3;
        //conLists = [[5,1], [2,1], [1,1], [8,1], [10,0], [5,0]]

        // List<List<Integer>> conLists = List.of(       ......             //Java 9+
        List<List<Integer>> conLists = Arrays.asList(
            Arrays.asList(5,1),
            Arrays.asList(2,1),
            Arrays.asList(1,1),
            Arrays.asList(8,1),
            Arrays.asList(10,0),
            Arrays.asList(5,0)
        );
        
        System.out.println(luckBalance(k, conLists));
    }
    
}