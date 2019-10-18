/* **
    User: seokjung
    Date: 2019.10.19.
    Time: 1:20 AM
    java/P2579.java
    http://www.acmicpc.net/problem/2579
    BOJ_P2579_계단 오르기
** */
package net.acmicpc.dp;

import java.io.*;

public class P2579 {
    private static final int WAYS_TO_CLIMB = 3;
    private static final int NO_STEP = 0;
    private static final int FIRST_STEP = 1;
    private static final int SECOND_STEP = 2;

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] stairs = new int[n];
        int[][] dp = new int[n][WAYS_TO_CLIMB];

        for (int i = 0; i < n; i++) {
            stairs[i] = Integer.parseInt(br.readLine());
        }

        dp[0][FIRST_STEP] = stairs[0];
        dp[0][SECOND_STEP] = stairs[0];

        for (int i = 1; i < n; i++) {
            dp[i][NO_STEP] = max(dp[i-1][FIRST_STEP], dp[i-1][SECOND_STEP]);
            dp[i][FIRST_STEP] = stairs[i] + dp[i-1][NO_STEP];
            dp[i][SECOND_STEP] = stairs[i] + dp[i-1][FIRST_STEP];
        }

        bw.write(max(dp[n-1][FIRST_STEP], dp[n-1][SECOND_STEP]) + "\n");
        bw.flush();
    }

    private static int max(int a, int b) {
        return a > b ? a : b;
    }
}
