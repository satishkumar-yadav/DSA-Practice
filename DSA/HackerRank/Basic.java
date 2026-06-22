import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int i = sc.nextInt(); // 42 // after reading 42 as input nextInt() leaves /n
        // in input buffer
         double d = sc.nextDouble(); // 3.1415 same as nextInt it also leaves
        // /n(newline character) in input buffer
         sc.nextLine(); // consume leftover newline
         String s = sc.nextLine(); // Welcome to HackerRank's Java tutorials!
        // //accepts newline character which is empty so it doesn't accept i/p
        // nextLine() immediately reads that leftover newline, so s becomes an empty
        // string, fix - consume leftover newline first

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
