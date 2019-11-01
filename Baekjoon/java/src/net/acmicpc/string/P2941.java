/* **
    User: seokjung
    Date: 2019.11.01.
    Time: 5:35 PM
    java/P2941.java
    http://www.acmicpc.net/problem/2941
    BOJ_P2941_크로아티아 알파벳
** */
package net.acmicpc.string;

import java.io.*;

public class P2941 {
    private static String[] alphabets = {"c=", "c-", "d-", "lj", "nj", "s=", "z=", "dz="};

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder word = new StringBuilder();
        word.append(br.readLine());
        boolean chk;

        for (int i = 0; i < word.length(); i++) {
            if (i >= word.length() - 1) {
                continue;
            }
            chk = false;
            String alpha = word.substring(i, i + 2);
            for (int j = 0; j < alphabets.length - 1; j++) {
                if (alpha.equals(alphabets[j])) {
                    word.deleteCharAt(i);
                    chk = true;
                    break;
                }
            }
            if (chk || i >= word.length() - 2) {
                continue;
            }
            alpha = word.substring(i, i + 3);
            if (alpha.equals(alphabets[alphabets.length - 1])) {
                word.deleteCharAt(i);
                word.deleteCharAt(i);
            }
        }
        bw.write(word.length() + "\n");
        bw.flush();
    }
}
