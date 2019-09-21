package dp;

public class Tile {
    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.solution(5));
        System.out.println(s.solution(6));
        System.out.println(s.solution(1));
        System.out.println(s.solution(2));
        System.out.println(s.solution(80));
    }
}
class Solution2 {
    public long solution(int N) {
        if(N < 3) {
            return 2 * (N+1);
        }
        long[] answer = new long[N];
        answer[0] = 4;
        answer[1] = 6;
        for(int i = 2; i < N; i++) {
            answer[i] = answer[i-1] + answer[i-2];
        }
        return answer[N-1];
    }
}