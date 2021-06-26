import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            char input = sc.next().charAt(0);

            if (input == 'q') {
                System.out.println(input);
                break;
            }
            System.out.println(input);
        }
    }
}