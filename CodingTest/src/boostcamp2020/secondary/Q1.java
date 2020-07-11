package boostcamp2020.secondary;

public class Q1 {
    public static void main(String[] args) {
        String[] strs = {"BOOST", "CAMP"};
        for (int i = 0; i < strs.length; i++) {
            System.out.println(new Q1().solution(strs[i]));
        }
    }
    private String[] keyboard = {"1234567890", "QWERTYUIOP", "ASDFGHJKL;", "ZXCVBNM,.?"};
    private StringBuilder answer = new StringBuilder();
    private int[] curidx = {0, 0};
    private char lastChar;
    private int[] lastidx = new int[2];

    public String solution(String word) {
        for (char ch : word.toCharArray()) {
            find(ch);
        }
        return answer.toString();
    }

    private void printMove(int x, int y) {
        int subx = x - curidx[0];
        int suby = y - curidx[1];

        if(subx > 0) {
            for(int i = 0 ; i < subx ; ++i) {
                answer.append("_");
            }
        } else {
            for(int i = 0 ; i > subx ; --i) {
                answer.append("^");
            }
        }

        if(suby > 0) {
            for(int i = 0 ; i < suby ; ++i) {
                answer.append(">");
            }
        } else {
            for(int i = 0 ; i > suby; --i) {
                answer.append("<");
            }
        }
        answer.append("@");
        curidx[0] = x;
        curidx[1] = y;
    }


    private void find(char ch) {
        if (lastChar == ch) {
            printMove(lastidx[0], lastidx[1]);
            return;
        }
        for(int i = 0 ; i < 4; ++i) {
            for(int j = 0 ; j < 10; ++j) {
                if (keyboard[i].charAt(j) == ch) {
                    printMove(i, j);
                    lastChar = ch;
                    lastidx[0] = i;
                    lastidx[1] = j;
                }
            }
        }
    }
}