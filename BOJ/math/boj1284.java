import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj1284 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            int cnt = 0;

            String str = br.readLine();

            if (str.equals("0")) break;

            for (int i = 0; i < str.length(); i++) {
                char[] arr = str.toCharArray();

                if (arr[i] == '1') {
                    cnt += 3;
                } else if (arr[i] == '0') {
                    cnt += 5;
                } else {
                    cnt += 4;
                }
            }
            sb.append(cnt + 1).append("\n");
        }

        System.out.println(sb.toString());
    }
}
