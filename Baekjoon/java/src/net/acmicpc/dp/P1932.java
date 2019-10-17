/* **
    User: seokjung
    Date: 2019.10.17.
    Time: 10:33 PM
    java/P1932.java
    http://www.acmicpc.net/problem/1932
    BOJ_P1932_정수 삼각형
** */
package net.acmicpc.dp;

import java.util.Scanner;

public class P1932 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int height = in.nextInt();
        int[][] tri = new int[height][];

        for (int i = 0; i < height; i++) {
            tri[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                tri[i][j] = in.nextInt();
            }
        }

        for (int i = height - 1; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                tri[i - 1][j - 1] += tri[i][j] > tri[i][j - 1] ? tri[i][j] : tri[i][j - 1];
            }
        }

        System.out.println(tri[0][0]);
    }
}
