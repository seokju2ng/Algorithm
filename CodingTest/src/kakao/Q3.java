package kakao;

import java.util.ArrayList;

public class Q3 {
    private boolean[] checked;              // user_id 에서 제재 아이디에 해당되는 인덱스 체크용 배열
    private ArrayList<Integer>[] matched;   // banned_id 각각에 매칭되는 user_id 인덱스 저장용 리스트 배열
    private ArrayList<Integer> answer;      // 제재 아이디 목록의 경우의 수를 저장할 배열

    public int solution(String[] user_id, String[] banned_id) {
        answer = new ArrayList<>();
        checked = new boolean[user_id.length];
        matched = new ArrayList[banned_id.length];

        for (int i = 0; i < banned_id.length; i++) {
            matched[i] = new ArrayList<>();
            for (int j = 0; j < user_id.length; j++) {
                if (banned_id[i].length() != user_id[j].length()) { // 길이가 다르면 패스
                    continue;
                }
                boolean isBanned = true;
                for (int k = 0; k < banned_id[i].length(); k++) {   // 문자 별로 비교
                    char ch = banned_id[i].charAt(k);
                    if (ch == '*') {    // * 이면 패스
                        continue;
                    }
                    if (ch != user_id[j].charAt(k)) {   // 다르면 제재 아이디가 아니므로 반복문 탈출
                        isBanned = false;
                        break;
                    }
                }
                if (isBanned) {     // 제재 아이디라면 matched 배열에 삽입
                    matched[i].add(j);
                }
            }
        }

        dfs(0);     // matched 배열에 있는 내용으로 경우의 수 순열 생성 DFS
        return answer.size();
    }

    private void dfs(int mIdx) {
        if (matched.length == mIdx) {   // 순열이 생성 되었고
            addPermIfNonExist();        // 그 순열이 없다면 경우의 수 추가
            return;
        }
        for (int i = 0; i < matched[mIdx].size(); i++) {
            if (!checked[matched[mIdx].get(i)]) {
                checked[matched[mIdx].get(i)] = true;
                dfs(mIdx + 1);
                checked[matched[mIdx].get(i)] = false;
            }
        }
    }

    private void addPermIfNonExist() {
        int perm = 0;
        for (int i = 0; i < checked.length; i++) {  // 체크된 인덱스를 토대로 순열 생성
            if (checked[i]) {
                perm = perm * 10 + i;
            }
        }
        for (int i = 0; i < answer.size(); i++) {
            if (perm == answer.get(i)) {    // 생성된 순열이 있으면 리턴
                return;
            }
        }
        answer.add(perm);   // 순열이 없다면 경우의 수 추가
    }
}
