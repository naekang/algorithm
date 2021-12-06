import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj11723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int M = Integer.parseInt(br.readLine());
        int ans = 0;

        while (M-- > 0) {
            String input = br.readLine();
            st = new StringTokenizer(input, " ");
            String str = st.nextToken();
            int num;

            switch (str) {
                case "add":
                    num = Integer.parseInt(st.nextToken());
                    ans = ans | 1 << (num - 1);
                    break;

                case "remove":
                    num = Integer.parseInt(st.nextToken());
                    ans = ans & ~(1 << (num - 1));
                    break;

                case "check":
                    num = Integer.parseInt(st.nextToken());
                    sb.append(((ans & 1 << (num - 1)) == 1 << (num - 1) ? 1 : 0) + "\n");
                    break;

                case "toggle":
                    num = Integer.parseInt(st.nextToken());
                    ans = ans ^ 1 << (num - 1);
                    break;

                case "all":
                    ans = ~0;
                    break;

                case "empty":
                    ans = 0;
                    break;
            }
        }
        System.out.println(sb.toString());
    }
}