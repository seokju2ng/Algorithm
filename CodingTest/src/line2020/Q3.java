package line2020;

public class Q3 {
    private int longestLength = 0;
    public int solution(String road, int n) {
        int zeroCnt = 0;
        char[] roadAry = road.toCharArray();

        for (int i = 0; i < roadAry.length; i++) {
            if (road.charAt(i) == '0') {
                zeroCnt++;
            }
        }

        if (n >= zeroCnt) {
            return roadAry.length;
        }
        dfs(roadAry, n, 0);
        return longestLength;
    }

    private void dfs(char[] road, int n, int idx) {
        if (n == 0) {
            int l = longestRoad(road);
            if (longestLength < l){
                longestLength = l;
            }
            return;
        }
        if (idx >= road.length) {
            return;
        }

        for (int i = idx; i < road.length; i++) {
            if (road[i] == '0') {
                road[i] = '1';
                dfs(road, n - 1, i + 1);
                road[i] = '0';
            }
        }
    }

    private int longestRoad(char[] road) {
        int length = 0;
        int max = 0;
        for (char r : road) {
            if (r == '1') {
                length++;
            } else {
                if (max < length) {
                    max = length;
                }
                length = 0;
            }
        }
        return max;
    }
}
