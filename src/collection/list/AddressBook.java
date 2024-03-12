package collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

// 주소록 관리
public class AddressBook {

//  Composition : 필드로 데이터(Friends 클래스 리스트)를 가짐
    private List<Friends> friendsList = new ArrayList<>();

//  삽입
    public void addFriend() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("= 추가하고자 하는 친구의 정보를 입력하세요 =");
        System.out.print("이름 : ");
        String name = scanner.nextLine();

        System.out.print("이메일 : ");
        String email = scanner.nextLine();

        System.out.print("전화번호 : ");
        String phoneNumber = scanner.nextLine();

        friendsList.add(new Friends(name, email, phoneNumber));
        System.out.println("주소록에 추가되었습니다!");
    }

    //  삭제
    public void deleteFriend() {

    }

    //  조회
    public void searchFriend() {

    }

    //  출력
    public void printAllFriend() {
        System.out.println(friendsList.toString());
    }



    public static void main(String[] args) {

        AddressBook addressBook = new AddressBook();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("""
                    1. 친구 추가
                    2. 친구 삭제
                    3. 친구 검색
                    4. 주소록 출력
                    5. 종료
                    선택 >
                    """);

            int selectNumber = scanner.nextInt();

            switch (selectNumber) {
                case 1 :
                    addressBook.addFriend();
                    break;
                case 2 :
                    addressBook.deleteFriend();
                    break;
                case 3 :
                    break;
                case 4 :
                    break;
                case 5 :
                    System.out.println("종료합니다. 이용해 주셔서 감사드립니다.");
                    break;
                default :
                    System.out.println("잘못된 입력입니다. 다시 시도해 주시기를 바랍니다.");
            }
        }
    }
}
