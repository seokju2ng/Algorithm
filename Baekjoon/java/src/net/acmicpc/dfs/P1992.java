/* **
    User: seokjung
    Date: 2019.11.15.
    Time: 1:19 AM
    java/P1992.java
    http://www.acmicpc.net/problem/1992
    BOJ_P1992_쿼드트리
** */
package net.acmicpc.dfs;

import java.io.*;

public class P1992 {
    private static int[][] bawVideo;
    private static StringBuilder sb = new StringBuilder();
    
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        bawVideo = new int[n][n];

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < s.length(); j++) {
                bawVideo[i][j] = s.charAt(j) - '0';
            }
        }
        
        dfs(0,0,n,n);
        bw.write(sb + "\n");
        bw.flush();
    }
    
    private static void dfs(int sx, int sy, int ex, int ey) {
        if (isCompress(sx, sy, ex, ey)) {
            return;
        }
        sb.append("(");
        dfs(sx, sy, (sx + ex) / 2, (sy + ey) / 2);
        dfs((sx + ex) / 2, sy, ex, (sy + ey) / 2);
        dfs(sx, (sy + ey) / 2, (sx + ex) / 2, ey);
        dfs((sx + ex) / 2, (sy + ey) / 2, ex, ey);
        sb.append(")");
    }

    private static boolean isCompress(int sx, int sy, int ex, int ey) {
        int color = bawVideo[sy][sx];
        for (int i = sy; i < ey; i++) {
            for (int j = sx; j < ex; j++) {
                if (color != bawVideo[i][j]) {
                    return false;
                }
            }
        }
        sb.append(color);
        return true;
    }
}
