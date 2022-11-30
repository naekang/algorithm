package javaalgo.haulzzang.week9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class boj2581 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();
        for (int i = M; i <= N; i++) {
            if (isPrime(i)) {
                list.add(i);
            }
        }

        if (list.size() == 0) {
            System.out.println(-1);
        } else {
            System.out.println(list.stream().mapToInt(Integer::intValue).sum());
            System.out.println(list.get(0));
        }
    }

    static boolean isPrime(int n) {
        if (n <= 1) return false;
        else if (n == 2) return true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

}
