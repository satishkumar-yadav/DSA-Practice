/*
06-July-26
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClimbingTheLeaderboard110 {
     public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
       //extract distinct leaderboard scores into a primitive array, this removes duplicate ranks immediately
       int[] uniqueScores = new int[ranked.size()];
       int uniqueCount = 0;

       for (int i = 0; i < ranked.size(); i++) {
           int score = ranked.get(i);
           if(uniqueCount==0 || uniqueScores[uniqueCount-1] != score){
            uniqueScores[uniqueCount] = score;
            uniqueCount++;
           }
       }

       List<Integer> playerRanks = new ArrayList<>();

       //initialise a pointer at bottom of unique scores array , ranks are 1-based matching (index+1)
       int leaderboardPointer = uniqueCount-1;

       //iterate through player's ascending scores
       for (Integer playerScore : player) {
          //move pointer up in leaderboard as long as player's score beats or matches curr leaderboard benchmark score
          while (leaderboardPointer>=0 && playerScore>=uniqueScores[leaderboardPointer]) {
            leaderboardPointer--;
          }

          //if leaderboardpointer drops -1, player beat absolute top score(Rank 1), else rank sits right behind element pointer stopped
          int currRank = leaderboardPointer + 2;
          playerRanks.add(currRank);
       }

       return playerRanks;
    }

    public static void main(String[] args) {
           List<Integer> ranked = Arrays.asList(100,90,90,80);
        List<Integer> player = Arrays.asList(70,80,105);  

        System.out.println(climbingLeaderboard(ranked, player));
    }
    
}