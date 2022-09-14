package javaalgo.programmers.practice.level2;

public class Programmers01 {
    public static void main(String[] args) {
        int w = 8;
        int h = 12;

        System.out.println(solution(w, h));
    }

    static long solution(int w, int h) {

        int gcd = gcd(Math.max(w, h), Math.min(w, h));

        int newW = w / gcd;
        int newH = h / gcd;

        return (long) w * h - ((long) newH + newW - 1) * gcd;
    }

    static int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return gcd(b, a % b);
    }
}
