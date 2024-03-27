package io_stream.file;

import java.io.File;
import java.io.IOException;

public class File01 {
//  java.io 패키지 파일과 디렉터리 정보를 가지고 있는
//  File 클래스 Files 클래스를 제공

    public static void main(String[] args) throws IOException {

//      new File("경로");
//      절대 경로
        File directory = new File("C:\\TempDir");
//      해당 경로가 존재하지 않을 경우 IOException 발생
        File file1 = new File("C:\\TempDir\\file1.txt");

//      디렉터리 생성
        directory.mkdir();
//      파일 생성
        file1.createNewFile();

//      디렉터리 내부의 파일 배열 반환
        File[] files = directory.listFiles();

        for (File file : files) {
            System.out.println("파일명 : " + file.getName());
            System.out.println("절대 경로 : " + file.getAbsolutePath());
        }
    }
}
