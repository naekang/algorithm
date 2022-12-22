package javaalgo.haulzzang.week12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj17254 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Keyboard[] key = new Keyboard[M];
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            key[i] = new Keyboard(Integer.parseInt(st.nextToken()),
                Integer.parseInt(st.nextToken()),
                st.nextToken());
        }

        Arrays.sort(key);

        for (Keyboard keyboard : key) {
            sb.append(keyboard.str);
        }

        System.out.println(sb.toString());
    }
}

class Keyboard implements Comparable<Keyboard> {

    int idx;
    int sec;
    String str;

    Keyboard(int idx, int sec, String str) {
        this.idx = idx;
        this.sec = sec;
        this.str = str;
    }

    @Override
    public int compareTo(Keyboard o) {
        if (o.sec == this.sec) {
            return this.idx - o.idx;
        }
        return this.sec - o.sec;
    }
}
