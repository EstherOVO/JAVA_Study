package access_modifier.ex;

public class MaxCounter {

    private int count;
    private int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment() {
        count++;
        if (count > max) {
            System.out.println("최대값을 초과할 수 없습니다.");
        } else {
            System.out.println(count);
        }
    }

    public int getCount() {
        return count;
    }
}
