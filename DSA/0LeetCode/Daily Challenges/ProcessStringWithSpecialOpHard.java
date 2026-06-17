/*
17-Jun-26
3614: Process String With Special Operations

*/

public class ProcessStringWithSpecialOpHard {
    public static char processStr(String s, long k) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == '#') {
                sb.append(sb);
                continue;
            }
            if (ch == '%') {
                sb.reverse();
                continue;
            }
            if (ch == '*') {
                if (sb.length() > 0)
                    sb.deleteCharAt(sb.length() - 1);
                continue;
            }
            sb.append(ch);
        }

         System.out.println(sb);

      if(sb.length()==0 || k>=sb.length()) return '.';
      else return sb.charAt((int)k);
    }

    public static void main(String[] args) {
        // String s = "a#b%*";
       // String s = "z*#";
        String s = "a#b%*"; // k = 1  //a
        //String s = "cd%#*#"; // k = 3 //d
         // String s = "z*#"; // k = 0
        int k=1;

        System.out.println(processStr(s,k));
    }

}
