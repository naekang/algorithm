package javaalgo.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class boj11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        AtomicInteger idx = new AtomicInteger();

        int sum1 = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted()
            .map(i -> i * (N - idx.getAndIncrement())).sum();

        System.out.println(sum1);
    }
}
