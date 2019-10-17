/* **
    User: seokjung
    Date: 2019.10.17.
    Time: 5:25 PM
    java/P1181.java
    http://www.acmicpc.net/problem/1181
    BOJ_P1181_단어 정렬
** */
package net.acmicpc;

import java.util.Arrays;
import java.util.Scanner;

public class P1181 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] ary = new String[n];
        for (int i = 0; i < n; i++) {
            ary[i] = in.next();
        }

        Arrays.sort(ary, (a, b) -> {
            if (a.length() != b.length()) {
                return a.length() - b.length();
            }
            return a.compareTo(b);
        });


        for (int i = 0; i < n; i++) {
            if (i == 0) {
                System.out.println(ary[i]);
                continue;
            }
            if (!ary[i - 1].equals(ary[i])) {
                System.out.println(ary[i]);
            }
        }
    }
}
