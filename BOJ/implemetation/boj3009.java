import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj3009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int[] x = new int[3];
        int[] y = new int[3];
        int nx, ny;

        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }

        if (x[0] == x[1]) {
            nx = x[2];
        } else if (x[0] == x[2]) {
            nx = x[1];
        } else {
            nx = x[0];
        }

        if (y[0] == y[1]) {
            ny = y[2];
        } else if (y[0] == y[2]) {
            ny = y[1];
        } else {
            ny = y[0];
        }

        System.out.println(nx + " " + ny);
    }
}
