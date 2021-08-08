import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class boj1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        String[] nameArr = new String[N + 1];
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < N+1; i++) {
            String name = br.readLine();
            map.put(name, i);
            nameArr[i] = name;
        }

        while (M-- > 0) {
            String str = br.readLine();
            if (isNum(str)) {
                int index = Integer.parseInt(str);
                sb.append(nameArr[index]);
            } else {
                sb.append(map.get(str));
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

    static boolean isNum(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
