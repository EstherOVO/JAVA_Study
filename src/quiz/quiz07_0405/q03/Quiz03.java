package quiz.quiz07_0405.q03;

import java.util.Random;

public class Quiz03 {
    public static void main(String[] args) {

        Thread car1 = new Thread(new MyCar("넘버 원"));
        Thread car2 = new Thread(new MyCar("넘버 투"));
        Thread car3 = new Thread(new MyCar("넘버 쓰리"));

        car1.start();
        car2.start();
        car3.start();
    }

    public static class MyCar implements Runnable {

        String carName;

        public MyCar(String carName) {
            this.carName = carName;
        }

        @Override
        public void run() {

            System.out.println(carName + " 차량이 출발했습니다. =");

            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(new Random().nextInt(0, 1000));
                    System.out.println(String.format("%s 차량이 %dm를 달렸습니다.", carName, (i + 1) * 100));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            System.out.println(carName + " 차량이 결승선을 통과했습니다!");
        }
    }
}
