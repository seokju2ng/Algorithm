/* **
    User: seokjung
    Date: 2019.11.18.
    Time: 6:37 PM
    java/P11048.java
    http://www.acmicpc.net/problem/11048
    BOJ_P11048_이동하기
** */
package net.acmicpc.dp;

import java.io.*;
import java.util.StringTokenizer;

public class P11048 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] miro = new int[n][m];
        int[][] dp = new int[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                miro[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dp[0][0] = miro[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0) {
                    if (j == 0) continue;
                    dp[i][j] = dp[i][j-1] + miro[i][j];
                    continue;
                }
                if (j == 0) {
                    dp[i][j] = dp[i - 1][j] + miro[i][j];
                    continue;
                }
                dp[i][j] = max(dp[i-1][j], dp[i][j-1], dp[i-1][j-1]) + miro[i][j];
            }
        }
        bw.write(dp[n-1][m-1] + "\n");
        bw.flush();
    }

    private static int max(int a, int b, int c) {
        return a > b ? a > c ? a : c : b > c ? b : c;
    }
}
