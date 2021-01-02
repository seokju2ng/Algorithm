package myrealtrip;

import java.io.*;
import java.util.Stack;

public class Q1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Integer> stack = new Stack<>();
        int result = 0;
        int k = Integer.parseInt(br.readLine());

        for (int i = 0; i < k; i++) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                stack.pop();
            } else {
                stack.push(n);
            }
        }

        while (!stack.empty()) {
            result += stack.pop();
        }

        System.out.println(result);
        br.close();
    }
}


