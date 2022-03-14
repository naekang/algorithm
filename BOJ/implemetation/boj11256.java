import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class boj11256 {

    static int T;
    static int J, N, R, C;
    static Integer[] arr;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        pro();
    }


    static void pro() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            J = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            arr = new Integer[N];

            for (int j = 0; j < N; j++) {
                st = new StringTokenizer(br.readLine());
                R = Integer.parseInt(st.nextToken());
                C = Integer.parseInt(st.nextToken());
                arr[j] = R * C;
            }

            int ans = 0;

            Arrays.sort(arr, Collections.reverseOrder());

            for (int j = 0; j < N; j++) {
                J -= arr[j];
                ans++;
                if (J <= 0) break;
            }
            sb.append(ans).append('\n');
        }

        System.out.println(sb.toString());
    }
}
