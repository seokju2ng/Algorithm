/* **
    User: seokjung
    Date: 2019.11.03.
    Time: 9:46 PM
    java/P10870.java
    http://www.acmicpc.net/problem/P10870
    BOJ_P10870_피보나치 수 5
** */
package net.acmicpc.dp;

import java.io.*;

public class P10870 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] fibo = new int[n + 1];
        fibo[0] = 0;
        if (n > 0) fibo[1] = 1;

        for (int i = 2; i <= n; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }

        bw.write(fibo[n] + "\n");
        bw.flush();
    }
}
