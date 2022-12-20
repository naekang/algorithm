package javaalgo.haulzzang.week12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class boj14241 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            stack.push(arr[i]);
        }

        int sum = 0;
        while (stack.size() > 2) {
            int x = stack.pop();
            int y = stack.pop();

            stack.push(x + y);
            sum += (x * y);
        }

        int lastX = stack.pop();
        int lastY = stack.pop();
        sum += (lastX * lastY);

        System.out.println(sum);
    }
}
