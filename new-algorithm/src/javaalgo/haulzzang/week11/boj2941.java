package javaalgo.haulzzang.week11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj2941 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        String str = br.readLine();

        for (int i = 0; i < arr.length; i++) {
            if (str.contains(arr[i])) {
                str = str.replace(arr[i], " ");
            }
        }

        System.out.println(str.length());
    }
}
