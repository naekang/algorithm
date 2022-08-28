package javaalgo.programmers;

public class 신규_아이디_추천 {
    public static void main(String[] args) {
        String new_id = "...!@BaT#*..y.abcdefghijklm";
        String new_id1 = "z-+.^.";
        String new_id2 = "=.=";
        String new_id3 = "123_.def";
        String new_id4 = "abcdefghijklmn.p";

        System.out.println(solution(new_id));
        System.out.println(solution(new_id1));
        System.out.println(solution(new_id2));
        System.out.println(solution(new_id3));
        System.out.println(solution(new_id4));
    }

    static String solution(String new_id) {

        new_id = new_id.toLowerCase().replaceAll("[^a-z0-9\\-_.]", "");

        while (new_id.contains("..")) {
            new_id = new_id.replace("..", ".");
        }

        if (new_id.charAt(0) == '.') {
            new_id = new_id.substring(1, new_id.length());
        } else if (new_id.charAt(new_id.length() - 1) == '.') {
            new_id = new_id.substring(0, new_id.length() - 1);
        }

        if (new_id.length() == 0) new_id += "a";

        if (new_id.length() >= 16) {
            new_id = new_id.substring(0, 15);
        }

        if (new_id.charAt(new_id.length() - 1) == '.') {
            new_id = new_id.substring(0, new_id.length() - 1);
        }

        if (new_id.length() <= 2) {
            char last = new_id.charAt(new_id.length() - 1);
            while (new_id.length() < 3) {
                new_id += last;
            }
        }

        return new_id;
    }
}
