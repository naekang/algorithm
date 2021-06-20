import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int hexaTmp = Integer.parseInt(s, 16);

        String hexa = Integer.toOctalString(hexaTmp);
        System.out.printf("%s", hexa);
    }
}