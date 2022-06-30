package javaalgo.implementation;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class boj10171 {
    public static void main(String[] args) throws IOException {
        long startTime = System.nanoTime();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        System.out.println("\\    /\\\n" +
//                " )  ( ')\n" +
//                "(  /  )\n" +
//                " \\(__)|");

        bw.write("\\    /\\\n" +
                " )  ( ')\n" +
                "(  /  )\n" +
                " \\(__)|");
        bw.flush();
        long endTime = System.nanoTime();
        System.out.println(endTime - startTime);
    }
}
