import java.util.Scanner;

public class Ex5_1 {

    public static int N, M;
    public static int[][] graph = new int[1000][1000];

    public static boolean dfs(int x, int y) {
        if (x < 0 || y < 0 || x >= N || y >= M) {
            return false;
        }
        if (graph[x][y] == 0) {
            graph[x][y] = 1;
            // 상, 하, 좌, 우 위치들 모두 재귀 호출
            dfs(x - 1, y);
            dfs(x, y - 1);
            dfs(x + 1, y);
            dfs(x, y + 1);
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        sc.nextLine(); // 버퍼 지우기

        for (int i = 0; i < N; i++) {
            String str = sc.nextLine();
            for (int j = 0; j < M; j++) {
                graph[i][j] = str.charAt(j) - '0';
            }
        }

        int cnt = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (dfs(i, j)) {
                    cnt += 1;
                }
            }
        }
        System.out.println(cnt);

    }
}
