import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String numOctal = Integer.toOctalString(num);

        System.out.println(numOctal);
    }
}