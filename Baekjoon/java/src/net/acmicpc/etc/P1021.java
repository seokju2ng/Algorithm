/* **
    User: seokjung
    Date: 2019.11.13.
    Time: 5:38 AM
    java/P1021.java
    http://www.acmicpc.net/problem/1021
    BOJ_P1021_회전하는 큐
** */
package net.acmicpc.etc;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P1021 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        ArrayList<Integer> list = new ArrayList<>();
        int result = 0;
        int index = 0;

        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < m; i++) {
            int num = Integer.parseInt(st.nextToken());
            int moves = 0;

            while (true) {
                if (index == list.size()) {
                    index = 0;
                }
                if (list.get(index) == num) {
                    break;
                }
                index++;
                moves++;
            }

            result += moves < list.size() - moves ? moves : list.size() - moves;
            list.remove(index);
        }

        bw.write(result + "\n");
        bw.flush();
    }
}
