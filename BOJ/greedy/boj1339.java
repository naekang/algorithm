import java.util.Arrays;
import java.util.Scanner;

public class boj1339 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String[] str = new String[N];
        int[] alph = new int[26];

        for (int i = 0; i < N; i++) {
            str[i] = sc.next();
        }

        for (int i = 0; i < N; i++) {
            int tmp = (int)Math.pow(10, str[i].length()-1);

            for (int j = 0; j < str[i].length(); j++) {
                alph[(int)str[i].charAt(j) - 65] += tmp;
                tmp /= 10;
            }
        }

        Arrays.sort(alph);
        int index = 9;
        int sum = 0;
        for (int i = alph.length - 1; i >= 0; i--) {
            if (alph[i] == 0) {
                break;
            }
            sum += alph[i] * index;
            index--;
        }
        System.out.println(sum);
    }
}
