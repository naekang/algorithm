import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        StringTokenizer token = new StringTokenizer(num, ".");

        int[] nums = new int[2];
        int i = 0;
        while (token.hasMoreTokens()) {
            nums[i] = Integer.parseInt(token.nextToken());
            i += 1;
        }
        String front = String.format("%d", nums[0]);
        String back = String.format("%d", nums[1]);

        System.out.println(front);
        System.out.println(back);
    }
}