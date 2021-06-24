package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int arr[] = new int[26];
        String words = br.readLine();

        for (int i = 0; i < words.length(); i++) {
            if ('A' <= words.charAt(i) && words.charAt(i) <= 'Z') {
                arr[words.charAt(i) - 'A']++;
            } else {
                arr[words.charAt(i) - 'a']++;
            }
        }

        int max = -1;
        char q = '?';

        for (int i = 0; i < 26; i++) {
            if (arr[i] > max) {
                max = arr[i];
                q = (char) (i + 65);
            } else if (arr[i] == max) {
                q = '?';
            }
        }

        System.out.println(q);
    }
}
