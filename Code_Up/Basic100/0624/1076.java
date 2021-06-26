import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char start = 'a';
        char eng = sc.nextLine().charAt(0);

        do {
            System.out.println(start);
            start += 1;
        } while (start <= eng);

    }
}