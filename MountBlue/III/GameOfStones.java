/*
9-6-26

*/

public class GameOfStones {
    public static String gameOfStones(int n) {
        if (n < 2)
            return "Second";

        // storing winning/losing pos: true-winning pos(p1 win), false-losing pos(p2
        // win)
        boolean[] dp = new boolean[n + 1];

        // base case implicitely false
        dp[0] = false;
        dp[1] = false;

        for (int i = 2; i <= n; i++) {
            // A player win if successfully forced opponent into losing pos
            if ((i >= 2 && !dp[i - 2]) || (i >= 3 && !dp[i - 3]) || (i >= 5 && !dp[i - 5]))
                dp[i] = true;
            else
                dp[i] = false;
        }

        return dp[n] ? "First" : "Second";
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,10};

        for (int n : arr) {
            System.out.println(gameOfStones(n));
        }
    }
}
