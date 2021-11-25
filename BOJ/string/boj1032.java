import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj1032 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String ans = "";
        String[] str = new String[N + 1];
        boolean check = true;

        for (int i = 0; i < N; i++) {
            str[i] = br.readLine();
        }

        for (int i = 0; i < str[0].length(); i++) {
            for (int j = 1; j < N; j++) {
                if (str[0].charAt(i) == str[j].charAt(i)) {
                    check = true;
                } else {
                    check = false;
                    break;
                }
            }
            if (check == false) {
                ans += "?";
            } else {
                ans += str[0].charAt(i);
            }
        }
        System.out.println(ans);
    }
}
