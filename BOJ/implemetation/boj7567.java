import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj7567 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split("");
        int ans = 0;
        String tmp = "";
        for (String s : str) {
            if (tmp.equals(s)) {
                ans += 5;
            } else {
                ans += 10;
            }
            tmp = s;
        }
        System.out.println(ans);
    }
}
