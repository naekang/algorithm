package javaalgo.haulzzang.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class boj1935 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String expression = br.readLine();

        double[] arr = new double[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Double.parseDouble(br.readLine());
        }

        Stack<Double> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            if (String.valueOf(expression.charAt(i)).matches("[A-Z]")) {
                stack.push(arr[expression.charAt(i) - 'A']);
            } else {
                if (!stack.isEmpty()) {
                    double one = stack.pop();
                    double two = stack.pop();

                    switch (expression.charAt(i)) {
                        case '+':
                            stack.push(one + two);
                            break;
                        case '*':
                            stack.push(one * two);
                            break;
                        case '-':
                            stack.push(two - one);
                            break;
                        case '/':
                            stack.push(two / one);
                            break;
                    }
                }
            }
        }

        System.out.printf("%.2f", stack.pop());

    }
}
