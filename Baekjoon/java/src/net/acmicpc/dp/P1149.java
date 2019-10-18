/* **
    User: seokjung
    Date: 2019.10.18.
    Time: 11:25 PM
    java/P1149.java
    http://www.acmicpc.net/problem/1149
    BOJ_P1149_RGB거리
** */
package net.acmicpc.dp;

import java.io.*;
import java.util.StringTokenizer;

public class P1149 {
    private static final int R = 0;
    private static final int G = 1;
    private static final int B = 2;
    private static final int NUM_OF_COLOR = 3;

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] costRGB = new int[n][NUM_OF_COLOR];
        int[][] dp = new int[n][NUM_OF_COLOR];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            costRGB[i][R] = Integer.parseInt(st.nextToken());
            costRGB[i][G] = Integer.parseInt(st.nextToken());
            costRGB[i][B] = Integer.parseInt(st.nextToken());
        }
        dp[0][R] = costRGB[0][R];
        dp[0][G] = costRGB[0][G];
        dp[0][B] = costRGB[0][B];

        for (int i = 1; i < n; i++) {
            dp[i][R] = costRGB[i][R] + min(dp[i-1][G], dp[i-1][B]);
            dp[i][G] = costRGB[i][G] + min(dp[i-1][R], dp[i-1][B]);
            dp[i][B] = costRGB[i][B] + min(dp[i-1][R], dp[i-1][G]);
        }

        bw.write(min(dp[n-1][R], dp[n-1][G], dp[n-1][B]) + "\n");
        bw.flush();
    }

    private static int min(int a, int b) {
        return a < b ? a : b;
    }

    private static int min(int a, int b, int c) {
        return a < b ? (a < c ? a : c) : (b < c ? b : c);
    }
}
