package javaalgo.programmers;

public class 네트워크 {

    static boolean[] visited;

    public static void main(String[] args) {
        int n = 3;
        int[][] computers1 = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
        int[][] computers2 = {{1, 1, 0}, {1, 1, 1}, {0, 1, 1}};

        System.out.println(solution(n, computers2));
    }

    static int solution(int n, int[][] computers) {
        visited = new boolean[n];

        int answer = 0;

        for (int i = 0; i < computers.length; i++) {
            if (!visited[i]) {
                dfs(i, n, computers);
                answer++;
            }
        }

        return answer;
    }

    static void dfs(int start, int n, int[][] computers) {
        visited[start] = true;

        for (int i = 0; i < n; i++) {
            if (computers[start][i] == 1 && !visited[i]) {
                dfs(i, n, computers);
            }
        }
    }
}


