import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj1159 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[26];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            arr[str.charAt(0) - 97]++;
        }
        boolean flag = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 5) {
                flag = true;
                sb.append((char) (i + 97));
            }
        }

        if (!flag) {
            sb.append("PREDAJA");
        }

        System.out.println(sb);
    }
}
