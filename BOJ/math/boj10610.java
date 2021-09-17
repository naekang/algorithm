import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class boj10610 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String num = br.readLine();

        int[] arr = new int[num.length()];

        int cnt = 0;

        for (int i = 0; i < num.length(); i++) {
            arr[i] = num.charAt(i) - 48;
            cnt += arr[i];
        }
        Arrays.sort(arr);

        if ((cnt % 3 == 0) && (arr[0] == 0)) {
            for (int i = num.length() - 1; i >= 0; i--) {
                System.out.print(arr[i]);
            }
        } else {
            System.out.println(-1);
        }
    }
}
