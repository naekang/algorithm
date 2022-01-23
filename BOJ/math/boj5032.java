import java.io.*;
import java.util.StringTokenizer;

public class boj5032 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int cnt = 0;
        int bottle = e + f;

        while (bottle >= c) {
            bottle = bottle - c + 1;
            cnt++;
        }

        bw.write(cnt + "");
        bw.flush();
        bw.close();
    }
}
