import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj2979 {

    static int A, B, C;
    static int arrive, leave;
    static int min, max;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        input();
        pro();
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        arr = new int[101];

        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            arrive = Integer.parseInt(st.nextToken());
            leave = Integer.parseInt(st.nextToken());

            min = Math.min(min, arrive);
            max = Math.max(max, leave);

            for (int j = arrive; j < leave; j++) {
                arr[j]++;
            }
        }
    }

    static void pro() {
        int sum = 0;

        for (int i = min; i < max; i++) {
            if (arr[i] == 1) {
                sum += A * arr[i];
            } else if (arr[i] == 2) {
                sum += B * arr[i];
            } else if (arr[i] == 3) {
                sum += C * arr[i];
            }
        }

        System.out.println(sum);
    }
}
