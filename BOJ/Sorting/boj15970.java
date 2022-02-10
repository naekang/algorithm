import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class boj15970 {

    static int N;
    static ArrayList<Integer>[] list;

    public static void main(String[] args) throws IOException {
        input();
        pro();
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        list = new ArrayList[N + 1];

        for (int color = 1; color <= N; color++) {
            list[color] = new ArrayList<>();
        }

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            int colorIndex = Integer.parseInt(st.nextToken());
            int color = Integer.parseInt(st.nextToken());
            // TODO: color인 색깔이 점이 colorIndex에 놓여 있음
            list[color].add(colorIndex);
        }
    }

    static int toLeft(int color, int idx) {
        // TODO
        // 색깔이 color인 점의 idx번째에 있는 점이 왼쪽으로 화살표를 그린다면
        // 화살표의 길이를 return하는 함수. 왼쪽에 점이 없다면 무한대를 return
        if (idx == 0)
            return Integer.MAX_VALUE;
        return list[color].get(idx) - list[color].get(idx - 1);
    }

    static int toRight(int color, int idx) {
        // TODO
        // 색깔이 color인 점의 idx 번째에 있는 점이 오른쪽으로 화살표를 그린다면
        // 화살표의 길이를 return 하는 함수. 오른쪽에 점이 없다면 무한대를 return
        if (idx + 1 == list[color].size())
            return Integer.MAX_VALUE;
        return list[color].get(idx + 1) - list[color].get(idx);
    }

    static void pro() {
        // TODO: 색깔별로 정렬
        for (int color = 1; color <= N; color++) {
            Collections.sort(list[color]);
        }

        int ans = 0;
        for (int color = 1; color <= N; color++) {
            // TODO: 색깔 별로, 각 점마다 가장 가까운 점 찾기
            for (int i = 0; i < list[color].size(); i++) {
                int left = toLeft(color, i); // 왼쪽 점 까지의 거리
                int right = toRight(color, i); // 오른쪽 점까지의 거
                ans += Math.min(left, right);
            }
        }

        // 정답 출력하기
        System.out.println(ans);
    }
}
