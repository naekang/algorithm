import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class boj2331 {

    static int A, P;
    static ArrayList<Integer> list;

    public static void main(String[] args) throws IOException {
        input();
        pro(A, P);
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        A = Integer.parseInt(st.nextToken());
        P = Integer.parseInt(st.nextToken());
        list = new ArrayList<>();

        list.add(A);
    }

    static void pro(int a, int p) {

        while (true) {
            int tmp = list.get(list.size() - 1);

            int sum = 0;
            while (tmp != 0) {
                sum += Math.pow(tmp % 10, p);
                tmp /= 10;
            }

            if (list.contains(sum)) {
                int ans = list.indexOf(sum);
                System.out.println(ans);
                break;
            }

            list.add(sum);
        }

    }
}
