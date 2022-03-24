import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class boj13904 {

    static int N, max;
    static ArrayList<Homework> list;

    static class Homework {

        int day;
        int score;

        public Homework(int day, int score) {
            this.day = day;
            this.score = score;
        }
    }

    public static void main(String[] args) throws IOException {
        input();
        pro();
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        list = new ArrayList<>();
        max = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int day = Integer.parseInt(st.nextToken());
            int score = Integer.parseInt(st.nextToken());
            list.add(new Homework(day, score));
            max = Math.max(max, day);
        }
    }

    static void pro() {

        int sum = 0;

        for (int i = max; i >= 1; i--) {

            Homework ans = new Homework(0, 0);

            for (Homework homework : list) {
                if (homework.day >= i) {
                    if (ans.score < homework.score) {
                        ans = homework;
                    }
                }
            }

            sum += ans.score;
            list.remove(ans);
        }

        System.out.println(sum);
    }

}
