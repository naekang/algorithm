import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj9625 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int K = Integer.parseInt(br.readLine());

        int A = 0;
        int B = 1;
        int sum = 0;

        for (int i = 1; i < K; i++) {
            sum = A + B;
            A = B;
            B = sum;
        }
        System.out.println(A + " " + B);
    }
}
