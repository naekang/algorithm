import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj5586 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String[] strArr = new String[str.length() - 2];
        int joiCnt = 0;
        int ioiCnt = 0;

        for (int i = 0; i <= str.length() - 3; i++) {
            strArr[i] = str.substring(i, i + 3);
        }

        for (String subStr : strArr) {
            if (subStr.equals("JOI"))
                joiCnt++;
            else if (subStr.equals("IOI"))
                ioiCnt++;
        }

        System.out.println(joiCnt);
        System.out.println(ioiCnt);
    }
}
