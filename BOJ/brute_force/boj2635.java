import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class boj2635 {

    static int N;
    static ArrayList<Integer> list = new ArrayList<>();
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        input();
        pro();
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
    }

    static void pro() {
        for (int i = N / 2; i <= N; i++) {
            ArrayList<Integer> tmpList = new ArrayList<>();
            tmpList.add(N);
            tmpList.add(i);

            while (true) {
                int num1 = tmpList.get(tmpList.size() - 2);
                int num2 = tmpList.get(tmpList.size() - 1);

                if (num1 - num2 < 0) break;
                else tmpList.add(num1 - num2);
            }

            if (tmpList.size() > list.size()) {
                list.clear();
                for (int j = 0; j < tmpList.size(); j++) {
                    list.add(tmpList.get(j));
                }
            }
        }

        sb.append(list.size()).append('\n');

        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i) + " ");
        }

        System.out.println(sb.toString());

    }

}
