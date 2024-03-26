package io_stream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class IOStream05 {
    public static void main(String[] args) {

//      Writer : 문자열 출력
        try {
            Writer writer = new FileWriter("src/io_stream/test03.txt");

//          Character 1개씩 출력
            writer.write('a');
            writer.write('b');

//          Character 배열을 출력
            char[] chars = {'c', 'd', 'e'};
            writer.write(chars);

//          문자열을 출력
            writer.write("fgh");

//          버퍼에 남아있는 문자를 출력하고 비움
            writer.flush();

//          출력 스트림 닫기
            writer.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
