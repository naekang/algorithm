import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj6996 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;

        while (T-- > 0) {
            st = new StringTokenizer(br.readLine());

            String str1 = st.nextToken();
            String str2 = st.nextToken();

            if (checkAnagram(str1, str2))
                sb.append(str1 + " & " + str2 + " are anagrams.").append("\n");
            else
                sb.append(str1 + " & " + str2 + " are NOT anagrams.").append("\n");
        }

        System.out.println(sb);
    }

    private static boolean checkAnagram(String str1, String str2) {
        char[] arrStr1 = str1.toCharArray();
        char[] arrStr2 = str2.toCharArray();

        Arrays.sort(arrStr1);
        Arrays.sort(arrStr2);

        return Arrays.equals(arrStr1, arrStr2);
    }
}
