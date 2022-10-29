package javaalgo.haulzzang.week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class boj9934 {

    static int K, idx;
    static Node root;
    static int[] map;
    static List<Integer>[] adj;
    static StringBuilder sb = new StringBuilder();

    static class Node {
        int data;
        Node left, right;

        public Node(Node left, Node right) {
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) throws IOException {
        input();
        inOrder(root, 0);

        for (List<Integer> list : adj) {
            for (Integer num : list) {
                sb.append(num).append(' ');
            }
            sb.append('\n');
        }

        System.out.println(sb.toString());
    }

    static void inOrder(Node node, int depth) {
        if (node.left != null) inOrder(node.left, depth + 1);
        node.data = map[idx++];
        adj[depth].add(node.data);
        if (node.right != null) inOrder(node.right, depth + 1);
    }

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        K = Integer.parseInt(br.readLine());
        map = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        adj = new ArrayList[K];
        for (int i = 0; i < K; i++) {
            adj[i] = new ArrayList<>();
        }

        root = new Node(null, null);
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        for (int i = 0; i < K - 1; i++) {
            int size = queue.size();

            for (int j = 0; j < size; j++) {
                Node parent = queue.poll();

                parent.left = new Node(null, null);
                parent.right = new Node(null, null);

                queue.add(parent.left);
                queue.add(parent.right);
            }
        }
    }
}
