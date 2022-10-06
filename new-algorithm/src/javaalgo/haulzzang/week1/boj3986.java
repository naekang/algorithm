package javaalgo.haulzzang.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class boj3986 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int cnt = 0;
        while (N-- > 0) {
            String str = br.readLine();

            if (solution(str)) cnt++;
        }

        System.out.println(cnt);
    }

    static boolean solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (i == 0) {
                stack.push(ch);
            } else {
                if (!stack.isEmpty() && ch == stack.peek()) {
                    stack.pop();
                } else {
                    stack.push(ch);
                }
            }
        }

        return stack.isEmpty();
    }
}
