import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj2864 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String A = st.nextToken();
        String B = st.nextToken();

        String minA = "", maxA = "";
        String minB = "", maxB = "";

        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == '6') {
                minA = minA + "5";
            } else {
                minA = minA + A.charAt(i);
            }

            if (A.charAt(i) == '5') {
                maxA = maxA + "6";
            } else {
                maxA = maxA + A.charAt(i);
            }
        }

        for (int i = 0; i < B.length(); i++) {
            if (B.charAt(i) == '6') {
                minB = minB + "5";
            } else {
                minB = minB + B.charAt(i);
            }

            if (B.charAt(i) == '5') {
                maxB = maxB + "6";
            } else {
                maxB = maxB + B.charAt(i);
            }
        }

        int min = Integer.parseInt(minA) + Integer.parseInt(minB);
        int max = Integer.parseInt(maxA) + Integer.parseInt(maxB);

        System.out.println(min + " " + max);
    }
}
