/*
 24-Jun-26
 */

public class HackerRankInAString59 {
    public static String hackerrankInString(String s) {
        String key = "hackerrank";
        int i=0;

        for (int j = 0; j < s.length(); j++) {
            char ch = s.charAt(j);
            if(ch==key.charAt(i)) i++;
            if(i==key.length()-1) return "YES";
        }

         return "NO" ;   
        
    }

    public static void main(String[] args) {
       // String s = "hhaacckkekraraannk";  // YES
       // String s = "rhbaasdndfsdskgbfefdbrsdfhuyatrjtcrtyytktjjt";  //NO
        String s = "hereiamstackerrank";  //YES
       // String s = "hackerworld";  //NO
       // String s = "haacckkerannk";  //NO
       // String s = "hccaakkerrannkk";  //NO

        System.out.println(hackerrankInString(s));
    }
   
}