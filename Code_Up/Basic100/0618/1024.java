import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        char[] arrWord = word.toCharArray();
        for (int i = 0; i < arrWord.length; i++) {
            System.out.println("\'"+arrWord[i]+ "\'");
        }
    }
}