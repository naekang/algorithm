import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj2902 {


    public static void main(String[] args) throws IOException {
        boj2902 T = new boj2902();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        System.out.println(T.solution(input));
    }

    public String solution(String str) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        String[] arr = str.split("-");

        for (String x : arr) {
            char[] ch = x.toCharArray();
            sb.append(ch[0]);
        }

        return sb.toString();
    }
}
