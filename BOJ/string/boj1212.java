import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj1212 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String octal = br.readLine();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < octal.length(); i++) {
            String deci = Integer.toBinaryString(octal.charAt(i) - '0');

            if (deci.length() == 2 && i != 0) {
                deci = "0" + deci;
            } else if (deci.length() == 1 && i != 0) {
                deci = "00" + deci;
            }
            sb.append(deci);
        }

        System.out.println(sb);

    }
}
