package javaalgo.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Person implements Comparable<Person> {
    int age;
    String name;

    @Override
    public int compareTo(Person other) {
        if (age != other.age) {
            return age - other.age;
        }
        return name.compareTo(name);
    }
}

public class boj10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        Person[] arr = new Person[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i] = new Person();
            arr[i].age = Integer.parseInt(st.nextToken());
            arr[i].name = st.nextToken();
        }

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i].age).append(" ").append(arr[i].name).append('\n');
        }

        System.out.println(sb);
    }
}
