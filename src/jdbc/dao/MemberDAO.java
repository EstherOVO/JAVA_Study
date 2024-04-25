package jdbc.dao;

import java.util.List;

public interface MemberDAO {

//  회원과 관련된 DB 연산 정의
//  회원 정보를 가지고 있는 MemberDTO를 넘겨받아서
//  DB 테이블에 추가, 조회, 수정, 삭제 등을 진행

//  CRUD
    void insert(MemberDTO member);  // C (Create) 데이터 생성
    MemberDTO getMemberById(String id);  // R (Read) 아이디(식별자)로 조회
    void update(MemberDTO member);  // U (Update) 데이터 수정
    void delete(String id);  // D (Delete) 아이디(식별자)로 삭제
    List<MemberDTO> getAllMembers();
}
