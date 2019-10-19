/* **
    User: seokjung
    Date: 2019.10.19.
    Time: 10:34 AM
    java/P2108.java
    http://www.acmicpc.net/problem/2108
    BOJ_P2108_통계학
** */
package net.acmicpc.etc;

import java.io.*;
import java.util.Arrays;

public class P2108 {
    private static final int MAX_ABSOLUTE_VALUE = 4000;

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] ary = new int[n];                             // 입력 받은 수를 저장할 배열
        int[] num = new int[MAX_ABSOLUTE_VALUE * 2 + 1];    // -4000 ~ 4000 까지 개수 저장할 배열
        int max = 0;                                        // 중복된 값의 최대 개수
        int sum = 0;                                        // 입력 받은 수의 합
        boolean overlap = false;                            // 최빈값이 중복인지 논리값 저장
        int mostNum = 0;                                    // 최빈값을 저장

        for (int i = 0; i < n; i++) {
            ary[i] = Integer.parseInt(br.readLine());
            sum += ary[i];
            int index = ary[i] + MAX_ABSOLUTE_VALUE;     // 입력 받은 값을 num의 인덱스 형태로 변환
            num[index]++;
            if (max < num[index]) {   // 새로운 최대 개수가 나오면
                max = num[index];     // 최대 개수를 바꾸고 overlap은 없는 걸로
                overlap = false;
            } else if (max == num[index]) {   // max랑 같은 값이 나오면
                overlap = true;
            }
        }
        Arrays.sort(ary);

        for (int i = ary[0] + MAX_ABSOLUTE_VALUE; i <= ary[n - 1] + MAX_ABSOLUTE_VALUE; i++) {
            if (overlap && num[i] == max) {
                overlap = false;
            } else if (!overlap && num[i] == max) {
                mostNum = i - MAX_ABSOLUTE_VALUE;
                break;
            }
        }

        bw.write(Math.round((double) sum / n) + "\n");  // 산술평균
        bw.write(ary[n / 2] + "\n");                    // 중앙값
        bw.write(mostNum + "\n");                       // 최빈값
        bw.write((ary[n - 1] - ary[0]) + "\n");         // 범위
        bw.flush();
    }
}
