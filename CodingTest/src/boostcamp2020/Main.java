package boostcamp2020;

public class Main {
    public static void main(String[] args) {

        String[][] names = {{"가을", "우주", "너굴"}, {"봄","여울","봄봄"}, {"너굴", "너울", "여울", "서울"}};
        for (int i = 0; i < 3; i++)
            System.out.println(new Q1().solution(names[i]));


        int[][] aryA = {{1,2,3,2}, {2,3,4,3,5}};
        int[][] aryB = {{1,3}, {1,6,7}};
        for (int i = 0; i < 2; i++) {
            int[] ret = new Q2().solution(aryA[i], aryB[i]);
            System.out.print("[");
            for(int n : ret) {
                System.out.print(n+",");
            }
            System.out.println("\b]");
        }
    }
}
