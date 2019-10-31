package wintercoding;

public class Main {
    private static final int WIDTH = 0;
    private static final int HEIGHT = 1;

    public static void main(String[] args) {
        /* Q1 */
        System.out.println("# Q1");
        Q1 q1 = new Q1();
        int[][] whs = {
                {8, 12},
                {81564321, 3548965},
                {3548965, 81564321}
        };
        for (int[] wh : whs) {
            System.out.printf("%d * %d = ", wh[WIDTH], wh[HEIGHT]);
            System.out.println(q1.solution(wh[WIDTH], wh[HEIGHT]));
        }

        /* Q2 */
        System.out.println("\n# Q2");
        Q2 q2 = new Q2();
        for (int i = 1; i <= 4; i++) {
            int[] result = q2.solution(i);
            System.out.print("[");
            for (int res : result) {
                System.out.print(res + ",");
            }
            System.out.println("\b]");
        }

        /* Q3 */
        System.out.println("\n# Q3");

        int[][][] lands = {
                {{1, 4, 8, 10}, {5, 5, 5, 5}, {10, 10, 10, 10}, {10, 10, 10, 20}},
                {{10, 11, 10, 11}, {2, 21, 20, 10}, {1, 20, 21, 11}, {2, 1, 2, 1}}
        };
        int[] heights = {3, 1};
        for (int i = 0; i < lands.length; i++) {
            Q3 q3 = new Q3();
            System.out.println(q3.solution(lands[i], heights[i]));
            q3.print();
        }
    }
}
