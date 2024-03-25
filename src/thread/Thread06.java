package thread;

public class Thread06 {
//  스레드의 우선순위

    static class PrintThread extends Thread {

        public PrintThread(String name) {
            super(name);
        }

        @Override
        public void run() {
            for (int i = 0; i < 20; i++) {
                System.out.print(getName());
            }
        }
    }

    public static void main(String[] args) {


        Thread thread0 = new PrintThread("0");
        Thread thread1 = new PrintThread("1");
        Thread thread2 = new PrintThread("2");

//      우선순위 부여하기
//      스레드의 스케줄러가 스레드들 사이에서 실행 순서를 결정하는 데 사용되는 힌트
//      OS(운영체제)에 있는 스케줄링 정책에 따라 CPU의 자원을 할당받음
//      어느 정도 빈도의 영향을 가지게 됨
//      숫자가 클수록 높은 우선순위를 가짐 → 보장된 것은 아니라 OS에게 힌트만 줌(힌트는 무시당할 수 있음)
        thread0.setPriority(1);     // 최소 우선순위
        thread1.setPriority(5);     // 중간 우선순위
        thread2.setPriority(10);    // 최대 우선순위

        thread0.start();
        thread1.start();
        thread2.start();

/*
        주의사항
        - 프로그램의 행동을 예측 가능하게 만드는 데 사용해서는 안 된다.(우선순위는 무시당할 수 있기 때문)
        - 낮은 우선순위의 스레드가 실행 기회를 박탈당할 수 있으므로, 리소스 관리 필요에 따라 신중하게 사용되어야 한다.
*/

//      yield : 같은 우선순위인 경우 다른 스레드에 양보
//      OS의 스케줄러에 힌트만 주고 상황에 따라 다름
//      최종 결정은 OS의 스케줄러가 내리게 된다.

//      우선순위가 5인 새로운 스레드 n
        new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                System.out.print("n");
                Thread.yield();     // 우선순위가 같을 경우 양보
            }
        }).start();

//      우선순위가 5인 메인 스레드 m
        for (int i = 0; i < 20; i++) {
            System.out.print("m");
        }
    }
}
