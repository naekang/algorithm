import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj13752 {

    static int N;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        inputAndPrint();
    }

    static void inputAndPrint() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());

            for (int j = 0; j < num; j++) {
                sb.append("=");
            }
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}
