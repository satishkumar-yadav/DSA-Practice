/*
17-Jun-26 - NS
3614: Process String With Special Operations

*/

public class HProcessStringWithSpecialOperations {
    public static char processStr2(String s, long k) {
        StringBuilder sb = new StringBuilder();  // can hold max length of Integer.MAX_VALUE(2*10^9)
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

    public static char processStr(String s, long k) {
      int n = s.length();
      long L =0;

      //forward pass - compute final virtual length
      for (int i = 0; i < n; i++) {
        char ch = s.charAt(i);
        if(ch=='*'){
            if(L>0) L--;
        } else if(ch=='#'){
            L *= 2;
        } else if(ch=='%'){
            continue;  // reverse doesn't change total length
        } else L++;
      }

      //out of bounds check
      if(k >= L) return '.';

      //Backward pass - map index k to its source character
      for(int i=n-1; i>=0; i--){
        char ch = s.charAt(i);
        if(ch=='*'){
            L++; //undo deletion
        } else if(ch=='%'){
            k = L-k-1;  //undo reversal
        } else if(ch=='#'){
            L /= 2; //undo duplication
            if(k>=L) k -= L; //map back to original half
        } else {
            L--; // regular char
            if(k==L) return ch;
        }
      }

      return '.';
    }

    public static void main(String[] args) {
        // String s = "a#b%*";
       // String s = "z*#";
        //String s = "a#b%*"; // k = 1  //a
        //String s = "cd%#*#"; // k = 3 //d
         // String s = "z*#"; // k = 0
        String s = "%#bz%xum##i##vzo#pwc*#dkwbh####%uf%s*%cgppqhqa%h#l##o%ij%%cz%iga##e###u%#e####jfwx##%%*x%m*%#";
        int k= 6523;

        System.out.println(processStr(s,k));
    }

}
