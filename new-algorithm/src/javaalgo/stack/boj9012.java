package javaalgo.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class boj9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            sb.append(solution(br.readLine())).append('\n');
        }

        System.out.println(sb);
    }

    static String solution(String s) {
        Stack<Character> stack = new Stack<>();
        char[] arr = s.toCharArray();

        for (char c : arr) {
            if (c == '(') {
                stack.push(c);
            } else {
                if (stack.size() == 0) stack.push(c);
                if (stack.peek() == '(') {
                    stack.pop();
                }
            }
        }

        if (stack.size() == 0) return "YES";
        else return "NO";
    }
}
