package myrealtrip;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Team implements Comparable {
    private int num;
    private int point;

    public Team(int num) {
        this.num = num;
        this.point = 0;
    }

    public void addPoint(int point) {
        this.point += point;
    }

    public int getPoint() {
        return point;
    }

    public int getNum() {
        return num;
    }

    @Override
    public int compareTo(Object o) {
        Team t = (Team)o;
        if (t.point == this.point)
            return this.num - t.num;
        return t.point - this.point;
    }
}

public class Q2 {
    private static int n = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] temp = br.readLine().split(" ");
        n = Integer.parseInt(temp[0]);
        int m = Integer.parseInt(temp[1]);
        Team[] teams = new Team[n];
        int rate = 1;

        for (int i = 0; i < n; i++) {
            teams[i] = new Team(i + 1);
        }

        for (int i = 0; i < m; i++) {
            temp = br.readLine().split(" ");
            int p = Integer.parseInt(temp[0]);
            int q = Integer.parseInt(temp[1]);

            if (!isValid(p, q)) continue;

            teams[p - 1].addPoint(5);
            teams[q - 1].addPoint(3);
        }

        Arrays.sort(teams);

        for (int i = 0; i < n; i++) {
            if (i != 0 && teams[i].getPoint() != teams[i-1].getPoint()) {
                rate = i + 1;
            }
            int num = teams[i].getNum();
            int point = teams[i].getPoint();

            System.out.println(rate + " " + num + " " + point);
        }

        br.close();
    }

    private static boolean isValid(int p, int q) {
        return p != q && isRange(p) && isRange(q);
    }

    private static boolean isRange(int num) {
        return num >= 1 && num <= n;
    }
}
