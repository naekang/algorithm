import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class boj11656 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        String[] strArr = new String[str.length()];

        for (int i = 0; i < str.length(); i++) {
            strArr[i] = str.substring(i, str.length());
        }

        Arrays.sort(strArr);

        for (String word : strArr) {
            System.out.println(word);
        }
    }
}
