package jobfair;
import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        String[][] bishops = {{"D5"}, {"D5", "E8", "G2"}};
        for(int i = 0; i < bishops.length; i++) {
            System.out.println(new Solution2().solution(bishops[i]));
        }
    }
}

class Solution2 {
    private static final int chessSize = 8;
//    private int[][] chess;
    private boolean[] incDiagonalLine;
    private boolean[] decDiagonalLine;

    public Solution2 () {
//        chess = new int[chessSize][chessSize];
        incDiagonalLine = new boolean[chessSize * 2 + 1];
        decDiagonalLine = new boolean[chessSize * 2 + 1];
    }

    public int solution(String[] bishops) {
        int answer = 0;
        for(int i = 0; i < bishops.length; i++) {
            int col = bishops[i].charAt(0) - 'A';
            int row = bishops[i].charAt(1) - '0';
            incDiagonalLine[row + col] = true;
            decDiagonalLine[chessSize + row - col] = true;
        }
        for(int i = 1; i <= chessSize; i++) {
            for(int j = 0; j < chessSize; j++) {
                if(!incDiagonalLine[i+j] && !decDiagonalLine[chessSize+i-j])
                    answer++;
            }
        }
        return answer;
    }

}