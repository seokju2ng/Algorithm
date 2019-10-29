/* **
    User: seokjung
    Date: 2019.10.29.
    Time: 5:03 PM
    java/P11022.java
    http://www.acmicpc.net/problem/11022
    BOJ_P11022_A+B - 8
** */
package net.acmicpc.etc;

import java.io.*;
import java.util.StringTokenizer;

public class P11022 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());
            bw.write("Case #" + i + ": " + n1 + " + " + n2 + " = " + (n1 + n2) + "\n");
        }
        bw.flush();
    }
}
