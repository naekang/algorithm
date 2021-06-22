import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date = sc.next();
        String[] dateArr = date.split("\\.");

        System.out.println(dateArr[2] + "-" + dateArr[1] + "-" + dateArr[0]);
    }
}