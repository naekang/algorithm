package javaalgo.haulzzang.week10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class boj1874 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Stack<Integer> stack = new Stack<>();

        int idx = 0;

        for (int i = 1; i <= n; i++) {
            stack.push(i);
            sb.append('+').append('\n');

            while (!stack.isEmpty() && stack.peek() == arr[idx]) {
                stack.pop();
                sb.append('-').append('\n');
                idx++;
            }
        }

        System.out.println(stack.isEmpty() ? sb.toString() : "NO");
    }
}
