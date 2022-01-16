import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj3047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int[] arr = new int[3];

        for (int i = 0; i < 3; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        String str = br.readLine();

        for (int i = 0; i < arr.length; i++) {
            if (str.charAt(i) == 'A') {
                sb.append(arr[0]).append(" ");
            } else if (str.charAt(i) == 'B') {
                sb.append(arr[1]).append(" ");
            } else {
                sb.append(arr[2]).append(" ");
            }
        }

        System.out.println(sb);
    }
}
