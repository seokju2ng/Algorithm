/* **
    User: seokjung
    Date: 2019.11.14.
    Time: 12:17 AM
    java/P9095.java
    http://www.acmicpc.net/problem/9095
    BOJ_P9095_1, 2, 3 더하기
** */
package net.acmicpc.dp;

import java.io.*;

public class P9095 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int[] dp = new int[12];
        dp[1] = 1;  dp[2] = 2; dp[3] = 4;
        for (int i = 4; i < dp.length; i++) {
            dp[i] = dp[i-3] + dp[i-2] + dp[i-1];
        }

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            bw.write(dp[n] + "\n");
        }
        bw.flush();
    }
}
