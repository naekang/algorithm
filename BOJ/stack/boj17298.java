import java.util.Scanner;
import java.util.Stack;

public class boj17298 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();

        int N = sc.nextInt();
        int[] num = new int[N];

        for (int i = 0; i < N; i++) {
            num[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            while (!stack.isEmpty() && num[stack.peek()] < num[i]) {
                num[stack.pop()] = num[i];
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            num[stack.pop()] = -1;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            sb.append(num[i]).append(' ');
        }

        System.out.println(sb);
    }
}
