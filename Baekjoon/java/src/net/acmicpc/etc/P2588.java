/* **
    User: seokjung
    Date: 2019.10.27.
    Time: 4:44 PM
    java/P2588.java
    http://www.acmicpc.net/problem/2588
    BOJ_P2588_곱셈
** */
package net.acmicpc.etc;

import java.io.*;

public class P2588 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n1 = Integer.parseInt(br.readLine());
        String s2 = br.readLine();
        int n2 = Integer.parseInt(s2);
        int n2_1 = s2.charAt(2) - '0';
        int n2_10 = s2.charAt(1) - '0';
        int n2_100 = s2.charAt(0) - '0';
        bw.write(n1 * n2_1 + "\n");
        bw.write(n1 * n2_10 + "\n");
        bw.write(n1 * n2_100 + "\n");
        bw.write(n1 * n2 + "\n");
        bw.flush();
    }
}
