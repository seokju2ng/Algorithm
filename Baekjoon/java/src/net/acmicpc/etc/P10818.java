/* **
    User: seokjung
    Date: 2019.10.30.
    Time: 5:08 PM
    java/P10818.java
    http://www.acmicpc.net/problem/10818
    BOJ_P10818_최소, 최대
** */
package net.acmicpc.etc;

import java.io.*;
import java.util.StringTokenizer;

public class P10818 {
    private static final int MAX_VAL = 1000000;
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int min = MAX_VAL;
        int max = -MAX_VAL;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        bw.write(min + " " + max + "\n");
        bw.flush();
    }
}
