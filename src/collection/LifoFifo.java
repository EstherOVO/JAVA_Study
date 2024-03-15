package collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class LifoFifo {
    public static void main(String[] args) {

//      LIFO : 후입선출 Last In First Out → Stack
//      FIFO : 선입선출 First In First Out → Queue
/*
        1. Stack
        마지막에 추가된 요소가 먼저 제거됨
        push : 스택에 마지막 요소를 추가
        pop : 스택에서 마지막 요소를 꺼냄(제거 + 반환)
        peek : 스택에서 마지막 요소를 반환

        택시의 동전 케이스, 웹 브라우저 방문 기록, 함수 호출의 콜 스택, DFS(깊이우선탐색)

        Java에서 Stack 클래스는 컬렉션 프레임워크와 일관성이 떨어지는 문제로 사용하지 않는다.
        → 모던 자바에서는 ArrayDeque를 사용한다.
*/

        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("stack = " + stack);

        Integer popNumber = stack.pop();
        System.out.println("popNumber = " + popNumber);

        System.out.println("stack = " + stack);

//      peek() : 가장 마지막 요소 확인(반환)하고 제거는 하지 않는다.
        Integer peekNumber = stack.peek();
        System.out.println("peek = " + peekNumber);

        System.out.println("stack = " + stack);

/*
        2. Queue(대기열)
        가장 먼저 추가된 요소가 가장 먼저 제거
        offer : 큐의 끝에 요소를 추가
        poll : 큐의 시작 부분 요소를 제거하고 반환
        peek : 큐의 시작 부분 요소를 확인하고 제거하지 않음

        인쇄 작업 대기열, 웹 서버의 요청 처리 대기, BFS(너비우선간격)
        Queue 인터페이스 구현 객체 : LinkedList, ArrayDeque
*/

        Queue<String> queue = new LinkedList();

        queue.offer("1번 손님");
        queue.offer("2번 손님");
        queue.offer("3번 손님");

        System.out.println("queue = " + queue);

//      poll() : 가장 앞 요소 반환
        String pollGuest = queue.poll();
        System.out.println("pollGuest = " + pollGuest);

        System.out.println("queue = " + queue);

//      peek() : 가장 앞 요소 확인(반환)
        String peekGuest = queue.peek();
        System.out.println("peekGuest = " + peekGuest);

        System.out.println("queue = " + queue);
    }
}
