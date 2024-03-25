package thread.ex;

public class Ex02 {
    public static void main(String[] args) {

/*
        연습문제 : 여행 준비

        문제 설명 :
        세 명의 친구가 함께 여행을 가기로 했습니다.
        각자의 짐을 싸는 데에는 다른 시간이 소요되며, 모두 짐을 싸야만 여행을 출발할 수 있습니다.
        친구 A는 2초, 친구 B는 3초, 친구 C는 5초가 걸립니다.
        각 친구가 짐을 다 싸면 "A의 짐 준비 완료!", "B의 짐 준비 완료!", "C의 짐 준비 완료!"와 같이 출력되어야 하며,
        모든 준비가 끝나면 "모두 준비 완료, 여행을 출발합니다!"라고 출력합니다.

        요구사항 :
        - 각 친구를 대표하는 스레드 3개를 만듭니다(FriendA, FriendB, FriendC).
        - 각 스레드는 친구가 짐을 싸는 데 걸리는 시간(대기 시간)을 시뮬레이션합니다.
        - 메인 스레드는 모든 친구의 준비가 완료될 때까지 기다렸다가 여행 출발 메시지를 출력해야 합니다.

        출력예시 :
        A의 짐 준비 완료!
        B의 짐 준비 완료!
        C의 짐 준비 완료!
        모두 준비 완료, 여행을 출발합니다!
*/


        Thread thread1 = new Thread(new MyTravel("A", 2000), "A 친구");
        Thread thread2= new Thread(new MyTravel("B", 3000), "B 친구");
        Thread thread3 = new Thread(new MyTravel("C", 5000), "C 친구");

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("모두 여행 준비 완료! 출발~");
    }

    public static class MyTravel implements Runnable {

        int seconds;
        String name;

        public MyTravel(String name, int seconds) {
            this.name = name;
            this.seconds = seconds;
        }

        @Override
        public void run() {

            System.out.println(String.format("[%s] %s 짐 싸는 중...", Thread.currentThread().getName(), name));

            try {
                Thread.sleep(seconds);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(name + " 준비 완료!");
        }
    }
}
