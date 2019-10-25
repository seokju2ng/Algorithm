/* **
    User: seokjung
    Date: 2019.10.25.
    Time: 9:33 AM
    java/P11653.java
    http://www.acmicpc.net/problem/11653
    BOJ_P11653_소인수분해
** */
package net.acmicpc.etc;

import java.io.*;
import java.util.ArrayList;

public class P11653 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        int i = 2;
        int tn = n;

        while (i <= tn) {
            if (tn % i == 0) {
                list.add(i);
                tn /= i;
                i = 2;
            } else {
                i++;
            }
        }

        for(int a : list) {
            bw.write(a + "\n");
        }
        bw.flush();
    }
}
