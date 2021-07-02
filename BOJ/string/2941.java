import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String words = sc.nextLine();
        int cnt = 0;

        for (int i = 0; i < words.length(); i++) {
            char ch = words.charAt(i);

            if (ch == 'c') {
                if (i < words.length() - 1) {
                    if (words.charAt(i + 1) == '=' || words.charAt(i + 1) == '-')
                        i++;
                }
            } else if (ch == 'd') {
                if (i < words.length() - 1) {
                    if (words.charAt(i + 1) == 'z') {
                        if (i < words.length() - 2) {
                            if (words.charAt(i + 2) == '=') {
                                i += 2;
                            }
                        }
                    } else if (words.charAt(i + 1) == '-')
                        i++;
                }
            } else if (ch == 'l') {
                if (i < words.length() - 1) {
                    if (words.charAt(i + 1) == 'j')
                        i++;
                }
            } else if (ch == 'n') {
                if (i < words.length() - 1) {
                    if (words.charAt(i + 1) == 'j')
                        i++;
                }
            } else if (ch == 's') {
                if (i < words.length() - 1) {
                    if (words.charAt(i + 1) == '=')
                        i++;
                }
            } else if (ch == 'z') {
                if (i < words.length() - 1) {
                    if (words.charAt(i + 1) == '=')
                        i++;
                }
            }
            cnt++;
        }
        System.out.println(cnt);
    }
}