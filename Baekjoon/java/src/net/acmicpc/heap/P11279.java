/* **
    User: seokjung
    Date: 2019.10.09.
    Time: 7:03 AM
    java/P11279.java
    http://www.acmicpc.net/problem/11279
    BOJ_P11279_최대 힙
** */
package net.acmicpc.heap;

import java.io.*;
import java.util.PriorityQueue;

public class P11279 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>(n, (x, y) -> y - x);

        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(br.readLine());
            if (x == 0) {
                if (pq.isEmpty()) {
                    bw.write("0\n");
                } else {
                    bw.write(pq.poll()+"\n");
                }
            }
            else {
                pq.add(x);
            }
        }
        bw.flush();
    }
}
