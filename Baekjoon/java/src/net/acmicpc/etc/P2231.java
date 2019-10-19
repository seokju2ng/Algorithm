/* **
    User: seokjung
    Date: 2019.10.19.
    Time: 12:07 PM
    java/P2231.java
    http://www.acmicpc.net/problem/2231
    BOJ_P2231_분해합_브루트 포스
** */
package net.acmicpc.etc;

import java.io.*;

public class P2231 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int constructor = 0;

        for(int i = 0; i < n; i++) {
            int temp = i;
            int sum = i;
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
            if(sum == n) {
                constructor = i;
                break;
            }
        }
        bw.write(constructor + "\n");
        bw.flush();
    }
}
