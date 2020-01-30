/* **
    User: seokjung
    Date: 2020.01.30.
    Time: 8:11 PM
    java/P14501.java
    http://www.acmicpc.net/problem/14501
    BOJ_P14501_퇴사
** */
package net.acmicpc.dp;

import java.io.*;
import java.util.StringTokenizer;

public class P14501 {
    private static int[][] schedule;
    private static int max = 0;
    private static int n = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(br.readLine());
        schedule = new int[n][2];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            schedule[i][0] = Integer.parseInt(st.nextToken());
            schedule[i][1] = Integer.parseInt(st.nextToken());
        }
        dfs(1, 0);
        bw.write(max + "\n");
        bw.flush();
    }

    private static void dfs(int day, int pay) {
        if (day == n + 1) {
            if (max < pay) {
                max = pay;
            }
        }
        if (day > n) {
            return;
        }

        int t = schedule[day - 1][0];
        int p = schedule[day - 1][1];
        dfs(day + t, pay + p);
        dfs(day + 1, pay);
    }
}
