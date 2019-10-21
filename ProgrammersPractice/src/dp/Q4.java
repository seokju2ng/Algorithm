/* **
    User: Seokjung Kim.
    Date: 2019.10.21.
    Time: 12:31 PM
    ProgrammersPractice/Q4
    동적계획법 > 등굣길
    https://programmers.co.kr/learn/courses/30/lessons/42898
** */
package dp;

public class Q4 {
    public int solution(int m, int n, int[][] puddles) {
        int[][] map = new int[n + 1][m + 1];

        for (int[] puddle : puddles) {
            map[puddle[1]][puddle[0]] = -1;
        }
        map[0][1] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (map[i][j] == -1) {
                    map[i][j] = 0;
                } else {
                    map[i][j] = (map[i - 1][j] + map[i][j - 1]) % 1000000007;
                }
            }
        }
        return map[n][m];
    }
}
