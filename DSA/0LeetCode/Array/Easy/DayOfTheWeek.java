/*
  // Day of The Weeek - 1185  // submitted but needs to run again self practice

Given a date, return the corresponding day of the week for that date.

The input is given as three integers representing the day, month and year respectively.

Return the answer as one of the following values {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"}.

Note: January 1, 1971 was a Friday.

Constraints:
The given dates are valid dates between the years 1971 and 2100.
 

Example 1:

Input: day = 31, month = 8, year = 2019
Output: "Saturday"
Example 2:

Input: day = 18, month = 7, year = 1999
Output: "Sunday"
Example 3:

Input: day = 15, month = 8, year = 1993
Output: "Sunday"
 
*/


public class DayOfTheWeek {
    public static String dayOfTheWeek(int day, int month, int year) {
     
        // Days of week starting  from Friday (01-01-1971)
        String[] days={"Friday","Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday"};

        // Days in each month
        int[] monthDays= {31,28,31,30,31,30,31,31,30,31,30,31};
        
        int totalDays=0;

        // 1.Count days for complete years from 1971 to year-1
        for (int y = 1971; y < year; y++) {
             if(isLeapYear(y)) totalDays +=366;
             else totalDays +=365;    
        }

        // 2. Count days for complete months of  current year
        for (int m = 1; m < month; m++) {
            totalDays += monthDays[m-1];
            if(m==2 && isLeapYear(year)) totalDays +=1;   //leap year february
        }

        // 3. Add days of Current Month
        totalDays += day-1;

        // 4. Find day of the week
        return days[totalDays % 7];
    }

    //Helper Method to check leap year
    private static boolean isLeapYear(int year){
        return (year % 400 ==0 || (year % 4==0  && year % 100 !=0));
    }

    public static void main(String[] args) {
      String day= dayOfTheWeek(31,8,2019);
      System.out.println(day);
    }
}
