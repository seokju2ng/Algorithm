/* **
    User: seokjung
    Date: 2019.11.13.
    Time: 7:46 AM
    java/P1655.java
    http://www.acmicpc.net/problem/1655
    BOJ_P1655_가운데를 말해요
** */
package net.acmicpc.heap;

import java.io.*;
import java.util.PriorityQueue;

public class P1655 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((x, y) -> y - x);  // 중간 기준 left
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(); // 중간 기준 right

        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(br.readLine());

            if (maxHeap.size() == minHeap.size()) { // push left
                if (maxHeap.isEmpty() || minHeap.peek() >= x) {
                    maxHeap.add(x);
                }
                else {
                    maxHeap.add(minHeap.poll());
                    minHeap.add(x);
                }
            }
            else if (maxHeap.size() > minHeap.size()) { // push right
                if (maxHeap.peek() <= x) {
                    minHeap.add(x);
                }
                else {
                    minHeap.add(maxHeap.poll());
                    maxHeap.add(x);
                }
            }

            bw.write(maxHeap.peek() + "\n");
        }
        bw.flush();
    }
}

/* 시간초과 */
//public class P1655 {
//    public static void main(String[] args) throws IOException {
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        ArrayList<Integer> pq = new ArrayList<>();
//
//        for (int i = 0; i < n; i++) {
//            int x = Integer.parseInt(br.readLine());
//            boolean isAdded = false;
//            for (int j = 0; j < pq.size(); j++) {
//                if (pq.get(j) >= x) {
//                    pq.add(j, x);
//                    isAdded = true;
//                    break;
//                }
//            }
//            if (!isAdded) {
//                pq.add(x);
//            }
//            bw.write(pq.get((pq.size() - 1) / 2) + "\n");
//        }
//        bw.flush();
//    }
//}
