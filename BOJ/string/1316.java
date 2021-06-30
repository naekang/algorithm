import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt();
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            if (checkWord() == true)
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
                if (check[target - 'a'] == false) {
                    check[target - 'a'] = true;
                    first = target;
                } else {
                    return false;
                }
            } else {
                continue;
            }
        }
        return true;
    }
}