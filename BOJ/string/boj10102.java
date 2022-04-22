import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj10102 {

    static int V;
    static String str;

    public static void main(String[] args) throws IOException {
        input();
        pro();
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        V = Integer.parseInt(br.readLine());
        str = br.readLine();
    }

    static void pro() {
        int ACnt = 0, BCnt = 0;

        for (int i = 0; i < V; i++) {
            if (str.charAt(i) == 'A') ACnt++;
            else if (str.charAt(i) == 'B') BCnt++;
        }

        if (ACnt == BCnt) {
            System.out.println("Tie");
        } else if (ACnt > BCnt) {
            System.out.println("A");
        } else {
            System.out.println("B");
        }

    }
}
