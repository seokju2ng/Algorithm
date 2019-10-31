package wintercoding;

import java.util.ArrayList;

public class Q2 {
    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);

        for (int i = 1; i < n; i++) {
            double pow = Math.pow(2, i);
            for (int j = 0; j < pow; j++) {
                int zerofruit = j % 2 == 0 ? 0 : 1;
                list.add(j*2, zerofruit);
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
