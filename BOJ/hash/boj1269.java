import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class boj1269 {

    static int A, B;
    static Set<Integer> setA;
    static Set<Integer> setB;

    public static void main(String[] args) throws IOException {
        input();
        pro();
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        setA = new HashSet<>();
        setB = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < A; i++) {
            setA.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < B; i++) {
            setB.add(Integer.parseInt(st.nextToken()));
        }
    }

    static void pro() {
        int cnt = 0;

        for (int num : setA) {
            if (!setB.contains(num)) {
                cnt++;
            }
        }

        for (int num : setB) {
            if (!setA.contains(num)) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
