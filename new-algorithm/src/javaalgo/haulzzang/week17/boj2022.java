package javaalgo.haulzzang.week17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj2022 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        double x = Double.parseDouble(st.nextToken());
        double y = Double.parseDouble(st.nextToken());
        double z = Double.parseDouble(st.nextToken());

        double left = 0;
        double right = Math.min(x, y);

        while (right - left >= 0.001) {
            double mid = (left + right) / 2;

            double h1 = Math.sqrt(x * x - mid * mid);
            double h2 = Math.sqrt(y * y - mid * mid);
            double res = (h1 * h2) / (h1 + h2);

            if (res >= z) {
                left = mid;
            } else {
                right = mid;
            }
        }

        System.out.printf("%.3f", right);
    }
}
