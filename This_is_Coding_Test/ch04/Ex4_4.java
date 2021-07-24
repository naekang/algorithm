import java.util.Scanner;

public class Ex4_4 {

    public static int N, M, x, y, dir;

    // 전체 맵 정보
    public static int[][] map = new int[50][50];

    // 방문한 위치 저장한 맵
    public static int[][] visited = new int[50][50];

    // 북, 동, 남, 서
    public static int dx[] = {-1, 0, 1, 0};
    public static int dy[] = {0, 1, 0, -1};

    // 왼쪽 회전
    public static void turnLeft() {
        dir -= 1;
        if (dir == -1)
            dir = 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        x = sc.nextInt();
        y = sc.nextInt();
        dir = sc.nextInt();

        // 현재 방문 좌표
        visited[x][y] = 1;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        int cnt = 1;
        int turn = 0;
        while (true) {
            turnLeft();
            int nx = x + dx[dir];
            int ny = y + dy[dir];

            if (visited[nx][ny] == 0 && map[nx][ny] == 0) {
                visited[nx][ny] = 1;
                x = nx;
                y = ny;
                cnt += 1;
                turn = 0;
                continue;
            } else {
                turn += 1;
            }

            if (turn == 4) {
                nx = x - dx[dir];
                ny = y - dy[dir];

                if (map[nx][ny] == 0) {
                    x = nx;
                    y = ny;
                } else {
                    break;
                }
                turn = 0;
            }
        }
        System.out.println(cnt);
    }
}
