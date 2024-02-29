package nested.ex.ex05;

public class Anonymous {

    Worker field = new Worker() {
        public void sleep() {
            System.out.println("잠을 잡니다.");
        }

        @Override
        public void work() {
            System.out.println("디자인을 합니다.");
            sleep();
        }
    };

    void method1() {
        Worker workerLocal = new Worker() {
            public void eat() {
                System.out.println("점심을 먹습니다.");
            }

            @Override
            public void work() {
                System.out.println("개발을 합니다.");
                eat();
            }
        };
        workerLocal.work();
    }

    void method2(Worker worker) {
        worker.work();
    }

}
