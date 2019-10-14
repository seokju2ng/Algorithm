package naver.hackday;

public class Q1 {
    public int solution(int[] grade) {
        int answer = 0;
        for (int i = 1; i < grade.length; i++) {
            if (grade[i - 1] > grade[i]) {
                int diff = grade[i - 1] - grade[i];
                answer += diff;
//                grade[i - 1] -= diff;     // 이 문제에선 굳이 빼지 않아도 상관없음.
            }
        }
        return answer;
    }
}
