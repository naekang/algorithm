package javaalgo.tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1991 {

    static int N;
    static int[][] tree;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        tree = new int[30][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            char curCh = st.nextToken().charAt(0);
            int cur = curCh - 'A';

            for (int j = 0; j < 2; j++) {
                char ch = st.nextToken().charAt(0);
                if (ch == '.') tree[cur][j] = -1;
                else tree[cur][j] = ch - 'A';
            }
        }

        preOrder(0);
        sb.append('\n');
        inOrder(0);
        sb.append('\n');
        postOrder(0);


        System.out.println(sb);
    }

    // 전위순회
    static void preOrder(int x) {
        if (x != -1) {
            sb.append((char) (x + 'A'));
            preOrder(tree[x][0]);
            preOrder(tree[x][1]);
        }
    }

    // 중위순회
    static void inOrder(int x) {
        if (x != -1) {
            inOrder(tree[x][0]);
            sb.append((char) (x + 'A'));
            inOrder(tree[x][1]);
        }
    }

    // 후위순회
    static void postOrder(int x) {
        if (x != -1) {
            postOrder(tree[x][0]);
            postOrder(tree[x][1]);
            sb.append((char) (x + 'A'));
        }
    }
}
