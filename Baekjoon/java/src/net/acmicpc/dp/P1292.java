/* **
    User: seokjung
    Date: 2020.03.04.
    Time: 1:25 AM
    java/P1292.java
    http://www.acmicpc.net/problem/1292
    BOJ_P1292_쉽게 푸는 문제
** */
package net.acmicpc.dp;

import java.io.*;
import java.util.StringTokenizer;

public class P1292 {
    private static int[] perm = null;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        initPerm(b);

        bw.write(sumAToB(a, b) + "\n");
        bw.flush();
    }

    private static void initPerm(int size) {
        perm = new int[size];

        int i = 0;
        int e = 1;
        int cnt = 0;

        while (i < size) {
            if (cnt < e) {
                cnt++;
                perm[i++] = e;
            } else {
                e++;
                cnt = 0;
            }
        }
    }

    private static int sumAToB(int a, int b) {
        int sum = 0;

        for (int i = a - 1; i < b; i++) {
            sum += perm[i];
        }

        return sum;
    }
}
