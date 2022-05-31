import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj11943 {

    static int A, B, C, D;

    public static void main(String[] args) throws IOException {
        inputAndPrint();
    }

    static void inputAndPrint() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        C = Integer.parseInt(st.nextToken());
        D = Integer.parseInt(st.nextToken());

        System.out.println(Math.min(A + D, C + B));
    }
}
