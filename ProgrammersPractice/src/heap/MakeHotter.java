/* **
    User: 김석중. 
    Date: 2019.10.10.
    Time: 10:28 PM
    ProgrammersPractice/MakeHotter
    힙(Heap) - 더 맵게
    https://programmers.co.kr/learn/courses/30/lessons/42626
** */
package heap;
import java.util.PriorityQueue;

public class MakeHotter {
    public static void main(String[] args) {
        int[] scoville = {1,2,3,9,10,12};
        int K = 7;
        System.out.println(new Solution1().solution(scoville, K));
    }
}
class Solution1 {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i : scoville) pq.add(i);

        int cnt = 0;
        while (true) {
            if (pq.peek() >= K) break;
            if (pq.size() == 1) return -1;
            pq.add(pq.poll()+(pq.poll()*2));
            cnt++;
        }

        return cnt;
    }
}