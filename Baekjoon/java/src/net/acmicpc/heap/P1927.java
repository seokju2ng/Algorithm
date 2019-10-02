/* **
    User: seokjung
    Date: 2019.10.03.
    Time: 7:22 AM
    java/P1927.java
    http://www.acmicpc.net/problem/1927
    BOJ_P1927_최소 힙
** */
package net.acmicpc.heap;

import java.io.*;
import java.util.PriorityQueue;

public class P1927 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();

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
