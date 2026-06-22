/*

21-Jun-26
*/

public class AlternatingCharacters52 {
    public static int alternatingCharacters2(String s) {  
       int count = 0;
       StringBuilder sb = new StringBuilder(s);
       int n=sb.length();

       for (int i = 0; i < n-1; i++) {
           char ch = sb.charAt(i);
           int j = i+1;
           while(j<n && ch==sb.charAt(j)){
                sb.deleteCharAt(j);
                count++;
                n = sb.length();
           }
       }

       System.out.println(sb);

        return count;
    }

    public static int alternatingCharacters(String s) {
        int count =0;
        for(int i=0; i<s.length()-1;i++)  if(s.charAt(i)==s.charAt(i+1)) count++;

        return count;
    }   

    public static void main(String[] args) {
       // String s = "AABAAB"; // 2
       // String s = "BABABA"; // 0
       // String s = "AAABBB"; //4
        String s = "AAAAAA"; //5

        System.out.println(alternatingCharacters(s));
    }
}