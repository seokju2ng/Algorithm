/* **
    User: seokjung
    Date: 2019.11.04.
    Time: 4:56 PM
    java/P10826.java
    http://www.acmicpc.net/problem/10826
    BOJ_P10826_피보나치 수 4
** */
package net.acmicpc.dp;

import java.io.*;
import java.math.BigInteger;

public class P10826 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        BigInteger[] fibo = new BigInteger[n + 1];
        fibo[0] = BigInteger.ZERO;
        if (n > 0) fibo[1] = BigInteger.ONE;

        for (int i = 2; i <= n; i++) {
            fibo[i] = fibo[i - 1].add(fibo[i - 2]);
        }

        bw.write(fibo[n] + "\n");
        bw.flush();
    }
}
