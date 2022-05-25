import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class boj2935 {

    static BigInteger A, B;
    static String str;

    public static void main(String[] args) throws IOException {
        input();
        pro();
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        A = new BigInteger(br.readLine());
        str = br.readLine();
        B = new BigInteger(br.readLine());
    }

    static void pro() {
        if (str.equals("+")) {
            System.out.println(A.add(B));
        } else {
            System.out.println(A.multiply(B));
        }
    }
}
