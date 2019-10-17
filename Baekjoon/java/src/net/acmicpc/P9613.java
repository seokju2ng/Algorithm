/* **
    User: seokjung
    Date: 2019.10.17.
    Time: 9:37 PM
    java/P9613.java
    http://www.acmicpc.net/problem/9613
    BOJ_P9613_GCD 합
** */
package net.acmicpc;

import java.util.Scanner;

public class P9613 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tc = in.nextInt();
        for (int i = 0; i < tc; i++) {
            int n = in.nextInt();
            int[] nums = new int[n];
            for (int j = 0; j < n; j++) {
                nums[j] = in.nextInt();
            }
            long sum = 0;
            for (int j = 0; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    sum += gcd(nums[j], nums[k]);
                }
            }
            System.out.println(sum);
        }
    }

    private static int gcd(int x, int y){
        int remainder = y;
        while (true) {
            if (x % y == 0) {
                break;
            }
            remainder = x % y;
            x = y;
            y = remainder;
        }
        return remainder;
    }
}
