/* **
    User: seokjung
    Date: 2019.10.17.
    Time: 9:56 PM
    java/P1934.java
    http://www.acmicpc.net/problem/1934
    BOJ_P1934_최소공배수
** */
package net.acmicpc.euclidean;

import java.util.Scanner;

public class P1934 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tc = in.nextInt();
        for (int t = 0; t < tc; t++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int x = a;
            int y = b;
            int remainder = y;
            while (true) {
                if (x % y == 0) {
                    break;
                }
                remainder = x % y;
                x = y;
                y = remainder;
            }
            System.out.println(a * b / remainder);
        }
    }
}
