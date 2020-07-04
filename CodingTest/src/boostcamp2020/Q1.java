package boostcamp2020;

public class Q1 {
    public boolean solution(String[] name_list) {
        for (int i = 0; i < name_list.length; i++) {
            for (int j = 0; j < name_list.length; j++) {
                if (i == j) continue;
                if (name_list[i].contains(name_list[j])) {
                    return true;
                }
            }
        }
        return false;
    }

}
