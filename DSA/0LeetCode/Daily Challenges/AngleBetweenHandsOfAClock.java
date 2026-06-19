/*
1344 : Angle between hands of a Clock
18-Jun-26

*/

public class AngleBetweenHandsOfAClock {
     public static double angleClock(int hour, int minutes) {
        //calculating pos relative to 12'o clock(0 deg)
        // hr % 12 handles the 12'o clock case to start at 0 deg
        double hourAngle = (hour % 12) * 30.0 + (minutes * 0.5);
        double minuteAngle = minutes * 6.0;

        //finding absolute angle diff
        double differenceInAngle = Math.abs(hourAngle-minuteAngle);

        return Math.min(differenceInAngle, 360.0-differenceInAngle);
    }
    
    public static void main(String[] args) {
        int hour = 12;
        int minutes = 30;

        System.out.println(angleClock(hour, minutes));
    }
}