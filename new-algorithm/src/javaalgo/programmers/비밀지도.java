package javaalgo.programmers;

import java.util.Arrays;

public class 비밀지도 {
    public static void main(String[] args) {
        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        String[] answer = solution(n, arr1, arr2);

        System.out.println(Arrays.toString(answer));
    }

    static String[] solution(int n, int[] arr1, int[] arr2) {
        int[] tmp = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            tmp[i] = arr1[i] | arr2[i];
        }

        return Arrays.stream(tmp)
                .mapToObj(i -> String.format("%16s", Integer.toBinaryString(i)))
                .map(i -> i.substring(i.length() - n).replace('1', '#').replace('0', ' '))
                .toArray(String[]::new);
    }
}
