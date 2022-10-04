package javaalgo.haulzzang.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class boj4949 {

    static Stack<Character> stack;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String str = br.readLine();

            stack = new Stack<>();

            if (str.equals(".")) break;

            str = str.replaceAll("[a-zA-Z.\\s]", "").trim();

            sb.append(solution(str)).append('\n');

        }

        System.out.println(sb.toString());
    }

    static String solution(String s) {
        if (s.length() == 0) return "yes";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty() || (stack.peek() == '(' && ch == ']') || (stack.peek() == '[' && ch == ')')) {
                    stack.push(ch);
                    break;
                }
                stack.pop();
            }
        }

        if (stack.isEmpty()) return "yes";
        else return "no";
    }
}
