package interface00.ex.ex05;

public class SiegeTank implements Attackable {

    final String name = "시저탱크";

    @Override
    public void attack() {
        System.out.println(name + "가 포를 쏩니다.");
    }
}
