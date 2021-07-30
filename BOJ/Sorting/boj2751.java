import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class boj2751 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(sc.nextInt());
        }

        Collections.sort(list);

        for (int num : list) {
            sb.append(num).append('\n');
        }
        System.out.println(sb);
    }
}