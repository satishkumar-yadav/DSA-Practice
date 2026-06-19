/*
Easy
1732 : Find The Highest Altitude
19-Jun-26

*/

public class EFindTheHighestAltitude {
     public static int largestAltitude(int[] gain) {
        int altitude[] = new int[gain.length+1];
        int max = altitude[0];
        for (int i = 1; i < altitude.length; i++) {
            altitude[i] = altitude[i-1] + gain[i-1];
            max = Math.max(max, altitude[i]);
        }
       // Arrays.sort(altitude);
       // return altitude[altitude.length-1];
       return max;
    }

    public static void main(String[] args) {
      // int[] gain = {-5,1,5,0,-7};  // 1
       int[] gain = {-4,-3,-2,-1,4,3,2};  // 0

      System.out.println(largestAltitude(gain));
    }
    
}