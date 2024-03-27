package io_stream.file;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
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

        System.out.println("==========");

//      Files
        Path currentPath = path1;
        Path newFilePath = currentPath.resolve("test.txt");

//      파일 생성
        try {
            Files.createFile(newFilePath);
        } catch (FileAlreadyExistsException e) {
//          파일이 존재할 경우 덮어쓰기 하는 대신 예외 발생
            System.out.println("파일이 이미 존재합니다.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//      파일 복사
        Path targetPath = currentPath.resolve("copyFile.txt");
        try {
            Files.copy(newFilePath, targetPath);
            System.out.println("파일을 성공적으로 복사했습니다.");
        } catch (FileAlreadyExistsException e) {
            System.out.println("파일이 이미 존재합니다.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//      파일 삭제
        try {
            Files.deleteIfExists(newFilePath);
            System.out.println("파일을 성공적으로 삭제했습니다.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//      디렉터리 생성
//      중간 경로가 없으면 함께 생성
        try {
            Files.createDirectories(currentPath.resolve(Paths.get("new", "sub", "deep")));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//      파일 이동
        try {
            Files.move(targetPath, currentPath.resolve(Paths.get("new", "copyFile.txt")));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
