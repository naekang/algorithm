import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        String hexString = Integer.toHexString(i).toUpperCase();

        System.out.println(hexString);
    }
}