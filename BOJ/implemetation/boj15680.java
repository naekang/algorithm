import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj15680 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(N == 1 ? "Leading the Way to the Future" : "YONSEI");
    }
}
