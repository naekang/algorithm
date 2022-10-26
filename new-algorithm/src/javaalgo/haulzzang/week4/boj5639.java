package javaalgo.haulzzang.week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj5639 {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Node node = new Node(Integer.parseInt(br.readLine()));

        while (true) {
            String str = br.readLine();

            if (str == null || str.equals(""))
                break;

            node.insert(Integer.parseInt(str));
        }

        postOrder(node);

        System.out.println(sb.toString());
    }

    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }

        void insert(int num) {
            if (num < this.data) {
                if (this.left == null) {
                    this.left = new Node(num);
                } else {
                    this.left.insert(num);
                }
            } else {
                if (this.right == null) {
                    this.right = new Node(num);
                } else {
                    this.right.insert(num);
                }
            }
        }
    }

    static void postOrder(Node node) {
        if (node == null) return;

        postOrder(node.left);
        postOrder(node.right);
        sb.append(node.data).append('\n');
    }
}
