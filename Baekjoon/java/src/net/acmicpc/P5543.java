/* **
    User: seokjung
    Date: 2020.03.05.
    Time: 12:26 AM
    java/P5543.java
    http://www.acmicpc.net/problem/5543
    BOJ_P5543_상근날드
** */
package net.acmicpc;

import java.io.*;

public class P5543 {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final int HAMBURGER_NUM = 3;
    private static final int BEVERAGE_NUM = 2;
    private static int[] hamburgerPrices = new int[HAMBURGER_NUM];
    private static int[] beveragePrices= new int[BEVERAGE_NUM];

    public static void main(String[] args) throws IOException {
        inputMenuPrices();
        bw.write(cheapestSetMenuPrice() + "\n");
        bw.flush();
    }

    private static int cheapestSetMenuPrice() {
        int cheapestPrice = Integer.MAX_VALUE;
        for (int i = 0; i < HAMBURGER_NUM; i++) {
            for (int j = 0; j < BEVERAGE_NUM; j++) {
                int price = hamburgerPrices[i] + beveragePrices[j];
                if (cheapestPrice > price)
                    cheapestPrice = price;
            }
        }
        return cheapestPrice - 50;
    }

    private static void inputMenuPrices() throws IOException {
        for (int i = 0; i < HAMBURGER_NUM; i++) {
            hamburgerPrices[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 0; i < BEVERAGE_NUM; i++) {
            beveragePrices[i] = Integer.parseInt(br.readLine());
        }
    }
}
