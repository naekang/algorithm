import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class boj1431 {

    static int N;
    static String[] arr;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        input();
        solve(arr);
        System.out.println(sb.toString());
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new String[N];

        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }
    }

    static void solve(String[] strArr) {
        Arrays.sort(strArr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() < o2.length()) {
                    return -1;
                } else if (o1.length() == o2.length()) {
                    if (sum(o1) == sum(o2)) {
                        return o1.compareTo(o2);
                    } else {
                        return Integer.compare(sum(o1), sum(o2));
                    }
                } else {
                    return 1;
                }
            }
        });

        for (int i = 0; i < N; i++) {
            sb.append(strArr[i]).append('\n');
        }
    }

    static int sum(String str) {
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                sum += str.charAt(i) - '0';
            }
        }
        return sum;
    }
}
