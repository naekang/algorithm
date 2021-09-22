import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj9093 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            String input = br.readLine();
            String[] arr = input.split(" ");

            for (int i = 0; i < arr.length; i++) {
                StringBuilder sb = new StringBuilder(arr[i]);
                String reverse = sb.reverse().toString();
                arr[i] = reverse;
                System.out.print(arr[i] + " ");
            }

        }
    }
}
