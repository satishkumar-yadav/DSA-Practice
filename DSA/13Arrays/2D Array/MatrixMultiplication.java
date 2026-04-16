
/*



*/

public class MatrixMultiplication {
    public static void main(String[] args) {
        int a[][] = {{1,2,3},
                     {1,1,4},
                     {2,2,1}};

        int b[][] = { { 1, 3, 3 },
                      { 2, 3, 3 },
                      { 4, 4, 1 } };

       int [][]c = new int[a.length][a.length]  ;
       
       for (int i = 0; i < a.length; i++) {
          for (int j = 0; j < a[i].length; j++) {
            for (int k = 0; k < a[i].length; k++) {
                c[i][j] += a[i][k]*b[k][j];
            }
          }
       }
                     
       for (int[] d : c) {
        for (int e : d)    System.out.print(e+" ");
        System.out.println();
       }
    }    
}
