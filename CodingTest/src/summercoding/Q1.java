package summercoding;

public class Q1 {
    public int solution(int p) {
        while (!isBeautifulYear(++p));
        return p;
    }

    private boolean isBeautifulYear(int year) {
        int idx = 0;
        int[] list = new int[5];

        while (year > 0) {
            list[idx++] = (year % 10);
            year /= 10;
        }
        for (int i = 0; i < idx; ++i) {
            for (int j = i + 1; j < idx; ++j) {
                if (list[i] == list[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
