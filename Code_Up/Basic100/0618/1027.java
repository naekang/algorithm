import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date = sc.next();
        String[] dateArr = date.split(".");
        // int year = Integer.parseInt(dateArr[0]);
        // int month = Integer.parseInt(dateArr[1]);
        // int day = Integer.parseInt(dateArr[2]);

        System.out.println(dateArr[2] + "-" + dateArr[1] + "-" + dateArr[0]);
    }
}