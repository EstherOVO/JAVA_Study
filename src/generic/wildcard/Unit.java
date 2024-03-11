package generic.wildcard;

public class Unit {}

class Knight extends Unit {}

class HolyKnight extends Knight {}

class Horse<T extends Unit> {
    public T rider;

    public void setRider(T rider) {
        this.rider = rider;
    }
}
