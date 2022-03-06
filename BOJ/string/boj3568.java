import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj3568 {

    static String[] strArr;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        input();
        pro();
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        strArr = br.readLine().replace(",", "").replace(";", "").split(" ");
    }

    static void pro() {
        for (int i = 1; i < strArr.length; i++) {
            String[] result = reverse(strArr[i]).split(";");
            sb.append(strArr[0]).append(result[0]).append(" ").append(result[1]).append(";").append("\n");
        }

        System.out.println(sb.toString());
    }

    static String reverse(String str) {
        char[] charArr = str.toCharArray();
        String reverseStr = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            if (charArr[i] == ']') {
                reverseStr += "[]";
                i--;
            } else {
                if (charArr[i] == '*' || charArr[i] == '&') {
                    reverseStr += charArr[i];
                } else {
                    reverseStr += ";";
                    for (int j = 0; j <= i; j++) {
                        reverseStr += charArr[j];
                    }
                    break;
                }
            }
        }

        return reverseStr;
    }
}
