/*
Easy
520: Detect Capital
04-July-26
*/

public class DetectCapital {
    // useful only when all uppper or all lower
    public static boolean detectCapitalUse3(String word) {
        int n = word.length();

        char c = word.charAt(0);
        int i = 1;
        if(c>='A' && c<='Z'){
             while(i<n && word.charAt(i)>='A' && word.charAt(i)<='Z' ) {System.out.println("f i:"+i); i++; }
           }
        else{
            while (i < n && word.charAt(i) >= 'a' && word.charAt(i) <= 'z') {System.out.println("i: "+i); i++;}
        }

        if (i == n) return true;
        else return false;
    }    

    // Shortest using Regular Expression
    public static boolean detectCapitalUse2(String word) {
       return word.matches("[A-Z]+|[a-z]+|[A-Z][a-z]+");
    }    

    public static boolean detectCapitalUse(String word) {
       int upperCount =0;

       for (int i = 0; i < word.length(); i++) if(Character.isUpperCase(word.charAt(i))) upperCount++;
       
       if(upperCount==word.length() || upperCount==0) return true;  // all uppercase or all lowercase

       if(upperCount==1 && Character.isUpperCase(word.charAt(0))) return true; // only first letter upper case

       return false;
    }    

    public static void main(String[] args) {
        String word = "Apple";

       System.out.println(detectCapitalUse2(word));
    }
}
