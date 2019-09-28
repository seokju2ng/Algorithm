package line;

import java.util.Scanner;

public class Q4 {
    private static int[] seat;
    private static int max = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        seat = new int[n];
        for(int i = 0; i < n; i++) {
            seat[i] = sc.nextInt();
            if(seat[i] == 0) {
                cnt++;
            } else {
                if(max < cnt) {
                    max = cnt;
                }
                cnt = 0;
            }
        }
        System.out.println((max+1)/2);
    }
}
