import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj16916 {

    static int ans = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();
        String P = br.readLine();

        kmp(S, P);

        System.out.println(ans);
    }

    public static void kmp(String origin, String pattern) {
        int[] pi = getPi(pattern);
        int j = 0;

        for (int i = 0; i < origin.length(); i++) {
            while (j > 0 && origin.charAt(i) != pattern.charAt(j)) {
                j = pi[j - 1];
            }

            if (origin.charAt(i) == pattern.charAt(j)) {
                if (j == pattern.length() - 1) {
                    ans = 1;
                    break;
                } else {
                    j++;
                }
            }
        }
    }

    public static int[] getPi(String pattern) {
        int[] pi = new int[pattern.length()];
        int j = 0;

        for (int i = 1; i < pattern.length(); i++) {
            while (j > 0 && pattern.charAt(i) != pattern.charAt(j)) {
                j = pi[j - 1];
            }

            if (pattern.charAt(i) == pattern.charAt(j)) {
                pi[i] = ++j;
            }
        }
        return pi;
    }
}
