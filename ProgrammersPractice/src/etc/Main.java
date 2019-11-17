package etc;


public class Main {
    public static void main(String[] args) {
        /* 하노이의 탑 */
        System.out.print("* 하노이의 탑 : ");
        int[][] hanois = new Hanoi().solution(2);
        System.out.print("[");
        for (int[] hanoi : hanois) {
            System.out.print("[");
            for (int h : hanoi) {
                System.out.print(h+",");
            }
            System.out.print("\b],");
        }
        System.out.println("\b]");
    }
}
