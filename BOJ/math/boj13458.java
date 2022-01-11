import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj13458 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        long cnt = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= B) {
                cnt++;
                continue;
            } else {
                cnt++;
                arr[i] -= B;
                if (arr[i] % C == 0) {
                    cnt += arr[i] / C;
                } else {
                    cnt += arr[i] / C + 1;
                }
            }
        }

        System.out.println(cnt);
    }
}
