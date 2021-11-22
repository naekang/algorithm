import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj2490 {

    static final char[] result = {'D', 'C', 'B', 'A', 'E'};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 3; i++) {
            String[] str = br.readLine().split(" ");
            int ans = 0;

            for (int j = 0; j < str.length; j++) {
                ans += Integer.parseInt(str[j]);
            }

            System.out.println(result[ans]);
        }
    }
}
