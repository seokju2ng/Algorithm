/* **
    User: seokjung
    Date: 2019.10.28.
    Time: 4:53 PM
    java/P2884.java
    http://www.acmicpc.net/problem/2884
    BOJ_P2884_알람시계
** */
package net.acmicpc.etc;

import java.io.*;
import java.util.StringTokenizer;

public class P2884 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        if (m < 45) {
            if(h == 0) {
                h = 23;
            } else {
                h -= 1;
            }
            m += 15;
        } else {
            m -= 45;
        }
        bw.write(h + " " + m + "\n");
        bw.flush();
    }
}
