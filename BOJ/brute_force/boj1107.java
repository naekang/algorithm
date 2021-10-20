import java.util.Scanner;

public class boj1107 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        boolean[] broken = new boolean[10];
        for (int i = 0; i < M; i++) {
            int broken_num = sc.nextInt();
            broken[broken_num] = true;
        }

        int result = Math.abs(N - 100);

        for (int i = 0; i <= 999999; i++) {
            String str = String.valueOf(i);

            boolean isBreak = false;

            for (int j = 0; j < str.length(); j++) {
                if (broken[str.charAt(j) - '0']) {
                    isBreak = true;
                    break;
                }
            }
            if (!isBreak) {
                int min = Math.abs(N - i) + str.length();
                result = Math.min(min, result);
            }
        }
        System.out.println(result);
    }
}
