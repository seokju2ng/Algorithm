/* **
    User: seokjung
    Date: 2019.10.19.
    Time: 4:38 PM
    java/P1912.java
    http://www.acmicpc.net/problem/1912
    BOJ_P1912_연속합
** */
package net.acmicpc.dp;

import java.io.*;
import java.util.StringTokenizer;

public class P1912 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] ary = new int[n];
        int max;

        for(int i = 0; i < n; i++) {
            ary[i] = Integer.parseInt(st.nextToken());
        }

        max = ary[0];
        for(int i = 1; i < n; i++) {
            ary[i] = ary[i] > ary[i-1] + ary[i] ? ary[i] : ary[i-1] + ary[i];
            if(max < ary[i]) {
                max = ary[i];
            }
        }

        bw.write(max + "\n");
        bw.flush();
    }
}
