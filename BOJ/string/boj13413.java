import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj13413 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());

            String input = br.readLine();
            String target = br.readLine();

            System.out.println(calc(input, target));
        }
    }

    static int calc(String input, String target) {

        int W_Count = 0;
        int B_Count = 0;
        int ans = 0;

        for (int i = 0; i < target.length(); i++) {
            if (input.charAt(i) != target.charAt(i)) {
                if (input.charAt(i) == 'W') {
                    W_Count++;
                } else {
                    B_Count++;
                }
            }
        }
        ans += (Math.min(W_Count, B_Count) + Math.abs(W_Count - B_Count));
        return ans;
    }
}
