

public class FindIndexIn2DArray {
    public static void main(String[] args) {
        int a[][] = { { 1, 3, 7 },
                { 8, 4, 5 },
                { 6, 2, 9 } };
         int key = 5;

         for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if(a[i][j]==key) {System.out.print("["+(i)+","+(j)+"]");
                break;  }
            }
         }
    }
}
