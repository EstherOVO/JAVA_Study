package thread;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ThreadSafety02 {
    public static void main(String[] args) throws InterruptedException {

//      스레드 안전하지 않은 경우
//      Map<String, Integer> map = new HashMap<>();

//      스레드 안전한 경우
//      1. Hashtable
//      Map<String, Integer> map = new Hashtable<>();

//      2. ConcurrentHashMap : 스레드 안전 + 성능 향상
//      Map<String, Integer> map = new ConcurrentHashMap<>();

//      3. 동기화 래퍼
        Map<String, Integer> map = Collections.synchronizedMap(new HashMap<>());

        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                map.put("key" + i, i);
            }
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        Thread thread3 = new Thread(task);

        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();

//      스레드가 안전하지 않을 경우 맵의 사이즈가 객체보다 더 계산됨(리스트는 덜 계산됨)
        System.out.println("맵의 사이즈는? " + map.size());
    }
}
