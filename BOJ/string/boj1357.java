import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1357 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        System.out.println(reverse(reverse(Integer.parseInt(st.nextToken())) + reverse(Integer.parseInt(st.nextToken()))));

    }

    private static int reverse(int num) {
        int result = 0;
        while (num != 0) {
            result = result * 10 + num % 10;
            num /= 10;
        }
        return result;
    }
}
