import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1145 {

    static int[] arr;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        input();
        solve(arr);
        System.out.println(sb.toString());
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        arr = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
    }

    static void solve(int[] nums) {
        int cnt = 0;
        int multiNum = 1;

        while (true) {
            for (int num : nums) {
                if (multiNum % num == 0)
                    cnt++;
            }
            if (cnt >= 3) {
                sb.append(multiNum);
                break;
            }
            cnt = 0;
            multiNum++;
        }
    }
}
