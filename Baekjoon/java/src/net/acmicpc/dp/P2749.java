/* **
    User: seokjung
    Date: 2019.11.05.
    Time: 5:03 PM
    java/P2749.java
    http://www.acmicpc.net/problem/2749
    BOJ_P2749_피보나치 수 3
** */
package net.acmicpc.dp;

import java.io.*;

public class P2749 {
    private static final int MOD = 1000000;     // MOD로 나눈 나머지
    private static final int P = MOD / 10 * 15; // 피사노 주기

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());

        int[] fibo = new int[P];
        fibo[0] = 0;
        if (P > 0) fibo[1] = 1;

        for (int i = 2; i < P; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
            fibo[i] %= MOD;
        }

        bw.write(fibo[(int) (n % P)] + "\n");
        bw.flush();
    }
}
