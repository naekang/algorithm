package javaalgo.haulzzang.week13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj12018 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Lecture[] lectures = new Lecture[n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken());
            int l = Integer.parseInt(st.nextToken());
            int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt)
                .sorted().toArray();
            int min = 0;
            if (arr.length >= l) {
                min = arr[p - l];
            } else {
                min = 1;
            }

            lectures[i] = new Lecture(p, l, min);
        }

        Arrays.sort(lectures);

        int cnt = 0;
        int answer = 0;
        for (Lecture lecture : lectures) {
            cnt += lecture.min;
            if (cnt > m) {
                break;
            } else {
                answer++;
            }
        }

        System.out.println(answer);
    }
}

class Lecture implements Comparable<Lecture> {

    int p;
    int l;
    int min;

    public Lecture(int p, int l, int min) {
        this.p = p;
        this.l = l;
        this.min = min;
    }

    @Override
    public int compareTo(Lecture o) {
        return this.min - o.min;
    }
}
