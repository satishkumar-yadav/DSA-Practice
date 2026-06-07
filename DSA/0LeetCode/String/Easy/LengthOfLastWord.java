/*
58 - Length of Last Word


*/

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
      int len = 0;

      int n=s.length(), i=n-1, j=n-1;

      while(i>=0){
        while (i>=0 && s.charAt(i)==' ') i--;
        j=i;
        while(j>=0 && s.charAt(j)!=' '){
          len++;
          j--;
        }
        break;
      }

      return len;
    }

    public static void main(String[] args) {
       // String s = "Hello World";
       // String s = "   fly me   to   the moon  ";
        String s = "luffy is still joyboy    ";

       System.out.println(lengthOfLastWord(s));
    }
}
