/* **
    User: Seokjung Kim.
    Date: 2019.11.16.
    Time: 2:12 AM
    ProgrammersPractice/graph/가장 먼 노드
    https://programmers.co.kr/learn/courses/30/lessons/49189
** */
package graph;

import java.util.*;

public class Q1 {
    public int solution(int n, int[][] edge) {
        List<List<Integer>> list = new ArrayList<>();
        int[] distance = new int[n + 1];
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < edge.length; i++) {
            list.add(new ArrayList<>());
        }

        for (int[] ed : edge) {
            int v1 = ed[0];
            int v2 = ed[1];
            list.get(v1).add(v2);
            list.get(v2).add(v1);
        }

        Arrays.fill(distance, -1);

        distance[1] = 0;
        queue.add(1);

        while (!queue.isEmpty()) {
            int prev = queue.poll();
            for (int v : list.get(prev)) {
                if (distance[v] == -1) {
                    distance[v] = distance[prev] + 1;
                    queue.add(v);
                }
            }
        }

        int count = 0;
        int max = distance[0];
        for (int dist : distance) {
            if (max < dist) {
                max = dist;
                count = 1;
            } else if (max == dist) {
                count++;
            }
        }

        return count;
    }
}
