import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj5355 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            st = new StringTokenizer(br.readLine());

            double num = Double.parseDouble(st.nextToken());

            while (st.hasMoreTokens()) {
                String str = st.nextToken();

                if (str.equals("@")) {
                    num *= 3;
                } else if (str.equals("%")) {
                    num += 5;
                } else {
                    num -= 7;
                }
            }
            System.out.printf("%.2f\n", num);
        }


    }
}
