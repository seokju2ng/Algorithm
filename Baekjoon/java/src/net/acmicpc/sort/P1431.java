/* **
    User: seokjung
    Date: 2019.10.17.
    Time: 4:56 PM
    java/P1431.java
    http://www.acmicpc.net/problem/1431
    BOJ_P1431_시리얼 번호
** */
package net.acmicpc.sort;

import java.util.ArrayList;
import java.util.Scanner;

public class P1431 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(in.next());
        }

        list.sort((a, b) -> {
            if (a.length() != b.length()) {
                return a.length() - b.length();
            }
            int sumA = sumOfNumInString(a);
            int sumB = sumOfNumInString(b);
            if (sumA != sumB) {
                return sumA - sumB;
            }
            return a.compareTo(b);
        });

        list.forEach(serial -> System.out.println(serial));
    }

    private static int sumOfNumInString(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9') {
                sum += ch - '0';
            }
        }
        return sum;
    }
}
