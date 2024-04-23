package jdbc.board;

import java.util.Scanner;

// Step 2. 메인 메뉴 선택 기능 추가
public class BoardEx02 {

    Scanner scanner = new Scanner(System.in);

    public void list() {
        System.out.println("[게시물 목록]");
        System.out.println("-------------------------------------------------");
        System.out.println(String.format("%-6s%-12s%-16s%-40s", "No.", "Writer", "Date", "Title"));
        System.out.println("-------------------------------------------------");
        System.out.println(String.format("%-6s%-12s%-16s%-40s", "1", "winter", "2024-04-23", "안녕하세요~"));
        System.out.println(String.format("%-6s%-12s%-16s%-40s", "2", "winter", "2024-04-23", "반갑습니다~"));
        mainMenu();
    }

    public void mainMenu() {
        System.out.println("-------------------------------------------------");
        System.out.println("메인 메뉴 : 1. Create | 2. Read | 3. Clear | 4. Exit");
        System.out.print("메인 선택 : ");
        String menuNo = scanner.nextLine();

        switch (menuNo) {
            case "1" -> create();
            case "2" -> read();
            case "3" -> clear();
            case "4" -> exit();
        }
    }

    public void create() {
        System.out.println("BoardEx02.create");
        list();
    }

    public void read() {
        System.out.println("BoardEx02.read");
        list();
    }

    public void clear() {
        System.out.println("BoardEx02.clear");
        list();
    }

    public void exit() {
        System.exit(0); // 종료
    }

    public static void main(String[] args) {

        BoardEx02 boardEx = new BoardEx02();
        boardEx.list();
    }
}
