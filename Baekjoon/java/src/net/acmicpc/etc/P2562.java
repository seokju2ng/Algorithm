/* **
    User: seokjung
    Date: 2019.10.30.
    Time: 5:22 PM
    java/P2562.java
    http://www.acmicpc.net/problem/2562
    BOJ_P2562_최댓값
** */
package net.acmicpc.etc;

import java.io.*;

public class P2562 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        int num = 0;
        for(int i = 1; i <= 9; i++) {
            int n = Integer.parseInt(br.readLine());
            if(max < n) {
                max = n;
                num = i;
            }
        }
        bw.write(max + "\n");
        bw.write(num + "\n");
        bw.flush();
    }
}
