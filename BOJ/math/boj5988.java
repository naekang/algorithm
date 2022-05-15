import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj5988 {

    static int N;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        inputAndPrint();
    }

    static void inputAndPrint() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        while (N-- != 0) {
            String[] arr = br.readLine().split("");

            if (Integer.parseInt(arr[arr.length - 1]) % 2 != 0) {
                sb.append("odd").append('\n');
            } else {
                sb.append("even").append('\n');
            }
        }

        System.out.println(sb.toString());
    }
}
