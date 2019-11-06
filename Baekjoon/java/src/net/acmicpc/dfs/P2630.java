/* **
    User: seokjung
    Date: 2019.11.07.
    Time: 3:35 AM
    java/P2630.java
    http://www.acmicpc.net/problem/2630
    BOJ_P2630_색종이 만들기
** */
package net.acmicpc.dfs;

import java.io.*;
import java.util.StringTokenizer;

public class P2630 {
    private static final int WHITE = 0;
    private static final int BLUE = 1;
    private static int[][] givenPaper;
    private static int[] cntPaper = new int[2];

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        givenPaper = new int[n][n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                givenPaper[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0, 0, n, n);
        bw.write(cntPaper[WHITE] + "\n");
        bw.write(cntPaper[BLUE] + "\n");
        bw.flush();
    }

    private static void dfs(int sx, int sy, int ex, int ey) {
        if (cntIfOneColor(sx, sy, ex, ey)) {
            return;
        }
        dfs(sx, sy, (sx + ex) / 2, (sy + ey) / 2);
        dfs(sx, (sy + ey) / 2, (sx + ex) / 2, ey);
        dfs((sx + ex) / 2, sy, ex, (sy + ey) / 2);
        dfs((sx + ex) / 2, (sy + ey) / 2, ex, ey);
    }

    private static boolean cntIfOneColor(int sx, int sy, int ex, int ey) {
        int color = givenPaper[sy][sx];
        for (int i = sy; i < ey; i++) {
            for (int j = sx; j < ex; j++) {
                if (color != givenPaper[i][j]) {
                    return false;
                }
            }
        }
        cntPaper[color]++;
        return true;
    }
}
