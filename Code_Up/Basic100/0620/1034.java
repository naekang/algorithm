import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int oct = Integer.parseInt(s, 8);
        System.out.printf("%d", oct);
    }
}