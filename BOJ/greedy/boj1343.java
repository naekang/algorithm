import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj1343 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        str = str.replaceAll("XXXX", "AAAA");
        str = str.replaceAll("XX", "BB");

        if (str.contains("X")) {
            System.out.println(-1);
        } else {
            System.out.println(str);
        }
    }
}
