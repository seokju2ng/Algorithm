package line;

import java.util.Scanner;

public class Q1 {
    private static int[] consumer;
    private static int csmNum;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int msgNum = sc.nextInt();
        csmNum = sc.nextInt();
        consumer = new int[csmNum];
        for(int i = 0; i < msgNum; i++) {
            int msgSec = sc.nextInt();
            consumer[func1()] += msgSec;
        }
        System.out.println(func2());
    }

    private static int func1() {
        int min = 0;
        for(int i = 0; i < csmNum; i++){
            if(consumer[i] < consumer[min]){
                min = i;
            }
        }
        return min;
    }
    private static int func2() {
        int max = 0;
        for(int i = 0; i < csmNum; i++){
            if(consumer[i] > consumer[max]){
                max = i;
            }
        }
        return consumer[max];
    }
}
