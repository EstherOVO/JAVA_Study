package access_modifier.ex.ex;

import access_modifier.ex.MaxCounter;

public class MaxCounter_Ex04 {
    public static void main(String[] args) {

        MaxCounter counter = new MaxCounter(3);
        counter.increment();
        counter.increment();
        counter.increment();
        counter.increment();
    }
}
