
/*
    o/p : 
      1   2   3   4   5                 
      16  17  18  19  6 
      15  24  25  20  7
      14  23  22  21  8
      13  12  11  10  9
*/


public class InsertElementSpirally {
    public static void main(String[] args) {
        int row=0, col = -1;
        char dir = 'r';
        int n = 9;
        int a[][] = new int[n][n];

        for (int i = 1; i <= n*n; i++) {
            switch (dir) {
                case 'r': {
                      col++;
                      a[row][col]=i;
                      if(col==a.length-1 || a[row][col+1]!=0)  dir='d';  // a[roe][col+1] ->  for inner element to check if next has element or not
                }
                break;
                case 'd': {
                    row++;
                    a[row][col] = i;
                    if (row == a.length - 1 || a[row+1][col ] != 0)
                        dir = 'l';
                }
                break;
                case 'l': {
                    col--;
                    a[row][col] = i;
                    if (col == 0 || a[row][col - 1] != 0)
                        dir = 'u';
                }
                break;
                case 'u': {
                    row--;
                    a[row][col] = i;
                    if (a[row-1][col ] != 0)
                        dir = 'r';
                }
                break;                  
                
            }
        }

        for (int[] p : a) {
            for (int q : p) {
                System.out.print(q+"\t");
            }
            System.out.println();
        }
        
    }
}
