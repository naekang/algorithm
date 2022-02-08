import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj1015 {

    static int N;
    static int[] P;
    static Elem[] B;
    static StringBuilder sb = new StringBuilder();

    static class Elem implements Comparable<Elem> {

        /**
         * @Param idx A배열의 idx 위치를 기억하는 변수
         * @Param num A[idx]의 원래 값
         */
        public int num, idx;

        @Override
        public int compareTo(Elem o) {
            // TODO
            // 정렬 조건에 맞게 정렬
            // 1. num의 비내림차순
            // 2. num이 같으면 idx 오름차순
            if (num != o.num) {
                return num - o.num;
            }
            return idx - o.idx;
        }
    }

    public static void main(String[] args) throws IOException {
        input();
        pro();
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        B = new Elem[N];
        P = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            B[i] = new Elem();
            // TODO: Elem의 정의에 맞게 B[i]에 값을 넣어주기
            B[i].num = Integer.parseInt(st.nextToken());
            B[i].idx = i;
        }

    }

    static void pro() {
        // TODO: B 배열 정렬
        Arrays.sort(B);

        // TODO: B 배열의 값을 이용해서 P 배열 채우기
        for (int b_idx = 0; b_idx < N; b_idx++) {
            P[B[b_idx].idx] = b_idx;
        }

        // TODO: P 배열 출력하기
        for (int i = 0; i < N; i++) {
            sb.append(P[i]).append(' ');
        }
        System.out.println(sb.toString());
    }
}
