/* **
    User: seokjung
    Date: 2019.10.17.
    Time: 4:04 PM
    java/P1152.java
    http://www.acmicpc.net/problem/1152
    BOJ_P1152_단어의 개수
** */
package net.acmicpc;

import java.util.Scanner;

public class P1152 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        //String[] split = str.trim().split(" ");
        //int num = split.length;
        int num = 0;
        if(str.charAt(0) == ' ') num--;
        if(str.charAt(str.length()-1) == ' ') num--;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ' ') num++;
        }
        System.out.println(num+1);
    }
}
