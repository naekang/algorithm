package javaalgo.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class boj4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            char[] str = br.readLine().toCharArray();

            Stack<Character> stack = new Stack<>();

            for (char c : str) {
                if (c == '[' || c == '(') stack.push(c);
                else {
                    if (c == ')') {
                        if (!stack.isEmpty() && stack.peek() == '(') stack.pop();
                        else stack.push(c);
                    } else if (c == ']') {
                        if (!stack.isEmpty() && stack.peek() == '[') stack.pop();
                        else stack.push(c);
                    }
                }
            }

            if (str[0] == '.') break;

            if (stack.size() == 0) sb.append("yes").append('\n');
            else sb.append("no").append('\n');

        }

        System.out.println(sb);
    }
}
