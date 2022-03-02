import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class boj11536 {

    static int N;
    static int status;
    static String[] arr;
    static String[] sortedArr;

    public static void main(String[] args) throws IOException {
        input();
        pro();
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new String[N];
        sortedArr = new String[N];

        for (int i = 0; i < N; i++) {
            sortedArr[i] = arr[i] = br.readLine();
        }
    }

    static void pro() {
        Arrays.sort(sortedArr);

        for (int i = 0; i < N; i++) {
            if (sortedArr[i] == arr[i]) {
                status = 0;
            } else {
                status = 2;
                break;
            }
        }

        if (status == 0) {
            System.out.println("INCREASING");
            System.exit(0);
        }

        for (int i = 0; i < N; i++) {
            if (sortedArr[N - i - 1] == arr[i]) {
                status = 1;
            } else {
                status = 2;
                break;
            }
        }

        if (status == 1) {
            System.out.println("DECREASING");
            System.exit(0);
        }

        System.out.println("NEITHER");

    }

}
