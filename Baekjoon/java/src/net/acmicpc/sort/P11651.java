/* **
    User: seokjung
    Date: 2019.10.18.
    Time: 2:47 AM
    java/P11651.java
    http://www.acmicpc.net/problem/11651
    BOJ_P11651_좌표 정렬하기 2
** */
package net.acmicpc.sort;

import java.io.*;
import java.util.*;

public class P11651 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static final int X = 0;
    private static final int Y = 1;

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[][] locations = new int[n][2];
        StringTokenizer st;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            locations[i][X] = Integer.parseInt(st.nextToken()); // x 좌표 입력
            locations[i][Y] = Integer.parseInt(st.nextToken()); // y 좌표 입력
        }

        Arrays.sort(locations, (a, b) -> {
            return a[Y] == b[Y] ? a[X] - b[X] : a[Y] - b[Y];    // y가 같으면 x를 오름차순, 같지 않으면 y를 오름차순
        });

        for (int[] xy : locations) {
            bw.write(xy[X] + " " + xy[Y] + "\n");
        }
        bw.flush();
    }
}
