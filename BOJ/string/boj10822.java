import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class boj10822 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(",");

        int[] numArr = Arrays.stream(str).mapToInt(Integer::parseInt).toArray();
        int ans = 0;

        for (int num : numArr) {
            ans += num;
        }

        System.out.println(ans);
    }
}
