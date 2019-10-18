/* **
    User: seokjung
    Date: 2019.10.18.
    Time: 5:46 PM
    java/P1904.java
    http://www.acmicpc.net/problem/P1904
    BOJ_P1904_01타일
** */
package net.acmicpc.dp;

import java.io.*;

public class P1904 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    /* 결국 피보나치 였음.. */
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 0; i < n; i++) {
            c = (a + b) % 15746;
            a = b;
            b = c;
        }
        bw.write(c + "\n");
        bw.flush();
    }

    /* 경우의 수를 잘 못 들어서 피보나치가 아닌 줄 알고 푼 알고리즘
     * 1, 2, 3, 5, 8, 12, 18, 25,... 로 커져가는 희한한 규칙이라고 생각하고 품
     * 커지는 수가 1, 2, 3, 4, 6, 7, 10, 11, 15, 16,... 로 홀수 번째에는 +1, 짝수 번째에는 +등차수열(1,2,3,...)로 증가
     * 결국 잘못된 풀이였음
     * */

//    public static void main(String[] args) throws IOException {
//        int n = Integer.parseInt(br.readLine());
//        long[] dp = new long[n + 1];
//        long[] dotfire = new long[n + 1];
//        dp[1] = dotfire[1] = dotfire[2] = 1;
//
//        for (int i = 3; i <= n; i++) {
//            if (i % 2 == 0) {
//                dotfire[i] = dotfire[i-1] + i / 2 - 1;
//            } else {
//                dotfire[i] = dotfire[i-1] + 1;
//            }
//        }
//
//        for (int i = 2; i <= n; i++) {
//            dp[i] = dp[i-1] + dotfire[i-1];
//            dp[i] = dp[i] >= 15746 ? dp[i] % 15746 : dp[i];
//        }
//
//        bw.write(dp[n] + "\n");
//        bw.flush();
//    }

//    public static void main(String[] args) throws IOException {
//        int n = Integer.parseInt(br.readLine());
//        int[] dp = new int[n + 1];
//
//        for(int i = 2; i <= n; i += 2) {
//            int multi = i / 2;
//            for(int j = i; j <= n; j++) {
//                dp[j] += 1 + (j - i) * multi;
//                dp[j] = dp[j] >= 15746 ? dp[j] % 15746 : dp[j];
//            }
//        }
//
//        bw.write((dp[n]+1) + "\n");
//        bw.flush();
//    }
}
