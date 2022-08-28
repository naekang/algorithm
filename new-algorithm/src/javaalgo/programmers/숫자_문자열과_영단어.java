package javaalgo.programmers;

public class 숫자_문자열과_영단어 {
    public static void main(String[] args) {
        String s = "one4seveneight";
        String s1 = "23four5six7";
        String s2 = "2three45sixseven";
        String s3 = "123";

        System.out.println(solution(s));
        System.out.println(solution(s1));
        System.out.println(solution(s2));
        System.out.println(solution(s3));
    }

    static int solution(String s) {
        s = s.replace("zero", "0")
                .replace("one", "1")
                .replace("two", "2")
                .replace("three", "3")
                .replace("four", "4")
                .replace("five", "5")
                .replace("six", "6")
                .replace("seven", "7")
                .replace("eight", "8")
                .replace("nine", "9");


        return Integer.parseInt(s);
    }
}
