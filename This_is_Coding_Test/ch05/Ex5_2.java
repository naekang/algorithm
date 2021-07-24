import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node {
    private int x;
    private int y;

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
}

public class Ex5_2 {

    public static int N, M;

    public static int[][] graph = new int[201][201];

    // 상 하 좌 우
    public static int dx[] = {-1, 1, 0, 0};
    public static int dy[] = {0, 0, -1, 1};

    public static int bfs (int x, int y) {
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(x, y));

        // 큐가 빌 때까지 반복
        while (!q.isEmpty()) {
            Node node = q.poll();
            x = node.getX();
            y = node.getY();

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                // 미로 공간 벗어나면 무시
                if (nx < 0 || nx >= N || ny < 0 || ny >= M) {
                    continue;
                }
                if (graph[nx][ny] == 0) {
                    continue;
                }
                if (graph[nx][ny] == 1) {
                    graph[nx][ny] = graph[x][y] + 1;
                    q.offer(new Node(nx, ny));
                }
            }
        }
        return graph[N - 1][M - 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < N; i++) {
            String str = sc.nextLine();
            for (int j = 0; j < M; j++) {
                graph[i][j] = str.charAt(j) - '0';
            }
        }

        System.out.println(bfs(0, 0));

    }
}
