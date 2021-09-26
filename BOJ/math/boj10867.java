import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class boj10867 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        Set<Integer> num = new HashSet<>();

        for (int i = 0; i < N; i++) {
            num.add(Integer.parseInt(st.nextToken()));
        }

        List list = new ArrayList(num);
        Collections.sort(list);

        System.out.println(list.toString().replace("[", "").replace(",", "").replace("]", ""));

    }
}
