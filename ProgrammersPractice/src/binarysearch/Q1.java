/* **
    User: Seokjung Kim.
    Date: 2019.10.16.
    Time: 3:36 AM
    ProgrammersPractice/Q1
    이분탐색 > 예산
    https://programmers.co.kr/learn/courses/30/lessons/43237
** */
package binarysearch;

public class Q1 {
    public int solution(int[] budgets, int M) {
        int answer = 0;
        long sum = 0;   // 효울성 2번을 위해 필수
        int right = 0;
        int left = 0;
        int mid;

        for(int budget : budgets) {
            sum += budget;
            if(right < budget) {
                right = budget;
            }
        }
        if(sum <= M) {
            return right;
        }

        while(right >= left) {
            sum = 0;
            mid = (right + left) / 2;

            for(int budget : budgets) {
                sum += budget > mid ? mid : budget;
            }

            if (sum > M) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
                if(answer < mid) {
                    answer = mid;
                }
            }
        }
        return answer;
    }
}