/* **
    User: seokjung
    Date: 2019.10.17.
    Time: 4:12 PM
    java/P2577.java
    http://www.acmicpc.net/problem/2577
    BOJ_P2577_숫자의 개수
** */
package net.acmicpc.etc;

import java.util.Scanner;

public class P2577 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] res = new int[10];
        int input = 1;
        for (int i = 0; i < 3; i++) {
            input *= in.nextInt();
        }
        String str = String.valueOf(input);
        for (int i = 0; i < str.length(); i++) {
            res[str.charAt(i) - '0']++;
        }
        for (int i : res) {
            System.out.println(i);
        }
    }
}
