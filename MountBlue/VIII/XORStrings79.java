/*
02-July-26

Note: You can modify at most three lines in the given code and you cannot add or remove lines to the code.
*/

//debug
public class XORStrings79 {
    public static String stringsXOR(String s, String t) {
        String res = new String("");
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == t.charAt(i))
                res += "0";
            else
                res += "1";
        }

        return res;
    }

    public static void main(String[] args) {

        String s, t;   // |s|=|t|
      //  Scanner in = new Scanner(System.in);
        s = "10101";  //in.nextLine();   // 10101
        t = "00101";  //in.nextLine();   // 00101
        System.out.println(stringsXOR(s, t));  // 10000

    }

     
}