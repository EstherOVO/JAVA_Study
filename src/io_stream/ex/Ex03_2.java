package io_stream.ex;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex03_2 {
    public static void main(String[] args) {

        try (Reader reader = new FileReader("src/io_stream/ex/chat2.log");
             Writer writer = new FileWriter("src/io_stream/ex/chatSummary2.txt")) {

            countFrequency(reader, writer);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void countFrequency(Reader reader, Writer writer) {

        try (BufferedReader br = new BufferedReader(reader);
             BufferedWriter bw = new BufferedWriter(writer)) {

            List<String> names = new ArrayList<>();

            while (true) {

                String str = br.readLine();
                if (str == null) break;

//////////////////////////////////////////////////////////////

                String[] split = str.split(" ");

                names.add(split[1]);
            }

            Map<String, Long> map = names.stream()
                    .collect(Collectors.groupingBy(name -> name, Collectors.counting()));

            for (Map.Entry<String, Long> entry : map.entrySet()) {
                bw.write(entry.getKey() + " : " + entry.getValue() + "번");
                bw.newLine();
            }

            bw.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
