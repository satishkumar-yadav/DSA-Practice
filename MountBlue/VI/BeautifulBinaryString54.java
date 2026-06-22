/*
21-Jun-26

*/

public class BeautifulBinaryString54 {
    public static int beautifulBinaryString3(String b) {
        int n = b.length();
        StringBuilder sb = new StringBuilder(b);
        int count =0;
        
        int i=0,  j=i+2;
        while (i<n-2) {
            if(sb.charAt(i)==sb.charAt(j) && sb.charAt(i)=='0' && sb.charAt(i+1)=='1'){
               if(sb.charAt(j)=='0') sb.setCharAt(j, '1');
               else sb.setCharAt(j, '0');
               count++;
               i+=3;
               j = i + 2;
               continue;
            }
            i++;
            j = i + 2;
        }

        return count;
    }
    
    public static int beautifulBinaryString2(String b) {
       //removing all instances of '010'
       String modified = b.replaceAll("010", "");
       return (b.length()-modified.length())/3;    // no of operations is total char lost/3
    }

    public static int beautifulBinaryString(String b) {
       int count =0;
       int i=0;

       //looping until we can no longer fit a 3-character window
       while (i<=b.length()-3) {
          if(b.charAt(i)=='0' && b.charAt(i+1)=='1' && b.charAt(i+2)=='0'){
            count++;
            i += 3;
          } else i++;
       }
       return count;
    }

    public static void main(String[] args) {
        String s = "0101010";

        System.out.println(beautifulBinaryString(s));
    }
}