package javaalgo.haulzzang.week7;

import java.util.*;
import java.io.*;

public class boj6550 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String str;

        while((str = br.readLine()) != null) {
            st = new StringTokenizer(str);
            Queue<Character> q = new LinkedList<>();

            String s1 = st.nextToken();
            String s2 = st.nextToken();

            for (int i = 0; i < s1.length(); i++) {
                q.add(s1.charAt(i));
            }

            for (int i = 0; i < s2.length(); i++) {
                if(s2.charAt(i) == q.peek()) {
                    q.poll();
                    if(q.isEmpty()) {
                        System.out.println("Yes");
                        break;
                    }
                }
            }

            if(!q.isEmpty()) System.out.println("No");
        }
        br.close();
    }

}
