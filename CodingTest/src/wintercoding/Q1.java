package wintercoding;

/* DP, 격자점 */
public class Q1 {
    public long solution(int w, int h) {
        long answer = 0;
        for (int i = 1; i < h; i++) {
            int sum = (int) (w * 1.0 / h * i);
            answer += sum;
        }
        return answer * 2;
    }
}
