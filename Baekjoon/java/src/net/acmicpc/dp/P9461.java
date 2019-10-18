/* **
    User: seokjung
    Date: 2019.10.19.
    Time: 1:48 AM
    java/P9461.java
    http://www.acmicpc.net/problem/9461
    BOJ_P9461_파도반 수열
** */
package net.acmicpc.dp;

import java.io.*;

public class P9461 {
    private static final int MAX = 100 + 1;

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        long[] p = new long[MAX];

        p[1] = p[2] = p[3] = 1;
        p[4] = 2;
        for(int i = 5; i < MAX; i++) {
            p[i] = p[i-5] + p[i-1];
        }

        for(int t = 0; t < tc; t++) {
            int n = Integer.parseInt(br.readLine());
            bw.write(p[n] + "\n");
        }

        bw.flush();
    }
}
