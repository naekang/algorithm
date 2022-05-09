import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj2783 {

    static int X, Y;
    static int X1, Y1;
    static int N;
    static double[] arr;

    public static void main(String[] args) throws IOException {
        inputAndPrint();
    }

    static void inputAndPrint() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        X = Integer.parseInt(st.nextToken());
        Y = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(br.readLine());

        double ans = (double) X / Y * 1000;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            X1 = Integer.parseInt(st.nextToken());
            Y1 = Integer.parseInt(st.nextToken());
            double tmp = (double) X1 / Y1 * 1000;
            ans = Math.min(tmp, ans);
        }

        System.out.println(ans);
    }

}
