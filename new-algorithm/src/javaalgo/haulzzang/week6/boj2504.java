package javaalgo.haulzzang.week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class boj2504 {

    static String s;

    public static void main(String[] args) throws IOException {
        input();
        System.out.println(solution(s));
    }

    static int solution(String str) {
        Stack<Character> stack = new Stack<>();

        int answer = 0;
        int cnt = 1;
        boolean flag = true;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '[') {
                stack.push(ch);
                cnt *= 3;
            } else if (ch == '(') {
                stack.push(ch);
                cnt *= 2;
            } else {
                if (ch == ')') {
                    if (stack.isEmpty() || stack.peek() != '(') {
                        flag = false;
                        break;
                    }

                    if (str.charAt(i - 1) == '(') {
                        answer += cnt;
                    }

                    stack.pop();
                    cnt /= 2;
                } else if (ch == ']') {
                    if (stack.isEmpty() || stack.peek() != '[') {
                        flag = false;
                        break;
                    }

                    if (str.charAt(i - 1) == '[') {
                        answer += cnt;
                    }

                    stack.pop();
                    cnt /= 3;
                } else {
                    flag = false;
                    break;
                }
            }
        }

        return (!flag || !stack.isEmpty()) ? 0 : answer;
    }

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        s = br.readLine();
    }

}
