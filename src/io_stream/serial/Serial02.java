package io_stream.serial;

import java.io.*;

public class Serial02 {
    public static void main(String[] args) {

        String filePath = "src/io_stream/serial/person.ser";

        try (FileInputStream fis = new FileInputStream(filePath);
             BufferedInputStream bis = new BufferedInputStream(fis);
             ObjectInputStream ois = new ObjectInputStream(bis);) {

            Person person = (Person) ois.readObject();

            System.out.println(person);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
