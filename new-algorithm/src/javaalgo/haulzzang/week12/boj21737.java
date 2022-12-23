package javaalgo.haulzzang.week12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class boj21737 {

    static List<Integer> nums = new ArrayList<>();
    static List<Character> operators = new ArrayList<>();
    static List<Integer> answer = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String s = br.readLine();

        divide(s);
        System.out.println(solution(s));
    }

    static String solution(String s) {
        StringBuilder sb = new StringBuilder();
        if (!s.contains("C")) {
            return "NO OUTPUT";
        }

        int tmp = nums.get(0);
        int idx = 1;
        for (char ch : operators) {
            switch (ch) {
                case 'C':
                    answer.add(tmp);
                    break;
                case 'S':
                    if (nums.size() > idx) {
                        tmp -= nums.get(idx++);
                    }
                    break;
                case 'M':
                    if (nums.size() > idx) {
                        tmp *= nums.get(idx++);
                    }
                    break;
                case 'U':
                    if (nums.size() > idx) {
                        tmp /= nums.get(idx++);
                    }
                    break;
                case 'P':
                    if (nums.size() > idx) {
                        tmp += nums.get(idx++);
                    }
                    break;
            }
        }

        answer.forEach(i -> sb.append(i).append(' '));
        return sb.toString();
    }

    static void divide(String s) {
        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (ch >= '0' && ch <= '9') {
                sb.append(ch);
            } else {
                if (sb.length() > 0) {
                    nums.add(Integer.parseInt(sb.toString()));
                    sb = new StringBuilder();
                }
                operators.add(ch);
            }
        }
    }
}
