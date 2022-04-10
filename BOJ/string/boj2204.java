import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class boj2204 {

    static int n;
    static String[] arr;

    public static void main(String[] args) throws IOException {
        pro();
    }

    static void pro() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            n = Integer.parseInt(br.readLine());

            if (n == 0) break;

            arr = new String[n];

            for (int i = 0; i < n; i++) {
                arr[i] = br.readLine();
            }

            Arrays.sort(arr, String.CASE_INSENSITIVE_ORDER);

            System.out.println(arr[0]);
        }

    }

}
