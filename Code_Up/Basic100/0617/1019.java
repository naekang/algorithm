import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date = sc.nextLine();
        StringTokenizer token = new StringTokenizer(date, ".");

        int[] dates = new int[3];
        int i = 0;
        while (token.hasMoreTokens()) {
            dates[i] = Integer.parseInt(token.nextToken());
            i += 1;
        }
        String year = String.format("%04d", dates[0]);
        String month = String.format("%02d", dates[1]);
        String day = String.format("%02d", dates[2]);

        System.out.println(year + "." + month + "." + day);
    }
}