package javaalgo.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Elem implements Comparable<Elem> {

    String str;
    int strLength;

    @Override
    public int compareTo(Elem o) {
        if (strLength != o.strLength) {
            return strLength - o.strLength;
        }
        return str.compareTo(o.str);
    }
}

public class boj1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        Elem[] arr = new Elem[N];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Elem();
            arr[i].str = br.readLine();
            arr[i].strLength = arr[i].str.length();
        }

        Arrays.sort(arr);

        LinkedHashSet<String> set = new LinkedHashSet<>();

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i].str);
        }

        for (String s : set) {
            sb.append(s).append('\n');
        }

        System.out.println(sb);
    }
}
