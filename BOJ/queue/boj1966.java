import java.util.LinkedList;
import java.util.Scanner;

public class boj1966 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();

            LinkedList<int[]> q = new LinkedList<>();

            for (int i = 0; i < N; i++) {
                q.offer(new int[] { i, sc.nextInt() });
            }

            int cnt = 0;

            while (!q.isEmpty()) {
                int[] first = q.poll();
                boolean isMax = true;

                for (int i = 0; i < q.size(); i++) {
                    if (first[1] < q.get(i)[1]) {
                        q.offer(first);

                        for (int j = 0; j < i; j++) {
                            q.offer(q.poll());
                        }

                        isMax = false;
                        break;
                    }
                }

                if (isMax == false) {
                    continue;
                }
                cnt++;
                if (first[0] == M) {
                    break;
                }
            }
            sb.append(cnt).append('\n');
        }
        System.out.println(sb);
    }
}
