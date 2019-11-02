/* **
    User: seokjung
    Date: 2019.11.02.
    Time: 9:17 PM
    java/P1676.java
    http://www.acmicpc.net/problem/1676
    BOJ_P1676_팩토리얼 0의 개수
** */
package net.acmicpc.etc;

import java.io.*;

public class P1676 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int chk = 0;

        for (int i = 2; i <= num; i++) {
            int n = i;
            while (n % 5 == 0) {
                chk++;
                n /= 5;
            }
        }

        bw.write(chk + "\n");
        bw.flush();
    }
}
