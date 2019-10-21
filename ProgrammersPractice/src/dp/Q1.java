/* **
    User: Seokjung Kim.
    Date: 2019.10.21.
    Time: 12:24 PM
    ProgrammersPractice/Q1
    동적계획법 > N으로 표현
    https://programmers.co.kr/learn/courses/30/lessons/42895
** */
package dp;

import java.util.ArrayList;

public class Q1 {
    private int answer = 9;
    private ArrayList<String> path = new ArrayList<>();

    public int solution(int N, int number) {
        dfs(N, number, 0, 0);
        return answer > 8 ? -1 : answer;
    }

    private void dfs(int N, int number, int cnt, int prev) {
        int digitN = N;

        if (cnt > 8) {
            return;
        }

        if (number == prev) {
            if (answer > cnt) {
                print(prev,cnt);
                answer = cnt;
            }
            return;
        }



        for (int i = 0; i < 8 - cnt; i++) {
            path.add(String.valueOf(prev));
            dfs(N, number, cnt+i+1, prev+digitN);
            dfs(N, number, cnt+i+1, prev-digitN);
            dfs(N, number, cnt+i+1, prev*digitN);
            dfs(N, number, cnt+i+1, prev/digitN);
            path.remove(path.size()-1);
            digitN = increaseNumber(digitN, N);
        }

    }

    private int increaseNumber(int value, int N) {
        return value * 10 + N;
    }
    private void print(int num, int cnt){
        for(String s : path) {
            if(!s.equals("0"))
                System.out.print(s+",");
        }
        System.out.println(num + "(cnt " + cnt + ")"+"(size " + path.size() + ")");
    }
}
