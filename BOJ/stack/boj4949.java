import java.util.Scanner;
import java.util.Stack;

public class boj4949 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str;

        while (true) {
            str = sc.nextLine();

            if (str.equals(".")) {
                break;
            }
            System.out.println(check(str));
        }
    }

    public static String check(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            char c = str.charAt(i);

            if (c == '(' || c == '[') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.empty() || stack.peek() != '(') {
                    return "no";
                } else {
                    stack.pop();
                }
            } else if (c == ']') {
                if (stack.empty() || stack.peek() != '[') {
                    return "no";
                } else {
                    stack.pop();
                }
            }
        }

        if (stack.empty()) {
            return "yes";
        } else {
            return "no";
        }
    }
}
