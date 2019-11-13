/* **
    User: seokjung
    Date: 2019.11.14.
    Time: 12:31 AM
    java/P1780.java
    http://www.acmicpc.net/problem/1780
    BOJ_P1780_종이의 개수
** */
package net.acmicpc.dfs;

import java.io.*;
import java.util.StringTokenizer;

public class P1780 {
    private static final int MINUS_ONE = -1;
    private static final int ZERO = 0;
    private static final int PLUS_ONE = 1;
    private static int[][] givenPaper;
    private static int[] cntPaper = new int[3];

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
        bw.write(cntPaper[MINUS_ONE + 1] + "\n");
        bw.write(cntPaper[ZERO + 1] + "\n");
        bw.write(cntPaper[PLUS_ONE + 1] + "\n");
        bw.flush();
    }

    private static void dfs(int sx, int sy, int ex, int ey) {
        if (cntIfOneColor(sx, sy, ex, ey)) {
            return;
        }
        dfs(sx, sy, sx + (ex - sx) / 3, sy + (ey - sy) / 3);
        dfs(sx, sy + (ey - sy) / 3, sx + (ex - sx) / 3, sy + (ey - sy) / 3 * 2);
        dfs(sx, sy + (ey - sy) / 3 * 2, sx + (ex - sx) / 3, ey);
        dfs(sx + (ex - sx) / 3, sy, sx + (ex - sx) / 3 * 2, sy + (ey - sy) / 3);
        dfs(sx + (ex - sx) / 3, sy + (ey - sy) / 3, sx + (ex - sx) / 3 * 2, sy + (ey - sy) / 3 * 2);
        dfs(sx + (ex - sx) / 3, sy + (ey - sy) / 3 * 2, sx + (ex - sx) / 3 * 2, ey);
        dfs(sx + (ex - sx) / 3 * 2, sy, ex, sy + (ey - sy) / 3);
        dfs(sx + (ex - sx) / 3 * 2, sy + (ey - sy) / 3, ex, sy + (ey - sy) / 3 * 2);
        dfs(sx + (ex - sx) / 3 * 2, sy + (ey - sy) / 3 * 2, ex, ey);
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
        cntPaper[color + 1]++;
        return true;
    }
}
