package devmatching;

public class Q1 {
    public int solution(String p, String s) {
        int answer = 0;
        int length = p.length();

        for (int i = 0; i < length; i++) {
            int pn = p.charAt(i) - '0';
            int sn = s.charAt(i) - '0';
            answer += min(pn, sn);
        }
        return answer;
    }

    private int min(int n1, int n2) {
        int a = Math.abs(n1 - n2);
        int b = Math.abs(10 + n1 - n2);
        int c = Math.abs(10 + n2 - n1);
        return a > b ? (b > c ? c : b) : (a > c ? c : a);
    }
}
