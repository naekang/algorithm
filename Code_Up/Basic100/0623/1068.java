import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        if (score >= 90 && score <= 100) {
            System.out.println("A");
        } else if (score >= 70 && score < 90) {
            System.out.println("B");
        } else if (score >= 40 && score < 70) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }
    }
}