import java.util.Scanner;
public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String s = sc.next();
        //String s = "Ramanaa";
        sc.close();
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(s.charAt(j));
            }
            System.out.println();
        }
    }
}
