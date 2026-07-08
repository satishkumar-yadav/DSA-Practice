/*
07-July-26
*/

public class Encryption113 {
    public static String encryption(String s) {
       s = s.replaceAll("\\s", "");   // strip away all whitespace character
       int n = s.length();

       // determining grid dimensions using square root limits
       int rows = (int) Math.floor(Math.sqrt(n));
       int columns = (int) Math.ceil(Math.sqrt(n));

       //ensuring the selected boundary can actually fit the string length
       if(rows * columns < n) rows = columns;

       StringBuilder encryptedMessage = new StringBuilder();

       //reading column-wise without constructing an actual 2D array
       for (int c = 0; c < columns; c++) {
          int index = c;
          //advance vertically down the column by jumping 'columns' steps each time
          while (index<n) {
             encryptedMessage.append(s.charAt(index));
             index += columns;
          }
          //append space separator except for last column
          if(c<columns-1) encryptedMessage.append(" ");
       }

       return encryptedMessage.toString();
    }

    public static void main(String[] args) {
        String s = "chill out";

        System.out.println(encryption(s));
    }
    
}