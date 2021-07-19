import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long S = Long.parseLong(st.nextToken());

        long cnt = 1;
        long sum = 1;

        while (sum < S) {
            cnt++;
            sum += cnt;
        }

        if (sum > S) {
            cnt--;
        }

        System.out.println(cnt);
    }
}
