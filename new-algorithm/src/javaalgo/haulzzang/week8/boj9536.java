package javaalgo.haulzzang.week8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj9536 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {

            String[] crySound = br.readLine().split(" "); // 울음소리 배열

            String line;
            while ((line = br.readLine()) != null) {
                if (line.equals("what does the fox say?")) {
                    break;
                }

                String[] animalCry = line.split(" ");
                for (int j = 0; j < crySound.length; j++) {
                    if (crySound[j] != null && crySound[j].equals(animalCry[2])) {
                        crySound[j] = null;
                    }
                }
            }

            for (String s : crySound) {
                if (s != null) {
                    sb.append(s).append(" ");
                }
            }

            sb.append("\n");
        }

        System.out.println(sb.toString());
    }

}
