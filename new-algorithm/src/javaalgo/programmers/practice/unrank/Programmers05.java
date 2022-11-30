package javaalgo.programmers.practice.unrank;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Programmers05 {

    public static void main(String[] args) {
        int n1 = 437674;
        int k1 = 3;
        System.out.println(solution(n1, k1));

        int n2 = 110011;
        int k2 = 10;
        System.out.println(solution(n2, k2));
    }

    static int solution(int n, int k) {
        String kStr = Integer.toString(n, k);

        List<Integer> collect = Arrays.stream(Arrays.stream(kStr.split("0")).filter(s -> !s.equals("")).mapToInt(Integer::parseInt).toArray()).boxed().collect(Collectors.toList()).stream().filter(i -> i != 1).collect(
            Collectors.toList());
        System.out.println(Arrays.toString(collect.toArray()));

        String[] arr = kStr.split("0");
        int ans = 0;

        for (String s : arr) {
            if (!s.equals("") && findPrime(Long.parseLong(s))) {
                ans++;
            }
        }

        return ans;
    }

    static boolean findPrime(long n) {
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
