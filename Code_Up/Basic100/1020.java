import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        num = num.replace("-", "");
        System.out.println(num);
    }
}