
public class Test {
    public static void main(String[] args) {
       // int a = 10;
        //int len = a + "".length();
       // if (len < 3) a = Integer.parseInt("0"+a);
          //  a = 0 * 100 + a;
           
        //System.out.println(a);
        //System.out.println(String.format("%03d", a));  // pad 0 at start if len<3

       // String s3 = ".";
          // s3 += s3;
       // System.out.println(s3);

        String s1 = "java";
        int x = 99;
        // String s2 = x + "";
        // int len = s2.length();
        // if (len < 3)
        //     s2 = "0" + s2;
        // String s3 = "";
        // int m = 15-s1.length();
        // System.out.println(m);
        // for (int j = 1; j <= m; j++)
        //     s3 += ".";
        // //System.out.println(s3);
        // System.out.println(s1 + s3 + s2);

        System.out.printf("%-15s%03d%n", s1, x);  
        // %-15s : %s - print a string, 15 - width of 15 char, - -left justify
        // %03d : %d - print an integer, 3 - width of 3 digits, 0 - pad with leading zeroes

    }
}
