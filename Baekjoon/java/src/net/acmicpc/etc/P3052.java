/* **
    User: seokjung
    Date: 2019.10.30.
    Time: 5:25 PM
    java/P3052.java
    http://www.acmicpc.net/problem/3052
    BOJ_P3052_나머지
** */
package net.acmicpc.etc;

import java.io.*;

public class P3052 {
    private static final int NUMBER = 42;

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] chk = new boolean[NUMBER];
        int num = 0;
        for (int i = 1; i <= 10; i++) {
            int n = Integer.parseInt(br.readLine());
            if (!chk[n % NUMBER]) {
                chk[n % NUMBER] = true;
                num++;
            }
        }
        bw.write(num + "\n");
        bw.flush();
    }
}
