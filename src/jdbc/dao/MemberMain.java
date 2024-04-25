package jdbc.dao;

import java.util.Scanner;

public class MemberMain {

    private static Scanner scanner = new Scanner(System.in);

//  메인 실행 계층에서는 데이터 접근과 관련된 모든 코드를 DAO에게 위임
    public static void main(String[] args) {

//      데이터베이스 접근 객체 생성
        MemberDAO memberDAO = new MemberDAOImpl();

        System.out.print("1. Insert | 2. Select | 3. Update | 4. Delete > ");
        String menu = scanner.nextLine();

        switch (menu) {
            case "1" -> insert(memberDAO);
            case "2" -> select(memberDAO);
            case "3" -> update(memberDAO);
            case "4" -> delete(memberDAO);
        }
    }

    private static void insert(MemberDAO memberDAO) {

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

    private static void select(MemberDAO memberDAO) {

        System.out.println("[회원 조회]");
        System.out.print("ID : ");
        String id = scanner.nextLine();

        MemberDTO member = memberDAO.getMemberById(id);

        System.out.println("ID : " + member.getId());
        System.out.println("Name : " + member.getName());
        System.out.println("Email : " + member.getEmail());
    }

    private static void update(MemberDAO memberDAO) {

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

    private static void delete(MemberDAO memberDAO) {

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
}
