/* **
    User: seokjung
    Date: 2019.10.18.
    Time: 1:05 AM
    java/P2156.java
    http://www.acmicpc.net/problem/2156
    BOJ_P2156_포도주 시식
** */
package net.acmicpc.dp;

import java.io.*;

public class P2156 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        if (n == 1) {
            bw.write(br.readLine() + "\n");
            bw.flush();
            return;
        }

        int[] wines = new int[n + 1];
        int[] dp = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            wines[i] = Integer.parseInt(br.readLine());
        }

        dp[1] = wines[1];
        dp[2] = wines[1] + wines[2];

        for (int i = 3; i <= n; i++) {
            dp[i] = maxOfThree(dp[i - 2] + wines[i], dp[i - 3] + wines[i - 1] + wines[i], dp[i - 1]);
        }
        bw.write(dp[n] + "\n");
        bw.flush();
    }

    private static int maxOfThree(int a, int b, int c) {
        return a > b ? (a > c ? a : c) : (b > c ? b : c);
//        return Math.max(Math.max(a, b), c);
    }
}
