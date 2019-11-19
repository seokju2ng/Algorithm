/* **
    User: seokjung
    Date: 2019.11.19.
    Time: 8:09 PM
    java/P1748.java
    http://www.acmicpc.net/problem/1748
    BOJ_P1748_수 이어 쓰기 1
** */
package net.acmicpc.etc;

import java.io.*;

public class P1748 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int result = 0;
        for (int i = 1; i <= n; i++) {
            int mod = i;
            while (mod > 0) {
                result++;
                mod /= 10;
            }
        }
        bw.write(result + "\n");
        bw.flush();
    }
}
