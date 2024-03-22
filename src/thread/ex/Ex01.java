package thread.ex;

import java.util.Random;

public class Ex01 {
    public static void main(String[] args) {

/*
        연습문제 : 경주 게임 시뮬레이션

        요구사항 :
        3대의 차량(스레드)이 경주를 합니다.
        각 차량은 출발 후 랜덤하게 0 ~ 1초 사이에 한 번씩 "차량 [번호]가 질주 중!" 메시지를 5번 출력한 후, 경주를 마칩니다.

        출력 예시 :
        차량 1이 질주 중!
        차량 2이 질주 중!
        차량 3이 질주 중!
        차량 1이 질주 중!
        차량 3이 질주 중!
        ...
        차량 3이 경주 마침!
        차량 1이 경주 마침!
        차량 2이 경주 마침!
*/

        Thread thread1 = new Thread(new MyCar("일"));
        Thread thread2 = new Thread(new MyCar("이"));
        Thread thread3 = new Thread(new MyCar("삼"));

        thread1.setName("일차");
        thread2.setName("이차");
        thread3.setName("삼차");

        thread1.start();
        thread2.start();
        thread3.start();
    }

    public static class MyCar implements Runnable {

        private String carName;

        public MyCar(String carName) {
            this.carName = carName;
        }

        @Override
        public void run() {

            System.out.println(carName + " 차량이 출발했습니다!");

            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(new Random().nextInt(1000, 2000));
                    System.out.println(String.format("[%s] %s 차량이 %dm 달렸습니다.", Thread.currentThread().getName(), carName, (i + 1) * 100));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            System.out.println(carName + " 차량이 결승선에 도달했습니다!");
        }
    }
}
