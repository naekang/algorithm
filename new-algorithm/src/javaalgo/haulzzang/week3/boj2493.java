package javaalgo.haulzzang.week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class boj2493 {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Stack<int[]> stack = new Stack<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            int num = Integer.parseInt(st.nextToken());


            while (!stack.isEmpty()) {
                if (stack.peek()[1] >= num) {
                    sb.append(stack.peek()[0]).append(' ');
                    break;
                }
                stack.pop();
            }

            if (stack.isEmpty()) {
                sb.append(0).append(' ');
            }
            stack.push(new int[]{i, num});
        }

        System.out.println(sb.toString());
    }

}
