/*
01-July-26
*/

import java.util.Arrays;
import java.util.List;

public class ACMICPCTeam70 {
    public static List<Integer> acmTeam(List<String> topic) {
         int n = topic.size();  //number of people
         int m = topic.get(0).length();  // number of topics

         int maxTopics=0;
         int teamsWithMax=0;

         //comparing every pair of people (i,j)
         for (int i = 0; i < n-1; i++) {
              for (int j = i+1; j < n; j++) {
                  int combinedTopics=0;

                  //counting no of unique pairs they know
                  for (int k = 0; k < m; k++) if(topic.get(i).charAt(k)=='1' || topic.get(j).charAt(k)=='1')    
                    combinedTopics++;

                if(combinedTopics>maxTopics){
                    maxTopics=combinedTopics;
                    teamsWithMax=1;   //reset team count for this new maximum
                }  

                else if(combinedTopics==maxTopics) teamsWithMax++;
                  
              }
         }

         return Arrays.asList(maxTopics,teamsWithMax);
    }
    
    public static void main(String[] args) {
        List<String> topic = Arrays.asList("10101","11100","11010","00101");

        System.out.println(acmTeam(topic));
    }
}