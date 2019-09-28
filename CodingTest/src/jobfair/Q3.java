package jobfair;

public class Q3 {
    public static void main(String[] args) {
        int[][] sticker = {{12,12,12,12,12},
                {12,80,14,22,100},
                {100,1,2,3,2,300},
                {1},
                {10,20,8},
                {1,1,1,1,1,1,1,1,1,1,1}};
        for(int i = 0; i < sticker.length; i++) {
            System.out.println(new Solution3().solution(sticker[i]));
        }
    }

}

/* 해결방법 */
class Solution3 {
    public int solution(int[] sticker) {
        int len = sticker.length;
        int[] max = new int[len];
        max[0] = sticker[0];
        if(len > 1) max[1] = sticker[1];
        else return max[0];
        if(len > 2) max[2] = max[0] + sticker[2];
        for(int i = 3; i < len; i++) {
            if(max[i-2] >= max[i-3]) max[i] += max[i-2] + sticker[i];
            else max[i] += max[i-3] + sticker[i];
        }
        for(int i = 0; i < len; i ++){
            System.out.print(max[i]+" ");
        }
        System.out.println();
        return max[len-1] > max[len-2] ? max[len-1] : max[len-2];
    }
}

/* DP 정확성 1/10, 효율성 2/8 실패 */
/* 문제점: 마지막 방보다 마지막 바로 전 방이 더 클 수도 있음을 인지하지 못함 */
//class Solution3 {
//    private int[] max;
//    public int solution(int[] sticker) {
//        int len = sticker.length;
//        max = new int[len];
//        max[0] = sticker[0];
//        if(len > 1) max[1] = sticker[1];
//        if(len > 2) max[2] = max[0] + sticker[2];
//        for(int i = 3; i < len; i++) {
//            if(max[i-2] >= max[i-3]) max[i] += max[i-2] + sticker[i];
//            else max[i] += max[i-3] + sticker[i];
//        }
//        return max[len-1];
//    }
//}


/* 재귀로 풀었으나 재귀는 시간초과 */
//class Solution3 {
//    private int max = 0;
//    private int[] sticker;
//    public int solution(int[] sticker) {
//        this.sticker = sticker;
//        recursive(0, 0);
//        recursive(1, 0);
//        return max;
//    }
//    public void recursive(int idx, int sum){
//        if(idx >= sticker.length) {
//            if(max < sum) {
//                max = sum;
//            }
//            return;
//        }
//        recursive(idx+2, sum + sticker[idx]);
//        recursive(idx+3, sum + sticker[idx]);
//    }
//}
