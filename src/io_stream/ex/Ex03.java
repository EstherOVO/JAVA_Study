package io_stream.ex;

import java.io.*;

public class Ex03 {
    public static void main(String[] args) {

        try {
            Reader reader = new FileReader("src/io_stream/ex/chat.log");

            Writer writer = new FileWriter("src/io_stream/ex/chatSummary.txt");

            analyzeTalking(reader, writer);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void analyzeTalking(Reader reader, Writer writer) {

        BufferedReader br = new BufferedReader(reader);
        BufferedWriter bw = new BufferedWriter(writer);

        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;

        try {

            while (true) {

                String string = br.readLine();

                if (string == null) break;

//////////////////////////////////////////////////////////////

                if (string.contains("박진수")) {
                    count1++;
                } else if (string.contains("길동씨")) {
                    count2++;
                } else if (string.contains("무대리")) {
                    count3++;
                } else if (string.contains("강감찬")) {
                    count4++;
                }
            }

            bw.write("박진수 : " + count1);
            bw.newLine();

            bw.write("길동씨 : " + count2);
            bw.newLine();

            bw.write("무대리 : " + count3);
            bw.newLine();

            bw.write("강감찬 : " + count4);

            br.close();
            bw.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
