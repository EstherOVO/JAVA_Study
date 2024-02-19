package Class01.Ex;

public class Board_Ex04 {
    public static void main(String[] args) {

/*
        1. Board 클래스의 생성자가 다음과 같이 오버로딩 되어 있습니다.
           생성자마다 중복 코딩 된 부분이 있습니다.
           this()를 활용해서 중복 코드를 제거해 보세요 .
        2. main 메서드에서 Board 객체를 생성하는 네 가지 방법을 모두 사용해 보세요.
*/

        Board board1 = new Board("자바 꿀팁", "팁 공유");
        Board board2 = new Board("자바 꿀팁", "팁 공유", "김자바");
        Board board3 = new Board("자바 꿀팁", "팁 공유", "김자바", "2024년 02월 05일");
        Board board4 = new Board("자바 꿀팁", "팁 공유", "김자바", "2024년 02월 05일", 2042);

        Board[] boards = {board1, board2, board3, board4};
        for (Board b : boards) {
            System.out.println("제목 : " + b.title + " / 주제 : " + b.content + " / 작성자 : " + b.writer + " / 작성일 : " + b.date + " / 조회수 : " + b.hitCount);
        }
    }
}

