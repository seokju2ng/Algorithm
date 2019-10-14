package naver.hackday;

import java.util.ArrayList;

public class Q2 {
    private static final int ALPHABET_NUM = 26;
    private static final int FOUR_SIDES = 4;
    private static final char EMPTY_TERRITORY = '.';
    private ArrayList<Integer>[] connection;
    private String[] maps;
    private int[] dr = {1, 0, -1, 0};
    private int[] dc = {0, 1, 0, -1};
    private int[] answer = new int[2];

    public int[] solution(String[] maps) {
        this.maps = maps;
        initConnection();
        for (int i = 0; i < maps.length; i++) {
            for (int j = 0; j < maps[i].length(); j++) {
                if (maps[i].charAt(j) == '.') {
                    continue;
                }
                checkAllSides(i, j);
            }
        }
        checkMaxBorderHand();
        return answer;
    }

    private void checkMaxBorderHand() {
        if (answer[0] == 0) {
            answer[1] = 0;
            return;
        }
        for (int i = 0; i < ALPHABET_NUM; i++) {
            if (answer[1] < connection[i].size()) {
                answer[1] = connection[i].size();
            }
        }
    }

    private void checkAllSides(int row, int col) {
        for (int i = 0; i < FOUR_SIDES; i++) {      // 사방(상하좌우) 검사
            if (inRange(row + dr[i], col + dc[i]) && isBorderHand(row, col, i)) {   // 사방(상하좌우) 중 하나가 index 범위에 있고, 그게 국경이 맞닿은 거라면
                int originAlpha = maps[row].charAt(col) - 65;
                int anotherAlpha = maps[row + dr[i]].charAt(col + dc[i]) - 65;
                if (!isRegistered(originAlpha, anotherAlpha)) {   // 등록이 안되었다면
                    connection[originAlpha].add(anotherAlpha);
                    connection[anotherAlpha].add(originAlpha);
                    answer[0]++;
                }
            }
        }
    }

    private boolean isBorderHand(int row, int col, int i) {
        return (maps[row + dr[i]].charAt(col + dc[i]) != EMPTY_TERRITORY            // 인접한 곳이 빈 영토가 아니고
                && maps[row].charAt(col) != maps[row + dr[i]].charAt(col + dc[i])); // 다른 나라라면 return true;
    }

    private boolean inRange(int row, int col) {
        return ((0 <= row && row < maps.length) && (0 <= col && col < maps[0].length()));
    }

    private boolean isRegistered(int originAlpha, int anotherAlpha) {
        return (connection[originAlpha].indexOf(anotherAlpha) != -1);   // 이미 인접한 국가로 등록했다면 return true;
    }

    private void initConnection() {
        connection = new ArrayList[ALPHABET_NUM];
        for (int i = 0; i < ALPHABET_NUM; i++) {
            connection[i] = new ArrayList<>();
        }
    }
}
