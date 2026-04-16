
/*
i/p: [1,2,3,5]
o/p: 4


*/

public class PrintMissingElementIn1ToN {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,10};

        int n = a.length+1;
        int totalSum = (n*(n+1))/2;
        int sum =0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }

        System.out.println("Missing element = "+(totalSum-sum));
    }
}
 