/* **
    User: seokjung
    Date: 2019.11.15.
    Time: 11:28 PM
    java/P15649.java
    http://www.acmicpc.net/problem/15649
    BOJ_P15649_N과 M (1)
** */
package net.acmicpc.dfs;

import java.io.*;
import java.util.StringTokenizer;

public class P15649 {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int[] perm;
    private static boolean[] checked;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        checked = new boolean[n + 1];
        perm = new int[m];
        dfs(0);
        bw.flush();
    }

    private static void dfs(int idx) throws IOException{
        if (idx == perm.length) {
            for (int p : perm) {
                bw.write(p + " ");
            }
            bw.write("\n");
            return;
        }
        for (int i = 1; i < checked.length; i++) {
            if (!checked[i]) {
                checked[i] = true;
                perm[idx] = i;
                dfs(idx + 1);
                checked[i] = false;
            }
        }
    }
}
