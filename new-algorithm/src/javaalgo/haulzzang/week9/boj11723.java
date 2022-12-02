package javaalgo.haulzzang.week9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class boj11723 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int M = Integer.parseInt(br.readLine());

        Set<Integer> set = new HashSet<>();
        while (M-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String cmd = st.nextToken();
            switch (cmd) {
                case "add":
                    set.add(Integer.parseInt(st.nextToken()));
                    break;
                case "check":
                    sb.append(set.contains(Integer.parseInt(st.nextToken())) ? 1 : 0).append('\n');
                    break;
                case "remove":
                    set.remove(Integer.parseInt(st.nextToken()));
                    break;
                case "toggle":
                    int num = Integer.parseInt(st.nextToken());
                    if (set.contains(num)) {
                        set.remove(num);
                    } else {
                        set.add(num);
                    }
                    break;
                case "all":
                    set = new HashSet<>();
                    for (int i = 1; i <= 20; i++) {
                        set.add(i);
                    }
                    break;
                case "empty":
                    set = new HashSet<>();
                    break;
            }

        }
        System.out.println(sb.toString());
    }

}
