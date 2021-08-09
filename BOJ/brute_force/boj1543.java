import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class boj1543 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        sb.append(br.readLine());

        String str = br.readLine();

        int cnt = 0;
        int start = 0;

        while ((start = sb.toString().indexOf(str)) != -1) {
            sb.delete(0, start + str.length());
            cnt++;
        }

        System.out.println(cnt);
    }
}
