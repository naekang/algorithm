import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class boj1786 {

    static int ans = 0;
    static List<Integer> list;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String origin = br.readLine();
        String pattern = br.readLine();

        list = new ArrayList<>();

        kmp(origin, pattern);

        System.out.println(ans);

        for (int i = 0; i < ans; i++) {
            System.out.println(list.get(i));
        }
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
                    ++ans;
                    list.add(i - j + 1);
                    j = pi[j];
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
