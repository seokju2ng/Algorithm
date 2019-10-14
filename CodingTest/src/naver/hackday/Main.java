package naver.hackday;

public class Main {
    public static void main(String[] args) {
        //Q1
        int[][] grades = {{2, 1, 3}, {1, 2, 3,}, {3, 2, 3, 6, 4, 5}};
        System.out.println("* Q1 ");
        for (int[] grade : grades)
            System.out.println(" - " + new Q1().solution(grade));

        //Q2
        String[][] maps =
                {{  "..........",
                    "AAACC.....",
                    ".AAA.....Z",
                    "..AAAA..C.",
                    "...BBBBB..",
                    "....BBB...",
                    "...ZBBB...",
                    "ZZZZAAAC..",
                    ".....CCCC.",
                    "QQ......C.",
                    ".........."
                }, {
                    "A.B.C.D",
                    ".B.C.D."
                }};
        System.out.println("\n* Q2 ");
        for (String[] map : maps) {
            int[] result = new Q2().solution(map);
            System.out.println(" - [" + result[0] + "," + result[1] + "]");
        }

        //Q3
        String[] commands = {"<v>AB^CYv^XAZ", "ABCXYZ", "ABCXYZ"};
        String[][] buttons = {{"v>AB^CYv^XA", "<v>A", "^XAZ", "Yv^XA", ">AB^"}, {"BCXY"}, {"CXYZ", "AB"}};
        int[][] scores = {{50, 18, 20, 30, 25}, {2}, {2, 3}};
        System.out.println("\n* Q3 ");
        for (int i = 0; i < commands.length; i++) {
            System.out.println(" - " + new Q3().solution(commands[i], buttons[i], scores[i]));
        }
    }
}
