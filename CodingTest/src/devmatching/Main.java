package devmatching;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("*Q1>>");
        System.out.println(new Q1().solution("82195", "64723"));
        System.out.println(new Q1().solution("00000000000000000000", "91919191919191919191"));
        System.out.println();

        System.out.println("*Q2>>");
        System.out.println(new Q2().solution(new int[][]{{5,-1,4},{6,3,-1},{2,-1,1}}, 1, 0, new String[]{"go","go","right","go","right","go","left","go"}));


        System.out.println("*Q3>>");
        System.out.println(new Q3().solution(new int[]{10,40,30,20}, 20));
        System.out.println(new Q3().solution(new int[]{3,7,2,8,6,4,5,1}, 3));
    }
}
