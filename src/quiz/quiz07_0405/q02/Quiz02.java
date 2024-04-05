package quiz.quiz07_0405.q02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Quiz02 {
    public static void main(String[] args) {

        List<CoffeeOrder> coffeeOrders = new ArrayList<>(Arrays.asList(
                new CoffeeOrder("에스프레소", 2),
                new CoffeeOrder("아메리카노", 3),
                new CoffeeOrder("카푸치노", 5),
                new CoffeeOrder("라떼", 4)
        ));

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        coffeeOrders.forEach(coffeeOrder -> {
            executorService.execute(() -> {

                System.out.println(String.format("[%s] %s 준비 시작~", Thread.currentThread().getName(), coffeeOrder.menu));

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                System.out.println(String.format("[%s] %s %d잔 준비 완료!", Thread.currentThread().getName(), coffeeOrder.menu, coffeeOrder.quantity));
            });
        });

        executorService.shutdown();
    }

    public static class CoffeeOrder {

        String menu;
        int quantity;

        public CoffeeOrder(String menu, int quantity) {
            this.menu = menu;
            this.quantity = quantity;
        }
    }
}
