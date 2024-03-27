package io_stream.serial;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Serial02 {
    public static void main(String[] args) {

        String filePath = "src/io_stream/serial/person.ser";

        FileInputStream fis = new FileInputStream(filePath);
        BufferedInputStream bis = new BufferedInputStream(fis);
        ObjectInputStream ois = new ObjectInputStream(bis);
    }
}
