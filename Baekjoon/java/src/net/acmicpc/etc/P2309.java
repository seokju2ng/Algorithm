/* **
    User: seokjung
    Date: 2019.10.18.
    Time: 4:09 PM
    java/P2309.java
    http://www.acmicpc.net/problem/2309
    BOJ_P2309_일곱 난쟁이_브루트 포스
** */
package net.acmicpc.etc;

import java.io.*;
import java.util.Arrays;

public class P2309 {
    private static final int NUM_OF_DWARF = 9;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] heights = new int[NUM_OF_DWARF];
        int sum = 0;

        for (int i = 0; i < NUM_OF_DWARF; i++) {
            heights[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < NUM_OF_DWARF; i++) {
            for (int j = i + 1; j < NUM_OF_DWARF; j++) {
                sum = 0;
                for (int k = 0; k < NUM_OF_DWARF; k++) {
                    if (k != i && k != j) {
                        sum += heights[k];
                    }
                }
                if (sum == 100) {
                    heights[i] = 0;
                    heights[j] = 0;
                    break;
                }
            }
            if (sum == 100) {
                break;
            }
        }
        Arrays.sort(heights);

        for (int i = 2; i < NUM_OF_DWARF; i++) {
            bw.write(heights[i] + "\n");
        }
        bw.flush();
    }
}
