package interface00.ex.ex05;

public class StarcraftSystem {

    public void attack(Attackable[] attackUnits) {
        for (Attackable unit : attackUnits) {
            unit.attack();
        }
    }

    public void move(Movable[] moveUnits) {
        for (Movable unit : moveUnits) {
            unit.move();
        }
    }
}
