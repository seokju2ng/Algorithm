/* **
    User: seokjung
    Date: 2019.10.19.
    Time: 3:30 PM
    java/P7568.java
    http://www.acmicpc.net/problem/7568
    BOJ_P7568_덩치
** */
package net.acmicpc.etc;

import java.io.*;
import java.util.StringTokenizer;

public class P7568 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Person[] people = new Person[n];
        int rank;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            people[i] = new Person(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        for (int i = 0; i < n; i++) {
            rank = 1;
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }
                if (people[i].isBiggerThanMe(people[j])) {
                    rank++;
                }
            }
            bw.write(rank + " ");
        }
        bw.write("\n");
        bw.flush();
    }

    private static class Person {
        int height;
        int weight;

        Person(int height, int weight) {
            this.height = height;
            this.weight = weight;
        }

        boolean isBiggerThanMe(Person p) {
            return height < p.height && weight < p.weight;
        }
    }
}
