package naver;

import java.util.ArrayList;

public class Q3 {
    public static void main(String[] args) {
        int[][] cook_times = {{5, 30, 15, 30, 35, 20, 4},{5, 30, 15, 30, 35, 20, 4, 50, 40}, {5, 3, 2}};
        int[][][] order =  {{{2,4},{2,5},{3,4},{3,5},{1,6},{4,6},{5,6},{6,7}}, {{2,4},{2,5},{3,4},{3,5},{1,6},{4,6},{5,6},{6,7},{8,9}}, {{1, 2}, {2, 3}, {1, 3}}};
        int[] k = {6,9,3};
        for(int i = 0; i < 3; i++) {
            int[] answer = new Solution3().solution(cook_times[i], order[i], k[i]);
//            System.out.println("answer "+i+"> 전단계 : "+answer[0] +", 걸리는 시간 : "+answer[1]);
        }
        // 1: 5/85
        // 2: 1/90
        // 3: 3/10
    }
}
class Solution3 {
    private int level;
    private ArrayList<Integer>[] parent;
    private int[] check;
    int totTime = 0;
    int levCnt = 0;

    public int[] solution(int[] cook_times, int[][] order, int k) {
        level = cook_times.length;
        parent = new ArrayList[level+1];
        check = new int[level+1];
        for(int i = 0; i <= level; i++) {
            parent[i] = new ArrayList<>();
        }

        for(int i = 0; i < order.length; i++) {
            int prev = order[i][0];
            int cur = order[i][1];
            parent[cur].add(prev);
        }

//        for(int i = 1; i < parent.length; i++) {
//            System.out.println(parent[i]+ " ");
//        }

        calculate(cook_times, k);
        System.out.println(totTime + " /// "+levCnt);

        int[] answer = {};
        return answer;
    }
    private void calculate(int[] cook_times, int prevp) {

        if(check[prevp] == 1) {
            return;
        }
        levCnt++;

//        totTime += cook_times[prevp-1];
//        check[prevp] = 1;
        System.out.println("tottime:"+totTime+", prevtime:"+cook_times[prevp-1]);
        int prevLevelSize = parent[prevp].size();
        if(prevLevelSize == 0) {
            return;
        }

        int max = 0;
        int maxindex = 0;
        for(int i = 0; i < prevLevelSize; i++) {
            int prevLevel = parent[prevp].get(i);
            if(max < cook_times[prevLevel-1]){
                max = cook_times[prevLevel-1];
                maxindex = prevLevel-1;
            }
            System.out.println("prevP : "+prevp+", prevLevel:"+prevLevel);
            calculate(cook_times, prevLevel);
        }
        check[maxindex] = 1;

    }
}
