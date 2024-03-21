package thread;

public class Thread05 {
    public static void main(String[] args) {

        Thread thread = new Thread(new TazanSong(5), "타잔송");

//      스레드에 이름 부여
        thread.setName("타잔송");
        thread.start();
    }
}
