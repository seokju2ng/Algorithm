package naver.hackday;

/* 처음에 풀던 방식 (시간을 많이 잡아먹음)
 * 재귀로 하면 시간이 걸릴 것 같아서 작업한 방식
 * 하지만 풀던 도중 접근방법이 잘못되었다는 걸 느끼고 이걸 고치는 것보다 재귀로 푸는게 빠를 거라는 생각에 재귀로 방향을 바꿈 */
//public class Q3 {
//    private int keyNum;
//    private int answer;
//    public int solution(String command, String[] buttons, int[] scores) {
//        keyNum = buttons.length;
//        answer = command.length();
//        String temp = "";
//        int curIdx;
//        int score;
//        for(int i = 0; i < keyNum; i++) {
//            temp = command;
//            score = 0;
//            curIdx = i;
//            for (int j = 0; j < keyNum; j++){
//                temp = temp.replace(buttons[curIdx], "."+scores[curIdx]);
//                curIdx = (curIdx + 1) % keyNum;
//            }
//            for(int j = 0; j < temp.length(); j++){
//                char ch = temp.charAt(j);
//                if(isButton(ch)) {
//                    score++;
//                    System.out.println("score:"+score);
//                    continue;
//                }
//                int k = j+1;
//                if(ch == '.') {
//                    int num = 0;
//                    while (true) {
//                        if (k >= temp.length()){
//                            break;
//                        }
//                        char cnum = temp.charAt(k);
//                        if(!(cnum >= '0' && cnum <= '9')) {
//                            break;
//                        }
//                        num *= 10;
//                        num += cnum - '0';
//                        k++;
//                    }
//
//                    score += num;
//                    System.out.println("num:"+num+"/score:"+score);
//                }
//                j = k-1;
//            }
//            if(score > answer) {
//                answer = score;
//            }
//        }
//        System.out.println(temp);
//        return answer;
//    }
//
//    private boolean isButton(char ch) {
//        return (ch == 'A' || ch == 'B' || ch == 'C' || ch == 'X' || ch == 'Y' || ch == 'Z' || ch == '<' || ch == '>' || ch == '^' || ch == 'v');
//    }
//}

/* dfs recurrsive */
public class Q3 {
    private static final String DELIMITER = ".";
    private static final String NULL_STRING = "";
    private int answer;
    private String[] buttons;
    private int[] scores;

    public int solution(String command, String[] buttons, int[] scores) {
        answer = command.length();  // 최초 문자열의 길이만큼 저장
        this.buttons = buttons;
        this.scores = scores;
        dfs(command, 0);
        return answer;
    }

    private void dfs(String command, int score) {
        /* 현재까지 점수가 기존 점수보다 높으면 저장 (치환 전이 점수가 높을 수 있기 때문에) */
        String leftChar = command.replace(DELIMITER, NULL_STRING);
        int finalScore = score + leftChar.length();
        if (answer < finalScore) {
            answer = finalScore;
        }

        /* 치환 */
        for (int i = 0; i < buttons.length; i++) {
            if (command.contains(buttons[i])) {  // 스킬이 command에 포함되어 있다면 치환 시작
                String skill = buttons[i];
                int cIdx = 0;       // command의 비교용 index
                int sIdx = 0;       // skill의 비교용 index
                int startIdx = -1;  // 치환할 스킬이 있다면 그 시작 인덱스 저장 변수
                while (true) {
                    if (sIdx >= skill.length()) {   // skill의 index가 끝까지 갔다면 (command에서 skill의 위치를 찾았다면)
                        // command의 스킬 부분을 구분자로 치환한 후에 재귀함수를 호출한다.
                        String newCmd = command.substring(0, startIdx) + DELIMITER + command.substring(cIdx);
                        dfs(newCmd, score + scores[i]);
                        break;
                    }
                    if (cIdx >= command.length()) { // command의 끝에 다다르면 반복문 종료
                        break;
                    }
                    if (command.charAt(cIdx) == skill.charAt(sIdx)) {   // 문자가 같으면 command와 skill의 다음 문자 비교
                        if (startIdx == -1) {   // 스킬의 시작 인덱스를 저장하지 않았다면 저장한다.
                            startIdx = cIdx;
                        }
                        cIdx++;
                        sIdx++;
                    } else {    // 비교하는 문자가 다르면 command는 다음 문자를, skill은 처음부터 다시 비교
                        startIdx = -1;
                        cIdx++;
                        sIdx = 0;
                    }
                }
            }
        }
    }
}

