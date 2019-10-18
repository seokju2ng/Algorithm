/* **
    User: seokjung
    Date: 2019.10.18.
    Time: 4:57 PM
    java/P10814.java
    http://www.acmicpc.net/problem/P10814
    BOJ_P10814_나이순 정렬
** */
package net.acmicpc.sort;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Member[] members = new Member[n];

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            members[i] = new Member(Integer.parseInt(st.nextToken()), st.nextToken());
        }
        Arrays.sort(members);
        for (Member member : members) {
            bw.write(member.toString());
        }
        bw.flush();
    }
    private static class Member implements Comparable {
        private int age;
        private String name;

        Member(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public String toString() {
            return age + " " + name + "\n";
        }

        @Override
        public int compareTo(Object o) {
            return this.age - ((Member)o).age;
        }
    }
}

