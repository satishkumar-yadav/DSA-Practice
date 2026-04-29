import java.util.Scanner; 
/*
Q2: Counts Elements Greater than Running Average
Problem Statement: 
You are given an array of scores. For each element, compute the average of all elements up to that index(inclusive).

Count how many elements are strictly greater than the computed average at that step.

Input Format:
1. First line contains integer N.
2. Second line contains N space-separated integers.

Output Format:
1. Print the count of elements greater than the running average.
2. If any element > 100 -> print "Invalid Input"

Constraints:
1. 1<=N1<=N
2. Each element must be an integer.
3. If  any value > 100 -> "Invalid Input"


*/


public class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  N(number of elements)");
        int n = sc.nextInt();

        int []scores = new int[n];

        System.out.println("Enter Scores (space separated values) ");
        for (int i = 0; i < scores.length; i++) {
            scores[i] = sc.nextInt();
            if (scores[i] > 100) {
                System.out.println("Invalid Input");
                return;
            }
        }      
       
        double sum= 0;
        int count =0;
        
        //counting elements greater than running average
        
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
           double average = sum/(i+1);
            if(scores[i]>=average) count++;
        }

        System.out.println(count);

        sc.close();
    }
}
