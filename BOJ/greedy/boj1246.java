import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class boj1246 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int ans = 0, max = 0;


        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < M; i++) {
            arr.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(arr);

        for (int i = 0; i < M; i++) {
            int tmp = arr.get(i);
            int sum = 0;

            if (M - i < N) {
                sum = tmp * (M - i);
            } else {
                sum = tmp * N;
            }

            if (sum > max) {
                max = sum;
                ans = tmp;
            }
        }
        System.out.println(ans + " " + max);
    }
}
