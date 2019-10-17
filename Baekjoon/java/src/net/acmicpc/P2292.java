/* **
    User: seokjung
    Date: 2019.10.17.
    Time: 4:13 PM
    java/P2292.java
    http://www.acmicpc.net/problem/2292
    BOJ_P2292_벌집
** */
package net.acmicpc;

import java.util.Scanner;

public class P2292 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();//, i = 1;
        int cnt = 0, six = 0;
        //while(n-1>3*i*(i-1)) i++;
        while(n > 1){
            six +=  6;
            n -= six;
            cnt++;
        } cnt++;
        System.out.println(cnt);
    }
}
