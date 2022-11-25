package javaalgo.haulzzang.week8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class boj10825 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        Score[] arr = new Score[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i] = new Score(st.nextToken(), Integer.parseInt(st.nextToken()),
                Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        Arrays.sort(arr, (o1, o2) -> {
            if (o1.korean < o2.korean) {
                return 1;
            } else if (o1.korean == o2.korean) {
                if (o1.eng > o2.eng) {
                    return 1;
                } else if (o1.eng == o2.eng) {
                    if (o1.math < o2.math) {
                        return 1;
                    } else if (o1.math == o2.math) {
                        return o1.name.compareTo(o2.name);
                    }
                }
            }
            return -1;
        });

        for (Score score : arr) {
            sb.append(score.name).append('\n');
        }
        System.out.println(sb.toString());
    }
}

class Score {
    String name;
    int korean;
    int eng;
    int math;

    public Score(String name, int korean, int eng, int math) {
        this.name = name;
        this.korean = korean;
        this.eng = eng;
        this.math = math;
    }
}
