package javaalgo.haulzzang.week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1991 {

    static int N;
    static Node[] tree;
    static StringBuilder sb = new StringBuilder();

    static class Node {
        char data;
        Node left;
        Node right;

        public Node(char parent) {
            this.data = parent;
        }
    }


    public static void main(String[] args) throws IOException {
        input();
        preOrder(tree[0]);
        sb.append('\n');
        inOrder(tree[0]);
        sb.append('\n');
        postOrder(tree[0]);

        System.out.println(sb.toString());
    }

    static void preOrder(Node node) {
        sb.append(node.data);
        if (node.left != null) preOrder(node.left);
        if (node.right != null) preOrder(node.right);
    }

    static void inOrder(Node node) {
        if (node.left != null) inOrder(node.left);
        sb.append(node.data);
        if (node.right != null) inOrder(node.right);
    }

    static void postOrder(Node node) {
        if (node.left != null) postOrder(node.left);
        if (node.right != null) postOrder(node.right);
        sb.append(node.data);
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        tree = new Node[N];

        for (int i = 0; i < N; i++) {
            tree[i] = new Node((char) (i + 'A'));
        }

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            char root = st.nextToken().charAt(0);
            char left = st.nextToken().charAt(0);
            char right = st.nextToken().charAt(0);

            if (left != '.') tree[root - 'A'].left = tree[left - 'A'];
            if (right != '.') tree[root - 'A'].right = tree[right - 'A'];
        }
    }
}
