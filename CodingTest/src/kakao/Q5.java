/*
* */
package kakao;

public class Q5 {
    // 14:53 ~ 15:18 통과
    public int solution(int[] stones, int k) {
        int answer = 0;
        int[] dp = new int[stones.length];

        for (int i = 0; i < dp.length; i++) {
            if (i < k) {
                dp[i] = stones[i];
                continue;
            }
            for (int j = 1; j <= k; j++) {
                dp[i] = dp[i - j] > dp[i] ? dp[i - j] : dp[i];
            }

            dp[i] = dp[i] > stones[i] ? stones[i] : dp[i];
        }

        for (int i = 0; i < k; i++) {
            answer = answer > dp[dp.length - 1 - i] ? answer : dp[dp.length - 1 - i];
        }

        return answer;
    }
}

//public class Q5 {
//    // 14:35 ~ 14:51 ( 정확성 25/25, 효율성 0/6[시간초과] )
//    public int solution(int[] stones, int k) {
//        int answer = 0;
//
//        while (true) {
//            int n = 0;
//            for (int i = 0; i < stones.length; i++) {
//                if (n == k) {
//                    break;
//                }
//                if (stones[i] == 0) {
//                    n++;
//                    continue;
//                }
//                stones[i] -= 1;
//                n = 0;
//            }
//            if (n == k) {
//                break;
//            }
//            answer++;
//        }
//
//        return answer;
//    }
//}
