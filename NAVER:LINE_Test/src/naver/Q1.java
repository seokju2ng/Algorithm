package naver;

import java.util.LinkedList;

public class Q1 {
    public static void main(String[] args) {
        Solution2 s1 = new Solution2();
        Solution2 s2 = new Solution2();
        String[] record1 = {"RECEIVE abcd@naver.com", "RECEIVE zzkn@naver.com", "DELETE", "RECEIVE qwerty@naver.com", "SAVE", "RECEIVE QwerTY@naver.com"};
        String[] record2 = {"RECEIVE abcd@naver.com", "RECEIVE zzkn@naver.com", "DELETE", "RECEIVE qwerty@naver.com", "SAVE", "SAVE", "DELETE", "RECEIVE QwerTY@naver.com", "SAVE"};
        String[] answer1 = s1.solution(record1);
        String[] answer2 = s2.solution(record2);
        for(int i = 0; i < answer1.length; i++) {
            System.out.print(answer1[i]+"\t");
        }
        System.out.println();
        for(int i = 0; i < answer2.length; i++) {
            System.out.print(answer2[i]+"\t");
        }
        System.out.println();
    }
}
class Solution2 {
    LinkedList<String> temp = new LinkedList<>();
    LinkedList<String> permnt = new LinkedList<>();


    public String[] solution(String[] record) {
        String[] answer;
        int recordNum = record.length;

        for(int i = 0; i < recordNum; i++) {
            String cmd = record[i];
            switch (cmd) {
                case "DELETE" :
                    if(!temp.isEmpty()) temp.removeLast();
                    break;
                case "SAVE" :
                    if(temp.size() == 0) break;
                    int tempSize = temp.size();
                    for(int j = 0; j < tempSize; j++) {
                        permnt.add(temp.get(j));
                    }
                    temp.clear();
                    break;
                default:
                    String email = cmd.split(" ")[1].split("@")[0];
                    temp.add(email);
                    break;
            }
        }
        int permntSize = permnt.size();
        answer = new String[permntSize];
        for(int i = 0; i < permntSize; i++) {
            answer[i] = permnt.get(i) + "@naver.com";
        }
        return answer;
    }
}
