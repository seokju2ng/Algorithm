package summercoding;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Q1().solution(1987));
        System.out.println(new Q1().solution(2015));
        System.out.println(new Q1().solution(10000));


        System.out.println(new Q2().solution(4));
        System.out.println(new Q2().solution(11));
        System.out.println(new Q2().solution(21));
        System.out.println(new Q2().solution(10000L));

        int[] ret = new Q3().solution(121, new int[][]{{1,2}, {1,3}, {3,6}, {3,4}, {3,5}});
        System.out.print("[");
        for (int i = 0; i < ret.length; i++) {
            System.out.print(ret[i]+", ");
        }
        System.out.println("\b\b]");

    }
}
