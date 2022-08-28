package javaalgo.programmers;

import java.util.*;

public class 신고_결과_받기 {
    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        int k = 2;

        System.out.println(Arrays.toString(solution(id_list, report, k)));
    }

    static int[] solution(String[] id_list, String[] report, int k) {
        Map<String, HashSet<String>> map = new HashMap<>();
        Map<String, Integer> idxMap = new HashMap<>();

        for (int i = 0; i < id_list.length; i++) {
            map.put(id_list[i], new HashSet<>());
            idxMap.put(id_list[i], i);
        }

        for (String s : report) {
            StringTokenizer st = new StringTokenizer(s);

            String from = st.nextToken();
            String to = st.nextToken();

            map.get(to).add(from);
        }

        int[] result = new int[id_list.length];

        for (String value : id_list) {
            Set<String> send = map.get(value);

            if (send.size() >= k) {
                for (String s : send) {
                    result[idxMap.get(s)]++;
                }
            }
        }

        return result;
    }
}
