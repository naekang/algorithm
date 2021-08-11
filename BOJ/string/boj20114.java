import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj20114 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());

        char[] ch = new char[N];
        Arrays.fill(ch, '?');

        for (int i = 0; i < H; i++) {
            String str = br.readLine();

            for (int j = 0; j < N * W; j++) {
                char c = str.charAt(j);
                if (c == '?')
                    continue;
                else
                    ch[j/W] = c;
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.print(ch[i]);
        }
    }
}
