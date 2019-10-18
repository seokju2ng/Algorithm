/* **
    User: seokjung
    Date: 2019.10.19.
    Time: 12:32 AM
    java/P10844.java
    http://www.acmicpc.net/problem/10844
    BOJ_P10844_쉬운 계단 수
** */
package net.acmicpc.dp;

import java.io.*;

public class P10844 {
    private static final int MOD = 1000000000;
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] dp = new int[n + 1][10];
        int sum = 0;

        for(int i = 1; i < 10; i++) {
            dp[1][i] = 1;
        }
        for(int i = 2; i <= n; i++) {
            dp[i][0] = dp[i-1][1];
            for(int j = 1; j < 9; j++) {
                dp[i][j] = (dp[i-1][j-1] + dp[i-1][j+1]) % MOD;
            }
            dp[i][9] = dp[i-1][8];
        }
        for(int i = 0; i < 10; i++) {
            sum = (sum + dp[n][i]) % MOD;
        }

        bw.write(sum + "\n");
        bw.flush();
    }
}
