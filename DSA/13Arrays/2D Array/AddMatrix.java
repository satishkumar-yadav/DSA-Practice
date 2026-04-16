public class AddMatrix {
    public static void main(String[] args) {
        int a[][] = { { 1, 2, 1 },
                { 3, 4, 2 } };

        int b[][] = { { 1, 1, 2 },
                { 2, 3, 8 } };
                
        int c[][] = new int [a.length][a[0].length];
        
        System.out.print("[ ");
        //System.out.print("-");
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + " ");
                //System.out.print("| "+c[i][j] + " |");
            }
             if(i<c.length-1){
                System.out.println();
             }
             else  
                 System.out.print("]");  
        }
 
       // System.out.print("]");
       // System.out.print(Arrays.deepToString(c));
    }
}
