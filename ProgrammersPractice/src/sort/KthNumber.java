package sort;

import java.util.PriorityQueue;

public class KthNumber {
    public static void main(String[] args) {
        int[] array = {1,5,2,6,3,7,4};
        int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
        Solution1 s = new Solution1();
        int[] answer = s.solution(array, commands);
        for(int a : answer)
            System.out.print(a+" ");
    }
}

class Solution1 {
    public int[] solution(int[] array, int[][] commands) {
        int cmdLen = commands.length;
        int[] answer = new int[cmdLen];

        for(int i = 0; i < cmdLen; i++) {
            int sidx = commands[i][0] - 1;
            int eidx = commands[i][1] - 1;
            int kth = commands[i][2];
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            int num = 0;
            for(int j = sidx; j <= eidx; j++) {
                pq.add(array[j]);
            }
            for(int k = 0; k < kth; k++) {
                num = pq.poll();
            }
            answer[i] = num;
        }

        return answer;
    }
    // 간편한 코드
//    public int[] solution(int[] array, int[][] commands) {
//        int[] answer = new int[commands.length];
//
//        for(int i=0; i<commands.length; i++){
//            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
//            Arrays.sort(temp);
//            answer[i] = temp[commands[i][2]-1];
//        }
//
//        return answer;
//    }
}