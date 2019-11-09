/*
* 19.11.09
* 14:00 ~ 14:27
* */
package kakao;

import java.util.Stack;

public class Q1 {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < moves.length; i++) {
            for (int j = 0; j < board.length; j++) {
                int doll = board[j][moves[i] - 1];
                if (doll == 0)
                    continue;
                if (stack.empty() || stack.peek() != doll) {
                    stack.push(doll);
                } else {
                    answer += 2;
                    stack.pop();
                }
                board[j][moves[i] - 1] = 0;
                break;
            }
        }

        return answer;
    }
}
