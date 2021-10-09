import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1806 {

    static int N, S;
    static int[] nums;
    static int left = 0;
    static int right = 0;
    static StringTokenizer st;
    static int sum = 0;
    static int answer = 100001;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
        nums = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        while (true) {
            if (sum >= S) {
                sum -= nums[left];
                answer = Math.min(answer, (right - left));
                left++;
            } else if (right == N) {
                break;
            } else {
                sum += nums[right++];
            }
        }

        System.out.println((answer == 100001 ? 0 : answer));
    }
}
