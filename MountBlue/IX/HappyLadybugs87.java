/*
03-July-26

 - for ladybug to be happy count of each char should be >1, if count ==1 for any one char , ladybug can't be happy
 - there should be at least 1 empty space (_) for happy ladybug , considering count>1
 - if no empty space is there then string must me perfectly configured
*/

public class HappyLadybugs87 {
    public static String happyLadybugs(String b) {
         int n = b.length();
         int []counts = new int[26];
         int underScoreCount = 0;

         for (int i = 0; i < n; i++) {
            char c = b.charAt(i);
            if(c=='_') underScoreCount++;
            else counts[c-'A']++;
         }

         //checking for lonely ladybug
         for (int count : counts) if(count==1) return "NO";
         
         //if there are empty spaces, it can be rearranged
         if(underScoreCount>0) return "YES";

         //if no empty spaces, verify if they are already happy
         for (int i = 0; i < n; i++) {
            boolean happyLeft = (i>0) && (b.charAt(i)==b.charAt(i-1));
            boolean happyRight = (i<n-1) && (b.charAt(i)==b.charAt(i+1));

            if(!happyLeft && !happyRight) return "NO";  // found unhappy ladybug that can't move
         }
         
         return "YES";
    }

    public static void main(String[] args) {
        String b = "";

        System.out.println(happyLadybugs(b));
    }
    
}