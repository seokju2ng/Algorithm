package line2020;

public class Q2 {
    private String answer_sheet;
    private String[] sheets;

    public int solution(String answer_sheet, String[] sheets) {
        int answer = -1;
        this.answer_sheet = answer_sheet;
        this.sheets = sheets;

        for (int i = 0; i < sheets.length; i++) {
            for (int j = i + 1; j < sheets.length; j++) {
                int point = cheatPoint(i, j);
                if (answer < point) {
                    answer = point;
                }
            }
        }

        return answer;
    }

    int cheatPoint(int a, int b) {
        int suspiciousPoint = 0;
        int consecutiveSusp = 0;
        int temp = 0;

        for (int i = 0; i < answer_sheet.length(); i++) {
            if (isSuspicious(answer_sheet.charAt(i), sheets[a].charAt(i), sheets[b].charAt(i))) {
                suspiciousPoint++;
                temp++;
            } else {
                temp = 0;
            }
            if (temp > consecutiveSusp) {
                consecutiveSusp = temp;
            }
        }

        return suspiciousPoint + consecutiveSusp * consecutiveSusp;
    }

    boolean isSuspicious(char answer, char a, char b) {
        return (answer != a) && (a == b);
    }

}
