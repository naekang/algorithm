import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj10820 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = "";
        while ((str = br.readLine()) != null) {
            char[] arr = str.toCharArray();
            int smallCnt = 0;
            int capitalCnt = 0;
            int numCnt = 0;
            int blankCnt = 0;

            for (char ch : arr) {
                if ('a' <= ch && ch <= 'z')
                    smallCnt++;
                else if ('A' <= ch && ch <= 'Z')
                    capitalCnt++;
                else if ('0' <= ch && ch <= '9')
                    numCnt++;
                else
                    blankCnt++;
            }
            System.out.printf("%d %d %d %d\n", smallCnt, capitalCnt, numCnt, blankCnt);
        }
    }
}
