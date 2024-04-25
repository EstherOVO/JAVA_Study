package jdbc.dao;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MemberMain {

    private static Scanner scanner = new Scanner(System.in);
    private static MemberDAO memberDAO;  // 데이터베이스 접근 객체 생성


//  메인 실행 계층에서는 데이터 접근과 관련된 모든 코드를 DAO에게 위임
    public static void main(String[] args) {

//      연결 객체 초기화
        memberDAO = new MemberDAOImpl(DatabaseUtil.getConnection());

        while (true) {

            System.out.print("1. Create | 2. Select | 3. Update | 4. Delete | 5. Select All | 6. Exit > ");
            String menu = scanner.nextLine();

            switch (menu) {
                case "1" -> insert();
                case "2" -> select();
                case "3" -> update();
                case "4" -> delete();
                case "5" -> list();
                case "6" -> {DatabaseUtil.close(); return;}
            }
        }
    }

    private static void insert() {

//      회원 가입
        System.out.println("[회원 생성]");
        System.out.print("ID : ");
        String id = scanner.nextLine();

        System.out.print("Name : ");
        String name = scanner.nextLine();

        System.out.print("Email : ");
        String email = scanner.nextLine();

//      DTO 객체 생성
        MemberDTO member = new MemberDTO(id, name, email);

//      데이터 접근은 DAO에게 위임
        memberDAO.insert(member);
    }

    private static void select() {

        System.out.println("[회원 조회]");
        System.out.print("ID : ");
        String id = scanner.nextLine();

        MemberDTO member = memberDAO.getMemberById(id);

        System.out.println("ID : " + member.getId());
        System.out.println("Name : " + member.getName());
        System.out.println("Email : " + member.getEmail());
    }

    private static void update() {

        System.out.println("[회원 조회]");
        System.out.print("ID : ");
        String id = scanner.nextLine();

        MemberDTO member = memberDAO.getMemberById(id);

        System.out.println("ID : " + member.getId());
        System.out.println("Name : " + member.getName());
        System.out.println("Email : " + member.getEmail());

        if (member != null) {

            System.out.println("[회원 정보 수정]");
            System.out.print("Name : ");
            String name = scanner.nextLine();
            if (!name.isEmpty()) member.setName(name);

            System.out.print("Email : ");
            String email = scanner.nextLine();
            if (!email.isEmpty()) member.setEmail(email);

            memberDAO.update(member);

            System.out.println("회원 정보가 변경되었습니다.");

        } else {
            System.out.println("존재하지 않는 회원입니다.");
        }
    }

    private static void delete() {

        System.out.println("[회원 삭제]");
        System.out.print("ID : ");
        String id = scanner.nextLine();

        MemberDTO member = memberDAO.getMemberById(id);

        if (member != null) {

            memberDAO.delete(id);
            System.out.println("회원 정보가 삭제되었습니다.");

        } else {
            System.out.println("존재하지 않는 회원입니다.");
        }
    }

    private static void list() {

        List<MemberDTO> memberList = memberDAO.getAllMembers();

        Iterator<MemberDTO> iter = memberList.iterator();

        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
