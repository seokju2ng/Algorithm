package jobfair;

import java.util.Arrays;

public class Q1 {
    public static void main(String[] args) {
        int[][] goods = {{5,3,7},{1,2},{3,8,6}, {3,7,4,12,9,8}};
        int[][] boxes = {{3,7,6}, {2,3,1},{5,6,4}, {5,8,2,10,3}};
        Solution1 s = new Solution1();
        for(int i = 0; i < goods.length; i++) {
            System.out.println(s.solution(goods[i], boxes[i]));
        }
    }
}
class Solution1{
    public int solution(int[] goods, int[] boxes){
        int answer = 0;
        int gi = 0;
        int bi = 0;
        Arrays.sort(goods);
        Arrays.sort(boxes);
        while(true) {
            if (gi >= goods.length || bi >= boxes.length) break;
            if (goods[gi] <= boxes[bi]) {
                gi++; bi++; answer++;
            }
            else {
                bi++;
            }
        }
        return answer;
    }
}