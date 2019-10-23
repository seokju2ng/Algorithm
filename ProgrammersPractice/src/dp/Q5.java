/* **
    User: Seokjung Kim.
    Date: 2019.10.22.
    Time: 09:03 AM
    ProgrammersPractice/Q5
    동적계획법 > 카드 게임
    https://programmers.co.kr/learn/courses/30/lessons/42896
** */
package dp;

public class Q5 {
    private int[][] dp;
    private int n;
    private int[] left;
    private int[] right;

    public int solution(int[] left, int[] right) {
        n = left.length;
        dp = new int[n + 1][n + 1];
        this.left = left;
        this.right = right;

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                dp[i][j] = -1;
            }
        }
        return solve(0, 0);
    }

    private int solve(int i, int j) {
        if (i >= n || j >= n) {
            return dp[i][j] = 0;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        if (left[i] > right[j]) {
            dp[i][j] = Math.max(dp[i][j], solve(i, j + 1) + right[j]);
        }
        dp[i][j] = Math.max(dp[i][j], solve(i + 1, j));
        dp[i][j] = Math.max(dp[i][j], solve(i + 1, j + 1));
        return dp[i][j];
    }
}
