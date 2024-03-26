package io_stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class IOStream02 {
    public static void main(String[] args) {

        try {
            OutputStream outputStream = new FileOutputStream("src/io_stream/test02.txt");

            byte[] byteArray = {65, 66, 67};

//          배열의 모든 바이트를 출력
            outputStream.write(byteArray);

//          버퍼 비우기
            outputStream.flush();

//          메모리 해제
            outputStream.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
