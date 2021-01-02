package myrealtrip;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();

        String input = br.readLine();
        boolean result = true;

        for (int i = 0; i < input.length(); i++) {
            if (!result) break;
            switch (input.charAt(i)) {
                case '(':
                case '{':
                case '[':
                    stack.push(input.charAt(i));
                    break;
                case ')':
                    if (stack.pop() != '(') result = false;
                    break;
                case '}':
                    if (stack.pop() != '{') result = false;
                    break;
                case ']':
                    if (stack.pop() != '[') result = false;
                    break;
            }
        }
        System.out.println(result ? "True" : "False");

        br.close();
    }
}
