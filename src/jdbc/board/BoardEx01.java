package jdbc.board;

// Step 1. 콘솔 게시판 구상
public class BoardEx01 {

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
    }
    public static void main(String[] args) {

        BoardEx01 boardEx = new BoardEx01();
        boardEx.list();
    }
}
