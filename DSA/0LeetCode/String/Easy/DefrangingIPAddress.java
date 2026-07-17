/*
Easy
1108: Defranging an IP Address
17-July-2026

Constraints:
The given address is a valid IPv4 address.

*/

public class DefrangingIPAddress {
    public static String defangIPaddr(String address) {
      StringBuilder sb = new StringBuilder();
     
      for(int i=0; i< address.length(); i++){
        char c = address.charAt(i);
        if(c!='.') sb.append(c);
        else {
            sb.append('[');
            sb.append(c);
            sb.append(']');
        }
      }

      return sb.toString();
    }

    public static void main(String[] args) {
       // String address = "1.1.1.1";
         String address = "255.100.50.0";

      System.out.println(defangIPaddr(address));
    }
}
