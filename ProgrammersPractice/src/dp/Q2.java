/* **
    User: Seokjung Kim.
    Date: 2019.10.21.
    Time: 12:25 PM
    ProgrammersPractice/Q2
    동적계획법 > 타일 장식물
    https://programmers.co.kr/learn/courses/30/lessons/43104
** */
package dp;

public class Q2 {
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
