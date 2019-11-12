/* **
    User: seokjung
    Date: 2019.11.13.
    Time: 7:32 AM
    java/P11286.java
    http://www.acmicpc.net/problem/11286
    BOJ_P11286_절댓값 힙
** */
package net.acmicpc.heap;

import java.io.*;
import java.util.PriorityQueue;

public class P11286 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>(n, (x, y) -> {
            if (Math.abs(x) < Math.abs(y)) {
                return -1;
            } else if (Math.abs(x) > Math.abs(y)) {
                return 1;
            } else {
                return x - y;
            }
        });

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
