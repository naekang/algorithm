import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] num = new int[10001];

        for (int i = 0; i < N; i++) {
            num[Integer.parseInt(br.readLine())]++;
        }
        br.close();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 10001; i++) {
            while (num[i] > 0) {
                sb.append(i).append('\n');
                num[i]--;
            }
        }
        System.out.println(sb);
    }
}
