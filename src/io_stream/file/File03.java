package io_stream.file;

import java.nio.file.Path;
import java.nio.file.Paths;

public class File03 {
//  java.nio 패키지 : 기존 java.io 패키지보다 다양한 기능을 제공
//  Files 클래스 : 파일과 디렉터리에 대한 정적 메서드 제공
//  Paths 클래스 : 파일 시스템 경로를 인스턴스화 한 Path 객체를 생성, 경로 관련 메서드 제공

    public static void main(String[] args) {

//      폴더 경로 : 기본 상대 경로
        Path path = Paths.get("");
//      절대 경로로 변경
        Path absolutePath = path.toAbsolutePath();

        System.out.println("path = " + path);
        System.out.println("absolutePath = " + absolutePath);

//      여러 문자열을 결합하여 Path 경로 생성
//      인자로 들어온 문자열마다, 내부 폴더로 들어가는 Path 객체
        Path path1 = Paths.get("src", "io_stream", "file");
        Path absolutePath1 = path1.toAbsolutePath();

        System.out.println("path1 = " + path1);
        System.out.println("absolutePath1 = " + absolutePath1);

//      깊이 들어가는 상대 경로 생성
        Path path2 = Paths.get("sub", "deep", "more_deep");
        System.out.println("path2 = " + path2);

//      두 경로를 통합한 경로
        Path path3 = path1.resolve(path2);
        System.out.println("path3 = " + path3);

        Path path4 = Paths.get("text.txt");
        Path path5 = path3.resolve(path4);
        System.out.println("path5 = " + path5);

//      상위 경로
        Path path6 = path1.getParent();
        System.out.println("path6 = " + path6);

//      끝단 파일 이름
        Path fileName = path5.getFileName();
        System.out.println("fileName = " + fileName);
    }
}
