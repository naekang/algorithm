import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class boj18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String[] input = br.readLine().split(" ");
        int[] nums = new int[N];

        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }

        int[] sortNums = nums.clone();
        Arrays.sort(sortNums);

        Map<Integer, Integer> map = new HashMap<>();
        int index = 0;
        for (int n : sortNums) {
            if (!map.containsKey(n)) {
                map.put(n, index++);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i : nums) {
            sb.append(map.get(i)).append(" ");
        }
        System.out.println(sb);
    }
}
