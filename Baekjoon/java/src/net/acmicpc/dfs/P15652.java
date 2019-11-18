/* **
    User: seokjung
    Date: 2019.11.16.
    Time: 12:01 AM
    java/P15651.java
    http://www.acmicpc.net/problem/15652
    BOJ_P15651_N과 M (4)
** */
package net.acmicpc.dfs;

import java.io.*;
import java.util.StringTokenizer;

public class P15652 {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int[] perm;
    private static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        perm = new int[m];
        dfs(0, 0);
        bw.flush();
    }

    private static void dfs(int idx, int num) throws IOException{
        if (idx == perm.length) {
            for (int p : perm) {
                bw.write(p + " ");
            }
            bw.write("\n");
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (i >= num) {
                perm[idx] = i;
                dfs(idx + 1, i);
            }
        }
    }
}
