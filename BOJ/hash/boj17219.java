import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class boj17219 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        HashMap<String, String> map = new HashMap<String, String>();
        for (int i = 0; i < N; i++) {
            input = br.readLine().split(" ");
            String site = input[0];
            String password = input[1];
            map.put(site, password);
        }

        for (int i = 0; i < M; i++) {
            String checkSite = br.readLine();
            System.out.println(map.get(checkSite));
        }
    }
}
