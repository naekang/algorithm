import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj14888 {

    static int N, max, min;
    static int[] nums, operators;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        input();
        rec_func(1, nums[1]);
        sb.append(max).append('\n').append(min);
        System.out.println(sb.toString());
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        nums = new int[N + 1];
        operators = new int[5];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= 4; i++) {
            operators[i] = Integer.parseInt(st.nextToken());
        }

        min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;
    }

    static int calculate(int num1, int operator, int num2) {
        if (operator == 1) {
            return num1 + num2;
        } else if (operator == 2) {
            return num1 - num2;
        } else if (operator == 3) {
            return num1 * num2;
        } else {
            return num1 / num2;
        }
    }

    static void rec_func(int k, int val) {
        if (k == N) {
            min = Math.min(min, val);
            max = Math.max(max, val);
        } else {
            for (int i = 1; i <= 4; i++) {
                if (operators[i] >= 1) {
                    operators[i]--;
                    rec_func(k + 1, calculate(val, i, nums[k + 1]));
                    operators[i]++;
                }
            }
        }
    }
}
