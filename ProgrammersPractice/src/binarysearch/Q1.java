package binarysearch;

public class Q1 {
    public int solution(int[] budgets, int M) {
        int answer = 0;
        int sum = 0;
        int right = 0;
        int left = 0;
        int mid = 0;

        for(int budget : budgets) {
            sum += budget;
            if(right < budget) {
                right = budget;
            }
        }
        if(sum <= M) {
            return right;
        }

        while(true) {
            sum = 0;
            mid = (right + left) / 2;

            for(int budget : budgets) {
                if(budget > mid) {
                    sum += mid;
                } else {
                    sum += budget;
                }
            }
            System.out.println("left:"+left+" / mid:"+mid+" / right:"+right+" / sum:"+sum);

            if (sum > M) {
                right = mid - 1;
            } else if (sum < M) {
                if(answer < mid) {
                    answer = mid;
                }
                left = mid + 1;
            } else {
                return mid;
            }
            if(left > right){
                break;
            }
        }


        return answer;
    }
}