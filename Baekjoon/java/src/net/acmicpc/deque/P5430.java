/* **
    User: seokjung
    Date: 2019.11.12.
    Time: 4:25 AM
    java/P5430.java
    http://www.acmicpc.net/problem/5430
    BOJ_P5430_AC
** */
package net.acmicpc.deque;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class P5430 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String methods = br.readLine();
            int n = Integer.parseInt(br.readLine());
            String inputArray = br.readLine();

            ArrayDeque<Integer> deque = new ArrayDeque<>();
            int num = 0;


            for (int j = 0; j < inputArray.length(); j++) {
                if (n == 0) break;
                char ch = inputArray.charAt(j);
                if (ch == ',' || ch == ']') {
                    deque.add(num);
                    num = 0;
                } else if (ch != '[') {
                    num = num * 10 + (ch - '0');
                }
            }

            boolean reverse = true;
            try {
                for (int j = 0; j < methods.length(); j++) {
                    switch (methods.charAt(j)) {
                        case 'R':
                            reverse = !reverse;
                            break;
                        case 'D':
                            if (reverse) {
                                deque.removeFirst();
                            } else {
                                deque.removeLast();
                            }
                            break;
                    }
                }

                Iterator<Integer> iterator = reverse ? deque.iterator() : deque.descendingIterator();
                bw.write("[" + (iterator.hasNext() ? iterator.next() : ""));
                while (iterator.hasNext()) {
                    bw.write("," + iterator.next());
                }
                bw.write("]\n");
            }
            catch (NoSuchElementException e) {
                bw.write("error\n");
            }
        }
        bw.flush();
    }
}
