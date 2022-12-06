package javaalgo.haulzzang.week10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class boj9012_1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            String str = br.readLine();

            sb.append(checkVps(str)).append('\n');
        }

        System.out.println(sb.toString());
    }

    static String checkVps(String s) {

        if (s.charAt(0) == ')' || s.charAt(s.length() - 1) == '(') {
            return "NO";
        }

        Stack<Character> stack = new Stack<>();

        stack.push(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                stack.push(ch);
            } else {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else {
                    return "NO";
                }
            }
        }

        return stack.isEmpty() ? "YES" : "NO";
    }
}
