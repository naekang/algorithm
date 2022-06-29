package javaalgo.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class boj10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        int sum = 0;

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < K; i++) {
            int num = Integer.parseInt(br.readLine());

            if (num != 0) stack.push(num);
            else stack.pop();
        }

        for (Integer integer : stack) {
            sum += integer;
        }

        System.out.println(sum);
    }
}
