/*
Easy
389: Find the Difference
02-July-26

*/

public class FindDifference {
    //fails (a, aa) , passes only 2/54 cases 
    public static char findTheDifference3(String s, String t) {
        for (int i=0; i<t.length();i++) {
            char c = t.charAt(i);
            if(!s.contains(c+"")) return c;
        }

        return ' ';
    }    

    //using frequency count
    public static char findTheDifference2(String s, String t) {
         int []freq = new int[26];

         for (char c : s.toCharArray()) freq[c-'a']++;

         for (char c : t.toCharArray()) {
             freq[c - 'a']--;
             if(freq[c-'a']<0) return c;
         }
            
         return ' ';
    }
    
    // TC: O(n), SC: O(1)
    //Optimal solution using xor  -  a^a=0    a^0=a  , xor is commutative and associative
    //since t contains all char of s plus 1 extra, every common char cancels out , leaving only extra one.
    public static char findTheDifference(String s, String t) {
        char res = 0;

        for (char c : s.toCharArray()) res ^= c; 
        
        for (char c : t.toCharArray()) res ^= c;

        return res;
    
    }   

    public static void main(String[] args) {
        String s = "a";  // ""  
        String t = "aa"; // "y" 

        System.out.println(findTheDifference(s, t));
    }
}
