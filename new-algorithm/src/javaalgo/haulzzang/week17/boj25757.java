package javaalgo.haulzzang.week17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class boj25757 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        String type = st.nextToken();
        Set<String> set = new HashSet<>();

        int cnt = 0;
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            cnt += (set.contains(str) ? 0 : 1);
            set.add(str);
        }

        System.out.println(cnt / peopleCount(type));
    }

    static int peopleCount(String type) {
        switch (type) {
            case "Y":
                return 1;
            case "F":
                return 2;
            case "O":
                return 3;
        }

        return -1;
    }
}
