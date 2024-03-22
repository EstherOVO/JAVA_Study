package thread;

public class Thread08 {
    public static class SafeStopClass extends Thread {
//      플래그를 사용한 종료 방법
        boolean exit = false;

        @Override
        public void run() {

            while (!exit) {
//              스레드의 작업
                System.out.println("스레드 실행 중...");
                try {
                    Thread.sleep(1000);     // 1초 대기
                } catch (InterruptedException e) {
//                  e.printStackTrace();    에러 메시지 출력
                    System.out.println("인터럽트가 발생했습니다.");
//                  인터럽트 발생 시 종료하고 싶을 때
//                  exit = true;
//                  return;
                }
            }

            System.out.println("스레드가 종료되었습니다.");
        }

        public void stopThread() {

            exit = true;
        }
    }

    public static void main(String[] args) throws InterruptedException {

        SafeStopClass thread = new SafeStopClass();
        thread.start();
        Thread.sleep(1000);
        thread.interrupt();     // 인터럽트 발생
        Thread.sleep(3000); // 메인 스레드 3초 대기
        thread.stopThread();    // 플래그를 통한 종료
    }
}
