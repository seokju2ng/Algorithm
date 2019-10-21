package dp;

public class Main {
    public static void main(String[] args) {
        // Q1 : N으로 표현
        Q1 q1 = new Q1();
        System.out.println(q1.solution(5, 12));
        System.out.println(q1.solution(2, 11));
        System.out.println(q1.solution(5, 26));
        System.out.println();

        // Q2 : 타일 장식물
        Q2 q2 = new Q2();
        System.out.println(q2.solution(5));
        System.out.println(q2.solution(6));
        System.out.println(q2.solution(1));
        System.out.println(q2.solution(2));
        System.out.println(q2.solution(80));
        System.out.println();

        // Q3 : 정수 삼각형
        Q3 q3 = new Q3();
        int[][] arr = {{7}, {3,8}, {8,1,0}, {2,7,4,4}, {4,5,2,6,5}};
        System.out.println(q3.solution(arr));
        System.out.println(q3.cnt);
        System.out.println();

        // Q4 : 등굣길
        Q4 q4 = new Q4();
        int m = 4, n = 3;
        int[][] puddles = {{2,2}};
        System.out.println(q4.solution(m, n, puddles));
    }
}
