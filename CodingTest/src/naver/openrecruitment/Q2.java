package naver.openrecruitment;

import java.util.PriorityQueue;

public class Q2 {
    public static void main(String[] args) {
        Solution1 s = new Solution1();
        System.out.println(s.solution(1));
        System.out.println(s.solution(2));
        System.out.println(s.solution(4));
        System.out.println(s.solution(9));
    }
}
class Solution1 {
    private PriorityQueue<Integer> pq = new PriorityQueue<>();
    public long solution(int n) {
        long answer = 0;
        initQueue(n);
        for(int i = 0; i < n; i++) {
            answer = pq.poll();
        }
        return answer;
    }
    private void initQueue(int n) {
        for(int i = 1; i <= n; i++) {
            int multi = i;
            for (int j = i + 1; j <= n + 1; j++) {
                multi *= j;
                if(!pq.contains(multi)) {
                    pq.add(multi);
                }
            }
        }
    }
}
