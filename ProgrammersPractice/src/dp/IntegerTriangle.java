package dp;

public class IntegerTriangle {
    public static void main(String[] args) {
        Solution3 s = new Solution3();
        int[][] arr = {{7}, {3,8}, {8,1,0}, {2,7,4,4}, {4,5,2,6,5}};
        System.out.println(s.solution(arr));
        System.out.println(s.cnt);

    }
}
class Solution3 {
    int cnt = 0;
    public int solution(int[][] triangle) {
        for(int i = triangle.length-2; i >= 0; i--){
            for(int j = 0; j < triangle[i].length; j++){
                cnt++;
                triangle[i][j] = triangle[i][j] + Math.max(triangle[i+1][j], triangle[i+1][j+1]);
            }
        }
        return triangle[0][0];
    }
}

/* ******* DFS 재귀로 풀었는데 시간초과 ******* */

//class Solution3 {
//    private int answer = 0;
//    private int[][] triangle;
//    int cnt = 0;
//
//    public int solution(int[][] triangle) {
//        this.triangle = triangle;
//        dfs( 0, 0, triangle[0][0]);
//        return answer;
//    }
//    private void dfs(int h, int idx, int value){
//        cnt++;
//        if(h + 1 == triangle.length) {
//            if(value > answer) {
//                answer = value;
//            }
//            return;
//        }
//        dfs(h+1, idx, value+triangle[h+1][idx]);
//        dfs(h+1, idx+1, value+triangle[h+1][idx+1]);
//    }
//}