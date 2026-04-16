/*
         [ 1, 2, 3
           4, 5, 6
           7, 8, 9 ]  

        1(0,0) + 5(1,1) + 9(2,2) + 3(0,2) + 7(2,0)   = 25
*/

class SumOfDiagonalElement{
public static void main(String[] args) {
    int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
    int sum=0;

    //using nested loops
    for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < a[i].length; j++) {
            if (i==j || i+j==a.length-1) sum += a[i][j];
        }
    }

    System.out.println("Diagonal Sum using nested loops : "+sum);

    //using single loop
    sum=0;
    for (int i = 0; i < a.length; i++) {  // i=0,1,2
        sum += a[i][i];   // a[0][0], a[1][1], a[2][2]
        if(i!=a.length-1-i)   // i=0,1,2 , i!=3-1-
         sum += a[i][a[i].length-1-i];   // a[0][3-1-0] = a[0][2]   , a[1][3-1-1] = a[1][1] - xxx needs to skip ,  a[2][3-1-2] = a[2][0]
    }   
    System.out.println("Diagonal Sum using nested loops : " + sum);

}
    
} 