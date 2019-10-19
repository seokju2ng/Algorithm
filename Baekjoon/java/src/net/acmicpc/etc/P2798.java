/* **
    User: seokjung
    Date: 2019.10.19.
    Time: 11:48 AM
    java/P2798.java
    http://www.acmicpc.net/problem/2798
    BOJ_P2798_블랙잭
** */
package net.acmicpc.etc;

import java.io.*;
import java.util.StringTokenizer;

public class P2798 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] cards = new int[n];
        int max = 0;
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    int sum = cards[i] + cards[j] + cards[k];
                    if (sum <= m && sum > max) {
                        max = sum;
                    }
                }
            }
        }

        bw.write(max + "\n");
        bw.flush();
    }
}

