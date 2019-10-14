package naver.hackday;

public class Q1 {
    public int solution(int[] grade) {
        int answer = 0;
        for (int i = 1; i < grade.length; i++) {
            if (grade[i - 1] > grade[i]) {
                answer += grade[i - 1] - grade[i];
            }
        }
        return answer;
    }
}
