package javaalgo.programmers.practice.level2;

public class Programmers02 {

    static int cnt = 0;

    public static void main(String[] args) {
        int[] numbers1 = {1, 1, 1, 1, 1};
        int target1 = 3;

        int[] numbers2 = {4, 1, 2, 1};
        int target2 = 4;


        System.out.println(solution(numbers1, target1));
        System.out.println(solution(numbers2, target2));
    }

    static int solution(int[] numbers, int target) {
        dfs(0, 0, numbers, target);

        return cnt;
    }

    static void dfs(int idx, int sum, int[] numbers, int target) {
        if (idx == numbers.length) {
            if (sum == target) {
                cnt++;
            }
        } else {
            dfs(idx + 1, sum - numbers[idx], numbers, target);
            dfs(idx + 1, sum + numbers[idx], numbers, target);
        }
    }
}
