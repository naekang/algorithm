import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj2576 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int sum = 0;
        int min = 100;

        for (int i = 0; i < 7; i++) {
            int num = Integer.parseInt(br.readLine());

            if (num % 2 != 0) {
                sum += num;
                min = Math.min(min, num);
            }
        }

        if (sum == 0) {
            sb.append(-1);
        } else {
            sb.append(sum).append('\n').append(min);
        }

        System.out.println(sb.toString());
    }
}
