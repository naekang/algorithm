package javaalgo.programmers.practice.unrank;

import java.util.*;

public class Programmers03 {
    public static void main(String[] args) {
        int[] fees1 = {180, 5000, 10, 600};
        String[] records1 = {"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"};

        System.out.println(Arrays.toString(solution(fees1, records1)));

        int[] fees2 = {120, 0, 60, 591};
        String[] records2 = {"16:00 3961 IN","16:00 0202 IN","18:00 3961 OUT","18:00 0202 OUT","23:58 3961 IN"};

        System.out.println(Arrays.toString(solution(fees2, records2)));

        int[] fees3 = {1, 461, 1, 10};
        String[] records3 = {"00:00 1234 IN"};

        System.out.println(Arrays.toString(solution(fees3, records3)));
    }

    static int[] solution(int[] fees, String[] records) {
        int lastTime = calMinutes("23:59");

        Map<String, Integer> timeMap = new HashMap<>();
        Map<String, Integer> sumMap = new TreeMap<>();
        Map<String, Boolean> existMap = new HashMap<>();

        for (int i = 0; i < records.length; i++) {
            StringTokenizer st = new StringTokenizer(records[i]);

            String time = st.nextToken();
            String carNumber = st.nextToken();
            String type = st.nextToken();

            if (!timeMap.containsKey(carNumber)) {
                timeMap.put(carNumber, calMinutes(time));
                sumMap.put(carNumber, 0);
                existMap.put(carNumber, true);
            } else  {
                if (existMap.get(carNumber)) { // 들어와 있는 경우
                    existMap.replace(carNumber, true, false);

                    int originTime = timeMap.get(carNumber);
                    int newTime = calMinutes(time);
                    int originSum = sumMap.get(carNumber);
                    timeMap.replace(carNumber, originTime, newTime);
                    sumMap.replace(carNumber, originSum, originSum + (newTime - originTime));
                } else { // 존재는 하지만 나간 차
                    timeMap.replace(carNumber, timeMap.get(carNumber), calMinutes(time));
                    existMap.replace(carNumber, true);
                }
            }
        }

        for (Map.Entry<String, Boolean> entry : existMap.entrySet()) {
            if (entry.getValue()) {
                String key = entry.getKey();

                sumMap.replace(key, sumMap.get(key) + (lastTime - timeMap.get(key)));
            }
        }

        System.out.println(sumMap.toString());

        int[] answer = new int[sumMap.size()];

        int idx = 0;
        for (Integer value : sumMap.values()) {
            answer[idx++] = calParkFee(fees, value);
        }

        return answer;
    }

    static int calParkFee(int[] fees, int sum) {
        if (sum <= fees[0]) return fees[1];

        return fees[1] + ((int) Math.ceil(((double) sum - fees[0]) / (double) fees[2])) * fees[3];
    }

    static int calMinutes(String s) {
        StringTokenizer st = new StringTokenizer(s, ":");

        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());

        return hour * 60 + minute;
    }
}
