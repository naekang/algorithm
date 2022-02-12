import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj5635 {

    static int n;
    static Elem[] B;
    static StringBuilder sb = new StringBuilder();

    static class Elem implements Comparable<Elem> {

        public String name;
        public int month;
        public int day;
        public int year;

        @Override
        public int compareTo(Elem other) {
            if (other.year != this.year) {
                return this.year - other.year;
            }
            if (this.month != other.month) {
                return this.month - other.month;
            }
            if (this.day != other.day) {
                return this.day - other.day;
            }
            return name.compareTo(other.name);
        }
    }


    public static void main(String[] args) throws IOException {
        input();
        pro();
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        B = new Elem[n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            B[i] = new Elem();

            B[i].name = st.nextToken();
            B[i].day = Integer.parseInt(st.nextToken());
            B[i].month = Integer.parseInt(st.nextToken());
            B[i].year = Integer.parseInt(st.nextToken());
        }
    }

    static void pro() {
        Arrays.sort(B);

        sb.append(B[n - 1].name).append('\n').append(B[0].name);

        System.out.println(sb.toString());
    }

}
