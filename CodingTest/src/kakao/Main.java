package kakao;

public class Main {
    public static void main(String[] args) {
        Q1 q1 = new Q1();
        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};
        System.out.println("Q1 : " + q1.solution(board, moves));

        System.out.println("\nQ2 : ");
        String[] strs = {
                "{{2},{2,1},{2,1,3},{2,1,3,4}}",
                "{{1,2,3},{2,1},{1,2,4,3},{2}}",
                "{{20,111},{111}}",
                "{{123}}",
                "{{4,2,3},{3},{2,3,4,1},{2,3}}"
        };
        for (String s : strs) {
            int[] result = new Q2().solution(s);
            System.out.print("[ ");
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + ", ");
            }
            System.out.println("\b\b ]");
        }

        System.out.println("\nQ3 : ");
        Q3 q3 = new Q3();
        String[][] user_id = {{"frodo", "fradi", "crodo", "abc123", "frodoc"}, {"frodo", "fradi", "crodo", "abc123", "frodoc"}, {"frodo", "fradi", "crodo", "abc123", "frodoc"}};
        String[][] banned_id = {{"fr*d*", "abc1**"}, {"*rodo", "*rodo", "******"}, {"fr*d*", "*rodo", "******", "******"}};
        for (int i = 0; i < user_id.length; i++) {
            System.out.println(q3.solution(user_id[i], banned_id[i]));
        }


        long[] room_number = {1,3,4,1,3,1};
        long[] result = new Q4().solution(10, room_number);
        System.out.print("\nQ4 : [ ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + ", ");
        }
        System.out.println("\b\b ]");



        Q5 q5 = new Q5();
        int[] stones = {2, 4, 5, 3, 2, 1, 4, 2, 5, 1};
        System.out.println("\nQ5 : "+q5.solution(stones, 3));
    }
}
