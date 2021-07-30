import java.util.Scanner;

public class boj1316 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt();
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            if (checkWord())
                cnt++;
        }
        System.out.println(cnt);
    }

    public static boolean checkWord() {
        boolean[] check = new boolean[26];
        int first = 0;
        String str = sc.next();

        for (int i = 0; i < str.length(); i++) {
            int target = str.charAt(i);

            if (first != target) {
                if (!check[target - 'a']) {
                    check[target - 'a'] = true;
                    first = target;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}