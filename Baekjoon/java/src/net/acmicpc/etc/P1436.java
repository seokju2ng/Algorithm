/* **
    User: seokjung
    Date: 2019.10.19.
    Time: 3:51 PM
    java/P1436.java
    http://www.acmicpc.net/problem/1436
    BOJ_P1436_영화감독 숌
** */
package net.acmicpc.etc;

import java.io.*;

public class P1436 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        int i = 1;

        while (true) {
            if(isNumOfBeast(i)) {
                cnt++;
                if(cnt == n) {
                    bw.write(i + "\n");
                    break;
                }
            }
            i++;
        }
        bw.flush();
    }

    private static boolean isNumOfBeast(int n) {    // 666이 포함되면 true 리턴
        String num = String.valueOf(n);
        int cnt = 0;
        for (int i = 0; i < num.length(); i++) {
            if(num.charAt(i) == '6') {
                cnt++;
                if(cnt == 3) {
                    return true;
                }
            } else {
                cnt = 0;
            }
        }
        return false;
    }
}
