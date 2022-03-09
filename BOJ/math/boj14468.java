import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj14468 {

    static int[][] alpha;
    static char[] arr;

    public static void main(String[] args) throws IOException {
        input();
        pro();
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        alpha = new int[26][2];
        arr = br.readLine().toCharArray();

        for (int i = 0; i < arr.length; i++) {
            int idx = arr[i] - 'A';
            if (alpha[idx][0] == 0) {
                alpha[idx][0] = i + 1;
            } else {
                alpha[idx][1] = i + 1;
            }
        }
    }

    static void pro() {

        int cnt = 0;

        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < 26; j++) {
                if (alpha[i][0] < alpha[j][0] && alpha[j][0] < alpha[i][1] && alpha[i][1] < alpha[j][1]) {
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
    }
}
