/*
03-July-26
*/

public class MaximizingXOR86 {
    //passes but needs to optimise
    public static int maximizingXor(int l, int r) {
       int max = Integer.MIN_VALUE;

       for (int i = l; i <= r; i++) {
           for (int j = i; j <= r; j++) {
               int x = i^j;
               if(x>max) max =x;
           }
       }

       return max;
    }

    public static void main(String[] args) {
        int l = 1;
        int r = 1000;

        System.out.println(maximizingXor(l, r));
    }
    
}