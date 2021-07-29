public class boj4673 {

    static boolean[] check = new boolean[10001];
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        for (int i = 1; i < 10001; i++) {
            int num = d(i);

            if (num < 10001) {
                check[num] = true;
            }

            if (!check[i]) {
                sb.append(i).append('\n');
            }
        }
        System.out.println(sb);
    }

    static int d(int i) {
        int sum = i;

        while (i != 0) {
            sum += i % 10;
            i /= 10;
        }
        return sum;
    }
}
