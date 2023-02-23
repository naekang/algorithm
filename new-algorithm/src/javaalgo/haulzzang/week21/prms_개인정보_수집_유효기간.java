package javaalgo.haulzzang.week21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class prms_개인정보_수집_유효기간 {

    public static void main(String[] args) {
        String today = "2022.05.19";
        String[] terms = {"A 6", "B 12", "C 3"};
        String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};

        String today1 = "2020.01.01";
        String[] terms1 = {"Z 3", "D 5"};
        String[] privacies1 = {"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"};

        System.out.println(Arrays.toString(solution(today, terms, privacies)));
        System.out.println(Arrays.toString(solution(today1, terms1, privacies1)));
    }

    static int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> list = new ArrayList<>();

        Map<String, Integer> termMap = new HashMap<>();

        for (String term : terms) {
            StringTokenizer st = new StringTokenizer(term);

            termMap.put(st.nextToken(), Integer.parseInt(st.nextToken()));
        }

        String[] todayArr = today.split("\\.");
        int standard = Integer.parseInt(todayArr[0]) * 28 * 12 + Integer.parseInt(todayArr[1]) * 28 + Integer.parseInt(todayArr[2]);

        for (int i = 0; i < privacies.length; i++) {
            String privacy = privacies[i];
            StringTokenizer st = new StringTokenizer(privacy);

            String[] start = st.nextToken().split("\\.");
            String term = st.nextToken();

            int startTime = Integer.parseInt(start[0]) * 28 * 12 + Integer.parseInt(start[1]) * 28 + Integer.parseInt(start[2]) + termMap.get(term) * 28 - 1;

            if (startTime < standard) {
                list.add(i + 1);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
