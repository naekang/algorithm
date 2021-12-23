import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj5361 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        double[] price = {350.34, 230.90, 190.55, 125.30, 180.90};

        int T = Integer.parseInt(br.readLine());
        int[] arr = new int[5];

        while (T-- > 0) {
            st = new StringTokenizer(br.readLine());

            double ans = 0;
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(st.nextToken());

                ans += arr[i] * price[i];
            }

            sb.append("$").append(String.format("%.2f", ans)).append("\n");
        }

        System.out.println(sb.toString());
    }
}
