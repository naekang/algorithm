package javaalgo.programmers.practice.unrank;

import java.util.Stack;

public class Programmers04 {

    public static void main(String[] args) {
        String s1 = "[](){}";
        String s2 = "}]()[{";
        String s3 = "[)(]";
        String s4 = "}}}";

        System.out.println(solution(s1));
        System.out.println(solution(s2));
        System.out.println(solution(s3));
        System.out.println(solution(s4));
    }

    static int solution(String s) {
        int answer = 0;

        for (int i = 0; i < s.length(); i++) {
            if (isValid(s)) {
                answer++;
            }

            s = s.substring(1, s.length()) + s.charAt(0);
        }

        return answer;
    }

    static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '[':
                case '{':
                case '(':
                    stack.push(s.charAt(i));
                    break;
                case ']':
                    if (stack.isEmpty()) return false;
                    if (stack.peek() != '[') return false;
                    stack.pop();
                    break;
                case '}':
                    if (stack.isEmpty()) return false;
                    if (stack.peek() != '{') return false;
                    stack.pop();
                    break;
                case ')':
                    if (stack.isEmpty()) return false;
                    if (stack.peek() != '(') return false;
                    stack.pop();
                    break;
            }
        }

        return stack.isEmpty();
    }

}
