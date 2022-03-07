import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj18108 {

    static int y;

    public static void main(String[] args) throws IOException {
        input();
        pro();
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        y = Integer.parseInt(br.readLine());
    }

    static void pro() {
        System.out.println(y - 543);
    }
}
