import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj16171 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine().replaceAll("[0-9]", "");
        String targetStr = br.readLine();

        System.out.println((input.indexOf(targetStr) != -1)  ? 1 : 0);
    }
}
