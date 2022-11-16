package javaalgo.programmers.practice.level2;

import java.util.LinkedList;

public class Programmers35 {

    public static void main(String[] args) {
        int cacheSize1 = 3;
        String[] cities1 = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul",
            "NewYork", "LA"};

        System.out.println(solution(cacheSize1, cities1));
    }

    static int solution(int cacheSize, String[] cities) {

        if (cacheSize == 0) return cities.length * 5;

        LinkedList<String> list = new LinkedList<>();

        int answer = 0;
        for (String str : cities) {
            String city = str.toUpperCase();

            if (list.remove(city)) {
                list.addFirst(city);
                answer += 1;
            } else {
                if (list.size() == cacheSize) {
                    list.pollLast();
                }

                list.addFirst(city);
                answer += 5;
            }
        }

        return answer;
    }

}
