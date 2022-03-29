import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj14582 {

    static int[] arrA, arrB;

    public static void main(String[] args) throws IOException {
        input();
        pro();
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        arrA = new int[9];
        arrB = new int[9];

        for (int i = 0; i < 9; i++) {
            arrA[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 9; i++) {
            arrB[i] = Integer.parseInt(st.nextToken());
        }
    }

    static void pro() {
        int aCnt = 0;
        int bCnt = 0;

        for (int i = 0; i < 9; i++) {
            aCnt += arrA[i];
            if (aCnt > bCnt) {
                System.out.println("Yes");
                return;
            }
            bCnt += arrB[i];
        }

        System.out.println("No");
    }
}
