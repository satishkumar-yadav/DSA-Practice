/*
03

Maria plays college basketball and wants to go pro. Each season she maintains a record of her play. She tabulates the number of times she breaks her season record for most points and least points in a game. Points scored in the first game establish her record for the season, and she begins counting from there.

Example
scores=[12,24,10,24]

Scores are in the same order as the games played. She tabulates her results as follows:

                                     Count
    Game  Score  Minimum  Maximum   Min Max
     0      12     12       12       0   0
     1      24     12       24       0   1
     2      10     10       24       1   1
     3      24     10       24       1   1
Given the scores for a season, determine the number of times Maria breaks her records for most and least points scored during the season.

Function Description

Complete the breakingRecords function in the editor below.

breakingRecords has the following parameter(s):

int scores[n]: points scored per game

Returns
int[2]: An array with the numbers of times she broke her records. Index 0  is for breaking most points records, and index 1 is for breaking least points records.

Input Format

The first line contains an integer n, the number of games.
The second line contains n space-separated integers describing the respective values of score0,score1,...,score(n-1).

Constraints
1<=n<=1000
0<=scores[i]<=10^8

Sample Input 0

9
10 5 20 20 4 5 2 25 1

Sample Output 0
2 4

Explanation 0

The diagram below depicts the number of times Maria broke her best and worst records throughout the season:

Game           0    1   2   3   4   5   6   7   8
Score          10   5   20  20  4   5   2   25  1
Highest Score  10   10  20  20  20  20  20  25  25
Lowest Score   10   5   5   5   4   4   2   2   1

She broke her best record twice (after games 2 and 7) and her worst record four times (after games 1, 4, 6, and 8), so we print 2 4 as our answer. Note that she did not break her record for best score during game 3, as her score during that game was not strictly greater than her best record at the time.

Sample Input 1

10
3 4 21 36 10 28 35 5 24 42
Sample Output 1

4 0
Explanation 1

The diagram below depicts the number of times Maria broke her best and worst records throughout the season:

Game           0    1   2   3   4   5   6   7   8   9
Score          3    4   21  36  10  28  35  5   24  42
Highest Score  3    4   21  36  36  36  36  36  36  42 
Lowest Score   3    3   3   3   3   3   3   3   3   3 

She broke her best record four times (after games 1, 2, 3, and 9) and her worst record zero times (no score during the season was lower than the one she earned during her first game), so we print 4 0 as our answer.

*/

// import java.io.*;
// import java.math.*;
// import java.security.*;
// import java.text.*;
// import java.util.*;
// import java.util.concurrent.*;
// import java.util.regex.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BreakingTheRecords03 {
    public static void main(String[] args) throws IOException {
        // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        // int n = Integer.parseInt(bufferedReader.readLine().trim());

        // String[] scoresTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n= 9;
        int scoresItem[] = {10,5,20,20,4,5,2,25,1};

        List<Integer> scores = new ArrayList<>();

        for (int i = 0; i < n; i++) {
           // int scoresItem = Integer.parseInt(scoresTemp[i]);
            //scores.add(scoresItem);
            scores.add(scoresItem[i]);
        }

        List<Integer> result = Result.breakingRecords(scores);

        System.out.println(result);

        // for (int i = 0; i < result.size(); i++) {
        //     bufferedWriter.write(String.valueOf(result.get(i)));

        //     if (i != result.size() - 1) {
        //         bufferedWriter.write(" ");
        //     }
        // }

        // bufferedWriter.newLine();

        // bufferedReader.close();
        // bufferedWriter.close();
    }
}

class Result {

    /*
     * Complete the 'breakingRecords' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     */

    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here
        List<Integer> res = new ArrayList<>();
        int maxCount = 0;
        int minCount = 0;
        int max = scores.get(0);
        int min = scores.get(0);

        for (int n : scores) {
            if (n > max) {
                max = n;
                maxCount++;
            } else if (n < min) {
                min = n;
                minCount++;
            }
        }

        res.add(maxCount);
        res.add(minCount);

        return res;
    }

}
