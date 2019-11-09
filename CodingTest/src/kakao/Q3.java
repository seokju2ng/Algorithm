package kakao;

import java.util.ArrayList;

public class Q3 {
    private boolean[] checked;
    private ArrayList<Integer>[] matched;
//    private int answer = 0;
    private ArrayList<Integer> answer;

    public int solution(String[] user_id, String[] banned_id) {
        answer = new ArrayList<>();
        checked = new boolean[user_id.length];
        matched = new ArrayList[banned_id.length];

        for (int i = 0; i < banned_id.length; i++) {
            matched[i] = new ArrayList<>();
            for (int j = 0; j < user_id.length; j++) {
                if (banned_id[i].length() != user_id[j].length()) {
                    continue;
                }
                boolean isBanned = true;
                for (int k = 0; k < banned_id[i].length(); k++) {
                    char ch = banned_id[i].charAt(k);
                    if(ch == '*') {
                        continue;
                    }
                    if(ch != user_id[j].charAt(k)) {
                        isBanned = false;
                        break;
                    }
                }
                if(isBanned) {
                    matched[i].add(j);
                }
            }
        }



        for (int i = 0; i < matched.length; i++) {
            System.out.print("matched["+i+"] : ");
            for (int j = 0; j < matched[i].size(); j++) {
                System.out.print(matched[i].get(j) + " ");
            }
            System.out.println();
        }
        NumberOfCases();
        return answer.size();
//        return answer;
    }

    private void NumberOfCases() {
        int[] perm = new int[matched.length];
        dfs(perm, 0);
    }

    private void dfs(int[] perm, int mIdx) {
        if (perm.length == mIdx) {
            addPermIfNonExist();
            return;
        }
        for (int i = 0; i < matched[mIdx].size(); i++) {
            if (!checked[matched[mIdx].get(i)]) {
                checked[matched[mIdx].get(i)] = true;
                perm[mIdx] = matched[mIdx].get(i);
                dfs(perm, mIdx + 1);
                checked[matched[mIdx].get(i)] = false;
            }
        }
    }
    private void addPermIfNonExist() {
//        int[] perm = new int[matched.length];
        int perm = 0;
        int cnt = 0;
        for (int i = 0; i < checked.length; i++) {
            if (checked[i]) {
                perm = perm * 10 + i;
//                perm[cnt++] = i;
            }
        }
        System.out.println("perm : "+perm);
//        System.out.print("perm : ");
//        for (int a : perm) {
//            System.out.print(a + " ");
//        }
//        System.out.println();
        for (int i = 0; i < answer.size(); i++) {
            if (perm == answer.get(i)) {
                return;
            }
        }
        answer.add(perm);
    }
}
