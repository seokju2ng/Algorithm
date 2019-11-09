package kakao;

/* 15:30 ~ 16:23 */
public class Q2 {
    private static final int MAX_VALUE = 100000;

    public int[] solution(String s) {
        int length = s.split("}").length;
        boolean[] chk = new boolean[MAX_VALUE + 1];
        int[][] ary = new int[length][length];
        int[] answer = new int[length];
        int rowp = 0, colp = 0;
        int num = 0;

        /* 먼저 문자열을 파싱해 2차원 정수 배열로 변환.
        * */
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '}') {
                ary[rowp][colp] = num;
                answer[colp] = rowp;
                rowp++;
                colp = 0;
                i += 2;
                num = 0;
            } else if (ch == ',') {
                ary[rowp][colp] = num;
                colp++;
                num = 0;
            } else if (ch != '{') {
                num = num * 10 + (ch - '0');
            }
        }

        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (!chk[ary[answer[i]][j]]) {
                    answer[i] = ary[answer[i]][j];
                    chk[answer[i]] = true;
                    break;
                }
            }
        }

        return answer;
    }
}
