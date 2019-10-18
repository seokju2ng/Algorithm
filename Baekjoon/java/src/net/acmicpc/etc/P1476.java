/* **
    User: seokjung
    Date: 2019.10.18.
    Time: 4:28 PM
    java/P1476.java
    http://www.acmicpc.net/problem/P1476
    BOJ_P1476_날짜 계산
** */
package net.acmicpc.etc;

import java.io.*;
import java.util.StringTokenizer;

public class P1476 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int e = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int year = 0;

        while(true) {
            int x = year % 15;
            int y = year % 28;
            int z = year % 19;
            if(x == e-1 && y == s-1 && z == m-1) {
                break;
            }
            year++;
        }
        bw.write((year+1)+"\n");
        bw.flush();
    }
}
