package javaalgo.haulzzang.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class boj10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int K = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        while (K-- > 0) {
            int num = Integer.parseInt(br.readLine());

            if (num == 0) stack.pop();
            else stack.push(num);
        }

        System.out.println(stack.stream().mapToInt(Integer::intValue).sum());
    }
}
