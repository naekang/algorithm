import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj17294 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String k = br.readLine();
        int num = Integer.parseInt(String.valueOf(k.charAt(0)));
        int cnt = 0;
        boolean flag = true;

        if (k.length() > 2) {
            for (int i = 1; i < k.length(); i++) {
                int numAfter = Integer.parseInt(String.valueOf(k.charAt(i)));
                if (i == 1) {
                    cnt = numAfter - num;
                } else {
                    if (numAfter - num != cnt) {
                        flag = false;
                    }
                }
                num = numAfter;
            }
        }

        System.out.println((flag == true) ? "◝(⑅•ᴗ•⑅)◜..°♡ 뀌요미!!" : "흥칫뿡!! <(￣ ﹌ ￣)>");

    }
}
