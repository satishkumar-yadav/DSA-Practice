import java.util.Scanner;
/*
22nd April - 2nd  shift

Q1: 2x2 Scaling Transformation Matrix
Problem Statement : 
You are given a 2x2 transformation matrix used for scaling coordinates: 
[Sx 0 
 0  Sy]    

 This matrix scale a point (x,y) to (Sx.x, Sy.y)

 Input Format:
 1. First line contains an integer N - number of coordinate pairs.
 2. Next N lines contains two space-separated values x and y.
 3. Last line contains two space-separated integers sx and sy.

 Output Format:
 1. Print all scaled coordinates in a single line.
 2. Each scaled coordinate should be in format: x y
 3. Separate each pair using a comma,.

 Constraints:
 - If N<=0, print "Invalid Input".
 - If sx<=0 or sy<=0, print "Invalid Input".
 - If any x,y,sx,sy are not integers -> "Invalid Input".
 
 Sample Input:
 4      - no of coordinate pair
 3  2   - coordinate pair (x and y)
 2  1
 4  3
 6  4
 2  3  - value of sx and sy

 Sample Output: 
6  6, 4  3, 8  9, 12  12

Explanation: 
- Scale factor: sx=2, sy=3
- Each coordinate is scaled: 
  (3,2) -> (6,6)
  (2,1) -> (4,3)
  (4,3) -> (8,9)
  (6,4) -> (12,12)
*/

public class P1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of number of coordinates : ");
        int N =  sc.nextInt();
        if(N <= 0) throw new Error("Invalid Input");
        
        int [][] matrix = new int[N][2];

        System.out.println("Enter all the coordinates one bye one(x y ) - space separated values");
       // String coordinate = sc.nextLine();
      
    for (int i= 0; i < matrix.length; i++) {
        int x=0;
        int y=0;
        try {
            // char c1 = sc.next().charAt(0);
            // char c2 = sc.next().charAt(0);
            // int x = c1 - '0';
            // int y = c2 - '0';
            x = sc.next().charAt(0) - '0';
            y = sc.next().charAt(0) - '0';
            if((x<0 || x>9) || (y<0 || y>9)) throw new Error("Invalid Input");

            matrix[i][0] = x; // x , int x = sc.nextInt();
            matrix[i][1] = y; // y , int y = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid Input");
        }

   

    }
       
       


    //    for (int i = 0; i < matrix.length; i++) {
    //       matrix[i][0] = sc.nextInt();  // x    ,  int x = sc.nextInt();
    //       matrix[i][1] = sc.nextInt();  //y     ,  int y = sc.nextInt();
    //    }

       System.out.println("Enter Sx and Sy - space separated values");
       int sx = sc.nextInt();
       int sy = sc.nextInt();
       if (sx <= 0 || sy  <=0 )
          throw new Error( "Invalid Input");

       //Scaling coordinate and storing it
       for (int i = 0; i < matrix.length; i++) {
           matrix[i][0] = matrix[i][0] * sx; 
           matrix[i][1] = matrix[i][1] * sy; 
       }

       System.out.println();
       for (int[] m : matrix) {
           for (int n : m) {
             System.out.print(n+" ");
           }
           System.out.print(", ");
       }
      // System.out.println(Arrays.toString(matrix));

       //System.out.println(x+" , "+y);

      //  String [] ch=  coordinate.split(" ");

       // System.out.println(coordinate);
      //  System.out.println(Arrays.toString(ch));

      //  int x= Integer.parseInt(ch[0]);
      //  int y= Integer.parseInt(ch[1]);

      //  System.out.println(x+" , "+y);


      //////////////////////////////////////
       
      try {
        int n = sc.nextInt();
        if(n<=0){
            System.out.println("Invalid Input");
            return;
        } 

        int [][]points = new int[n][2];
        for (int i = 0; i < n; i++) {
            points[i][0]=sc.nextInt();
            points[i][1]=sc.nextInt();
        }

        int Sx= sc.nextInt();
        int Sy= sc.nextInt();
        if(Sx<=0  || Sy<=0){
            System.out.println("Invalid Input");
            return;
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < points.length; i++) {
            result.append(points[i][0]*Sx).append(" ").append(points[i][1]*Sy);

            if(i!= points.length-1) result.append(", ");
        }

        System.out.println(result);
      } catch (Exception e) {
        System.out.println("Invalid  Input");
      } 

    }
}
