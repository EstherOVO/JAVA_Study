package library.lang.ex02;

import java.util.Objects;

public class Click {

    int x;
    int y;
    int timestamp;

    public Click(int x, int y, int timestamp) {
        this.x = x;
        this.y = y;
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;       // 참조값이 같은지 비교 → true

        if (obj == null) return false;      // null인 경우 → false

        if (getClass() != obj.getClass()) return false; // 타입이 다른 경우 → false

        return x == ((Click) obj).x && y == ((Click) obj).y;    // 다운캐스팅하여 해당 필드값 비교 → true or false
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
