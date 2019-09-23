package line;

import java.util.Scanner;

public class Q3 {
    private static int[] arr = new int[151];
    private static int toilet = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            for(int j = start; j < end; j++) {
                arr[j]++;
                if(arr[j] > toilet)
                    toilet = arr[j];
            }
        }

        System.out.println(toilet);

    }
}
