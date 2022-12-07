package javaalgo.haulzzang.week10;

import java.util.Arrays;

public class boj15596 {

    public static void main(String[] args) {

    }

    static long sum(int[] a) {
        return Arrays.stream(a).mapToLong(Long::valueOf).sum();
    }
}
