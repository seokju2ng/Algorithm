/* **
    User: seokjung
    Date: 2019.10.17.
    Time: 9:13 PM
    java/P2609.java
    http://www.acmicpc.net/problem/2609
    BOJ_P2609_최대공약수와 최소공배수
** */
package net.acmicpc;

import java.util.Scanner;

public class P2609 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int greatestCommonMeasure = gcd(x, y);
        int leastCommonMultiple = x * y / greatestCommonMeasure;
        System.out.println(greatestCommonMeasure);
        System.out.println(leastCommonMultiple);
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
