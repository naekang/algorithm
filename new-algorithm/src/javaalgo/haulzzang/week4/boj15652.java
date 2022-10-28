package javaalgo.haulzzang.week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj15652 {

    static int N, M;
    static int[] nums;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        input();
        solution(0, 1);
        System.out.println(sb.toString());
    }

    static void solution(int idx, int start) {
        if (idx == M) {
            for (int i = 0; i < M; i++) {
                sb.append(nums[i]).append(" ");
            }
            sb.append('\n');
            return;
        }

        for (int i = start; i <= N; i++) {
            nums[idx] = i;
            solution(idx + 1, i);
        }
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        nums = new int[M + 1];
        visited = new boolean[N + 1];
    }
}
