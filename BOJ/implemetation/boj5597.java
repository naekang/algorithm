import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj5597 {

    static int[] arr;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        input();
        pro();
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        arr = new int[30];
        for (int i = 0; i < 28; i++) {
            arr[Integer.parseInt(br.readLine()) - 1] = 1;
        }
    }

    static void pro() {
        for (int i = 0; i < 30; i++) {
            if (arr[i] == 0) {
                sb.append(i + 1).append('\n');
            }
        }
        System.out.println(sb.toString());
    }
}
