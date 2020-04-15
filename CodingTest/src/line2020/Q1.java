package line2020;

public class Q1 {
    public int solution(String inputString) {
        int answer = 0;
        int[] brackets = new int[8];

        for (int i = 0; i < inputString.length(); i++) {
            switch (inputString.charAt(i)) {
                case '(':
                    brackets[0]++;
                    break;
                case '{':
                    brackets[1]++;
                    break;
                case '[':
                    brackets[2]++;
                    break;
                case '<':
                    brackets[3]++;
                    break;
                case ')':
                    if (brackets[0] <= brackets[4]) return -1;
                    brackets[4]++;
                    break;
                case '}':
                    if (brackets[1] <= brackets[5]) return -1;
                    brackets[5]++;
                    break;
                case ']':
                    if (brackets[2] <= brackets[6]) return -1;
                    brackets[6]++;
                    break;
                case '>':
                    if (brackets[3] <= brackets[7]) return -1;
                    brackets[7]++;
                    break;
            }
        }

        if (isRight(brackets)) {
            if (brackets[0] != 0) answer++;
            if (brackets[1] != 0) answer++;
            if (brackets[2] != 0) answer++;
            if (brackets[3] != 0) answer++;
        } else {
            return -1;
        }

        return answer;
    }

    private boolean isRight(int[] brackets){
        return brackets[0] == brackets[4] &&
                brackets[1] == brackets[5] &&
                brackets[2] == brackets[6] &&
                brackets[3] == brackets[7];
    }
}
