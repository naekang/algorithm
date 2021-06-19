import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String chars = sc.nextLine();
        char[] charArr = chars.toCharArray();
        System.out.println(charArr[2] + " " + charArr[0]);
    }
}