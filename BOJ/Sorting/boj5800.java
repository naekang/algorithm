import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class boj5800 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int K = Integer.parseInt(br.readLine());

        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());
            Integer[] arr = new Integer[N];

            for (int j = 0; j < arr.length; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr, Collections.reverseOrder());

            int gap = Integer.MIN_VALUE;

            for (int j = 0; j < arr.length - 1; j++) {
                gap = Math.max(arr[j] - arr[j + 1], gap);
            }

            sb.append("Class ").append(i + 1).append("\n");
            sb.append("Max " + arr[0] + ", " + "Min " + arr[N - 1] + ", " + "Largest gap " + gap).append("\n");
        }

        System.out.println(sb);
    }
}
