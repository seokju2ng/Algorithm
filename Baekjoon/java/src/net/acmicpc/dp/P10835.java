/* **
    User: seokjung
    Date: 2019.10.24.
    Time: 9:10 AM
    java/P10835.java
    http://www.acmicpc.net/problem/P10835
    BOJ_P10835_카드게임
** */
package net.acmicpc.dp;

import java.io.*;
import java.util.StringTokenizer;

public class P10835 {
    private static int n;
    private static int[] left;
    private static int[] right;
    private static int[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        left = new int[n];
        right = new int[n];
        dp = new int[n + 1][n + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            left[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            right[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                dp[i][j] = -1;
            }
        }
        bw.write(solve(0, 0) + "\n");
        bw.flush();
    }

    private static int solve(int i, int j) {
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
