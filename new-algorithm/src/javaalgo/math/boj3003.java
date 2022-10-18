package javaalgo.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int king = 1;
        int queen = 1;
        int rook = 2;
        int bishop = 2;
        int knight = 2;
        int pawn = 8;

        StringTokenizer st = new StringTokenizer(br.readLine());
        king = king - Integer.parseInt(st.nextToken());
        queen = queen - Integer.parseInt(st.nextToken());
        rook = rook - Integer.parseInt(st.nextToken());
        bishop = bishop - Integer.parseInt(st.nextToken());
        knight = knight - Integer.parseInt(st.nextToken());
        pawn = pawn - Integer.parseInt(st.nextToken());

        System.out.print(king + " ");
        System.out.print(queen + " ");
        System.out.print(rook + " ");
        System.out.print(bishop + " ");
        System.out.print(knight + " ");
        System.out.print(pawn + " ");
    }
}
