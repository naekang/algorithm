import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();

        for (int i = 0; i < C; i++) {
            int N = sc.nextInt();
            int[] arr = new int[N];

            double sum = 0;

            for (int j = 0; j < N; j++) {
                int score = sc.nextInt();
                arr[j] = score;
                sum += score;
            }

            double mean = sum / N;
            double cnt = 0;

            for (int j = 0; j < N; j++) {
                if (arr[j] > mean)
                    cnt++;
            }
            System.out.printf("%.3f%%\n", (cnt / N) * 100);
        }
    }
}