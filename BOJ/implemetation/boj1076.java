import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class boj1076 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, String> map = new HashMap<>();
        map.put("black", "0,1");
        map.put("brown", "1,10");
        map.put("red", "2,100");
        map.put("orange", "3,1000");
        map.put("yellow", "4,10000");
        map.put("green", "5,100000");
        map.put("blue", "6,1000000");
        map.put("violet", "7,10000000");
        map.put("grey", "8,100000000");
        map.put("white", "9,1000000000");

        String first = br.readLine();
        String second = br.readLine();
        String third = br.readLine();

        String[] getFirst = map.get(first).split(",");
        String[] getSecond = map.get(second).split(",");
        String[] getThird = map.get(third).split(",");

        System.out.println(Long.parseLong(getFirst[0] + getSecond[0]) * Long.parseLong(getThird[1]));

    }
}
