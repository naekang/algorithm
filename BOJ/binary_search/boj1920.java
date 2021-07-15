import java.util.Arrays;
import java.util.Scanner;

public class boj1920 {

    static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int M = sc.nextInt();
        int flag;
        boolean is = false;

        Arrays.sort(arr);

        for (int i = 0; i < M; i++) {
            flag = sc.nextInt();
            System.out.println(binarySearch(0, arr.length, flag));
        }
    }

    public static int binarySearch(int start, int end, int input) {

        int mid = (start + end) / 2;

        if (mid >= end) {
            return 0;
        }

        if (arr[mid] == input) {
            return 1;
        } else if (arr[mid] < input) {
            return binarySearch(mid + 1, end, input);
        } else {
            return binarySearch(start, mid, input);
        }
    }
}
