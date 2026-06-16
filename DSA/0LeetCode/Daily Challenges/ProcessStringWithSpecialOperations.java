/*
3612: Process String With Special Operations

*/


public class ProcessStringWithSpecialOperations {
    public static String processStr(String s) {
       StringBuilder sb = new StringBuilder();
       int n = s.length();

       for (int i = 0; i < n; i++) {
           char ch = s.charAt(i);
           if(ch=='#'){
              sb.append(sb);
             continue;
           }
           if(ch=='%'){
              sb.reverse();
            continue;
           }
           if(ch=='*'){
               if (sb.length() > 0) sb.deleteCharAt(sb.length() - 1);
            continue;
           }
           sb.append(ch);        
       }

       //System.out.println(sb);

       return sb.toString();
    }

    public static void main(String[] args) {
       //String s = "a#b%*";
       String s = "z*#";

       System.out.println(processStr(s));
    }

}
