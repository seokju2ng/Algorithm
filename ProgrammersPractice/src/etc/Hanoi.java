/* **
    User: Seokjung Kim.
    Date: 2019.11.16.
    Time: 2:12 AM
    ProgrammersPractice/레벨 3/하노이의 탑
    https://programmers.co.kr/learn/courses/30/lessons/12946
** */

package etc;

public class Hanoi {
    private int idx = 0;
    private int[][] answer;
    public int[][] solution(int n) {
        int numOfCases = (int)Math.pow(2, n) - 1;
        answer = new int[numOfCases][2];
        hanoi(n, 1, 3, 2);
        return answer;
    }
    private void hanoi(int n, int from, int to, int aux){
        if (n == 1) {
            answer[idx][0] = from;
            answer[idx++][1] = to;
            return;
        }
        hanoi(n-1, from, aux, to);
        answer[idx][0] = from;
        answer[idx++][1] = to;
        hanoi(n-1, aux, to, from);
    }
}
