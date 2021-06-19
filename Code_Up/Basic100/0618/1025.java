import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        char[] numArr = num.toCharArray();
        System.out.println("[" + numArr[0] + "0000" + "]");
        System.out.println("[" + numArr[1] + "000" + "]");
        System.out.println("[" + numArr[2] + "00" + "]");
        System.out.println("[" + numArr[3] + "0" + "]");
        System.out.println("[" + numArr[4] + "]");
    }
}