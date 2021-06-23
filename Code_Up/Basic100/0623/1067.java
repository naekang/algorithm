import java.util.*;

public class Main {
    public static void oddEven(int x) {
        if (x % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }

    public static void minusPlus(int x) {
        if (x > 0) {
            System.out.println("plus");
        } else {
            System.out.println("minus");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        minusPlus(a);
        oddEven(a);
    }
}