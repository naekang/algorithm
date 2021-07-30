import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj1305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.valueOf(br.readLine());
        String str = br.readLine();

        int last = getLastPi(str);
        System.out.println(L - last);
    }

    public static int getLastPi(String str) {
        int len = str.length();
        int index = 0, max = 0;
        int[] pi = new int[len];

        for (int i = 1; i < len; i++) {
            while (index > 0 && str.charAt(index) != str.charAt(i)) {
                index = pi[index - 1];
            }

            if (str.charAt(index) == str.charAt(i)) {
                pi[i] = ++index;
                max = Math.max(max, pi[i]);
            }
        }
        return pi[len - 1];
    }
}
