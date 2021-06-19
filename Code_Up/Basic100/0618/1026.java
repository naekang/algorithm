import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date = sc.nextLine();
        String[] dateArr = date.split("\\:");
        int minutes = Integer.parseInt(dateArr[1]);

        System.out.println(minutes);
    }
}