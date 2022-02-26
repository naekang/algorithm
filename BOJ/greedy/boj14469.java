import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj14469 {

    static int N;
    static Elem[] B;

    static class Elem implements Comparable<Elem> {

        public int arrive, time;

        @Override
        public int compareTo(Elem other) {
            if (arrive != other.arrive) {
                return arrive - other.arrive;
            }
            return time - other.time;
        }
    }

    public static void main(String[] args) throws IOException {
        input();
        pro();
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        B = new Elem[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            B[i] = new Elem();

            B[i].arrive = Integer.parseInt(st.nextToken());
            B[i].time = Integer.parseInt(st.nextToken());
        }
    }

    static void pro() {
        Arrays.sort(B);

        int cnt = 0;
        for (int i = 0; i < N; i++) {
            if (B[i].arrive > cnt) {
                cnt = B[i].arrive + B[i].time;
            } else {
                cnt += B[i].time;
            }
        }

        System.out.println(cnt);
    }
}
