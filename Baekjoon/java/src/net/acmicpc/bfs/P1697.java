/* **
    User: seokjung
    Date: 2019.10.30.
    Time: 3:37 PM
    java/P1697.java
    http://www.acmicpc.net/problem/1697
    BOJ_P1697_숨바꼭질
** */
package net.acmicpc.bfs;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class P1697 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] d = {1, -1, 2};
        Queue q = new Queue();
        QItem item = new QItem(n, 0);
        q.enqueue(item);

        while(!q.isEmpty()) {
            item = q.dequeue();
            if(item.location == k) {
                break;
            }
            for(int i = 0; i < 3; i++) {
                int next;
                if(i < 2) {
                    next = item.location + d[i];
                } else {
                    next = item.location * d[i];
                }
                if(next >= 0 && next <= Queue.MAX_VAL && !q.isChecked(next)) {
                    q.enqueue(next, item.time + 1);
                }
            }
        }

        bw.write(item.time + "\n");
        bw.flush();
    }
}

class Queue {
    public static final int MAX_VAL = 100000;
    private List<QItem> queue;
    private boolean[] chk;

    Queue() {
        this.queue = new ArrayList<>();
        this.chk = new boolean[MAX_VAL * 2 + 1];
    }

    void enqueue(QItem item) {
        queue.add(item);
        chk[item.location] = true;
    }

    void enqueue(int location, int time) {
        enqueue(new QItem(location, time));
    }

    QItem dequeue() {
        return queue.remove(0);
    }

    boolean isEmpty() {
        return queue.isEmpty();
    }
    boolean isChecked(int location) {
        return chk[location];
    }
}

class QItem {
    int location;
    int time;

    QItem(int location, int time) {
        this.location = location;
        this.time = time;
    }
}
