import java.util.Scanner;

/*



*/


public class P3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter N:  ");
        int n = sc.nextInt();

        int cost[] = new int[n];
        int matrix[][] = new int[n][n];

        System.out.println("Enter Cost (space separated)");
        for (int i = 0; i < cost.length; i++) {
            cost[i]= sc.nextInt();
        }

        System.out.println("Enter matrix values row-wise with diagonal element to be 0");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j]= sc.nextInt();
            }
        }

        int minSum = Integer.MAX_VALUE; 

        // for replacing diagnal element(0) with cost
        for(int i=0; i<matrix.length; i++){
            matrix[i][i] = cost[i];
        }

        for (int i = 0; i < matrix.length; i++) {
            int min = 0;
            for (int j = 0; j < matrix.length; j++) {
                min += matrix[i][j];
            }
            if(min<minSum) minSum=min;
        }

        System.out.println(minSum);

    }    
}
