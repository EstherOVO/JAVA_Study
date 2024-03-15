package collection.ex;

import java.util.LinkedList;
import java.util.Queue;

public class Ex04 {
    public static void main(String[] args) {

/*
        문제 : 인쇄 작업 대기열(Queue 활용)

        사무실 인쇄기에서 여러 사용자의 인쇄 요청을 순서대로 처리할 수 있도록 큐를 활용하는 프로그램을 작성하세요.
        사용자가 인쇄 요청을 할 때마다 해당 요청을 큐에 추가(offer)하고,
        인쇄기는 큐에서 대기 중인 요청을 순서대로 가져와(poll) 처리합니다.

        요구사항 :
        사용자의 인쇄 요청을 순서대로 큐에 추가합니다.
        큐가 비어있지 않은 동안, 인쇄 작업을 순서대로 처리하고, 처리된 작업을 큐에서 제거합니다.

        데이터 예시 :
        과제.hwp
        보고서.docx
        자료.pdf

        출력 예시 :
        과제.hwp 인쇄 중...
        보고서.docx 인쇄 중...
*/

        Queue<String> print = new LinkedList<>();

        System.out.println("=== 프린트 요청 ===");
        print.offer("과제.hwp");
        print.offer("보고서.docx");
        print.offer("자료.pdf");

        System.out.println("프린트 요청 : " + print);

        System.out.println("=== 프린트 현황 ===");
        String peek1 = print.peek();
        String poll1 = print.poll();
        String peek2 = print.peek();
        String poll2 = print.poll();
        String peek3 = print.peek();
        String poll3 = print.poll();
        String peek4 = print.peek();

        System.out.println("프린트 현황 : " + peek1 + " 인쇄 중...");
        System.out.println("프린트 현황 : " + peek2 + " 인쇄 중...");
        System.out.println("프린트 현황 : " + peek3 + " 인쇄 중...");
        System.out.println("프린트 현황 : " + (peek4 == null ? "프린트할 자료가 없습니다." : (peek4 + " 인쇄 중...")));
    }
}
