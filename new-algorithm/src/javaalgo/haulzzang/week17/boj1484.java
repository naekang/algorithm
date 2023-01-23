package javaalgo.haulzzang.week17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class boj1484 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int G = Integer.parseInt(br.readLine());

        List<Integer> answer = new ArrayList<>();

        int p1 = 1, p2 = 1;

        while (true) {
            int diff = p1 * p1 - p2 * p2;

            if (p1 - p2 == 1 && diff > G) {
                break;
            }

            if (diff < G) {
                p1++;
            } else {
                p2++;
            }

            if (diff == G) {
                answer.add(p1);
            }
        }

        if (answer.size() < 1) {
            System.out.println(-1);
        } else {
            for (Integer num : answer) {
                System.out.println(num);
            }
        }
    }
}
