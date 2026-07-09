/*
Easy
434: Number of Segments in a String
09-July-26

Constraints:

0 <= s.length <= 300
s consists of lowercase and uppercase English letters, digits, or one of the following characters "!@#$%^&*()_+-=',.:".
The only space character in s is ' '.

*/

public class NoOfSegmentInString {
    public static int countSegments2(String s) {
      int n = s.length();
      int i=0, j=0;
      int count = 0;

      while (i<n) {
           while(i<n && s.charAt(i)==' ') i++;
           if(i==n) break;
           j=i;
           while(j<n && s.charAt(j) != ' ') j++;
           count++;
           i=j;
      }

      return count;
    }


    //optimise solution
    public static int countSegments(String s) {
       int count = 0;
       for (int i = 0; i < s.length(); i++) if(s.charAt(i)!= ' ' && (i==0 || s.charAt(i-1)==' ')) count++;
       return count;
    }    

    public static void main(String[] args) {
        String s = "     Hello,    my    name   is         John   ";  // 5

        System.out.println(countSegments(s));
    }
}
