import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1350 {

    static int N;
    static long size;

    public static void main(String[] args) throws IOException {
        inputAndPrint();
    }

    static void inputAndPrint() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        long ans = 0;

        st = new StringTokenizer(br.readLine());
        size = Long.parseLong(br.readLine());
        for (int i = 0; i < N; i++) {
            long file = Long.parseLong(st.nextToken());

            if (file != 0) {
                ans += (file / size);

                if (file % size != 0) {
                    ans++;
                }
            }
        }

        System.out.println(ans * size);
    }

}
