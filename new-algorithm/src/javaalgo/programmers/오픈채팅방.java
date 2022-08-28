package javaalgo.programmers;

import java.util.*;

public class 오픈채팅방 {
    public static void main(String[] args) {
        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"};
        String[] result = {"Prodo님이 들어왔습니다.", "Ryan님이 들어왔습니다.", "Prodo님이 나갔습니다.", "Prodo님이 들어왔습니다."};

        System.out.println(Arrays.toString(solution(record)));
        System.out.println(Arrays.equals(result, solution(record)));
    }

    static String[] solution(String[] record) {
        List<String> result = new ArrayList<>();
        Map<String, String> map = new HashMap<>();

        for (String rec : record) {
            StringTokenizer st = new StringTokenizer(rec);

            String command = st.nextToken();
            String id = st.nextToken();
            String nickname = command.equals("Leave") ? "" : st.nextToken();

            switch (command) {
                case "Enter":
                    map.put(id, nickname);
                    result.add(id + "님이 들어왔습니다.");
                    break;
                case "Change":
                    map.put(id, nickname);
                    break;
                case "Leave":
                    result.add(id + "님이 나갔습니다.");
            }
        }

        String[] answer = new String[result.size()];

        int idx = 0;
        for (String log : result) {
            String id = log.substring(0, log.indexOf("님"));
            answer[idx++] = log.replace(id, map.get(id));
        }

        return answer;
    }
}
