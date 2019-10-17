/* **
    User: seokjung
    Date: 2019.10.17.
    Time: 4:08 PM
    java/P1929.java
    http://www.acmicpc.net/problem/1929
    BOJ_P1929_소수 구하기
** */
package net.acmicpc;

import java.util.ArrayList;
import java.util.Scanner;

public class P1929 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> prime = new ArrayList<>();
        int m = in.nextInt();
        int n = in.nextInt();
        getPrime(m, n, prime);
    }

    private static void getPrime(int m, int n, ArrayList<Integer> prime) {
        prime.add(2);
        for (int i = 2; i <= n; i++) {
            for (int j = 0; prime.size() > j; j++) {
                if (i % prime.get(j) == 0) break; // 소수가 아닌 경우 pass
                if (j + 1 == prime.size()) // 소수일 때
                    prime.add(i);
            }
        }
        for (Integer result : prime) {
            if(result >= m)
                System.out.println(result);
        }
    }
}
