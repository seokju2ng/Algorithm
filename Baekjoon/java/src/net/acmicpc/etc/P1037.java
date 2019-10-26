/* **
    User: seokjung
    Date: 2019.10.25.
    Time: 9:57 AM
    java/P1037.java
    http://www.acmicpc.net/problem/1037
    BOJ_P1037_약수
** */
package net.acmicpc.etc;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1037 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] ary = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i ++) {
            ary[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(ary);
        bw.write((ary[0] * ary[n-1]) + "\n");
        bw.flush();
    }
}
