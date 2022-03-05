import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class boj1021 {

    static int N, M;
    static int[] num;
    static LinkedList<Integer> list;

    public static void main(String[] args) throws IOException {
        input();
        pro();
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        list = new LinkedList<>();
        num = new int[M];

        for (int i = 1; i <= N; i++) {
            list.add(i);
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }
    }

    static void pro() {

        int ans = 0;

        for (int i = 0; i < M; i++) {
            while (true) {
                if (list.getFirst() == num[i]) {
                    list.pollFirst();
                    break;
                }

                if (list.indexOf(num[i]) <= list.size() / 2) {
                    list.addLast(list.pollFirst());
                } else {
                    list.addFirst(list.pollLast());
                }
                ans++;
            }
        }

        System.out.println(ans);
    }
}
