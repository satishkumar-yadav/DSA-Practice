/*
 21-Jun-26

*/

public class Pangrams53 {
     public static String pangrams(String s) {
        if(s.length()<26) return "not pangram";
        s=s.toLowerCase();
        for(char ch='a'; ch<='z'; ch++)  if(!s.contains(ch+"")) return "not pangram";
        return "pangram";
    }
    
    public static void main(String[] args) {
        String s = "The quick brown fox jumps over the lazy dog";
        //  String s = "We promptly judged antique ivory buckles for the next prize";
        //  String s = "We promptly judged antique ivory buckles for the prize";

        System.out.println(pangrams(s));
    }
}