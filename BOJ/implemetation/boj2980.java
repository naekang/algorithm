import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj2980 {

    static int N, L, D, R, G;
    static Light[] lights;

    static class Light {
        int pos;
        int red;
        int green;

        public Light(int pos, int red, int green) {
            this.pos = pos;
            this.red = red;
            this.green = green;
        }
    }

    public static void main(String[] args) throws IOException {
        input();
        pro();
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        L = Integer.parseInt(st.nextToken());
        lights = new Light[N + 1];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            D = Integer.parseInt(st.nextToken());
            R = Integer.parseInt(st.nextToken());
            G = Integer.parseInt(st.nextToken());
            lights[i] = new Light(D, R, G);
        }
    }

    static void pro() {
        int ans = 0;

        for (int i = 0; i < N; i++) {
            if (i == 0) {
                ans += lights[i].pos;
            } else {
                ans += (lights[i].pos - lights[i - 1].pos);
            }

            int cnt = ans / (lights[i].red + lights[i].green);
            int time = ans - (cnt * (lights[i].red + lights[i].green));

            if (time < lights[i].red) {
                ans += (lights[i].red - time);
            } else {
                continue;
            }
        }
        ans += (L - lights[N - 1].pos);

        System.out.println(ans);
    }
}
