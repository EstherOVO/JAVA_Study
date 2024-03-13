package collection.set.ex.ex05;

import java.util.Objects;

public class Character {

    private String id;
    private String name;

    public Character(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "Character ID : " + id + " | Character Name : " + name;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (obj == null || getClass() != obj.getClass()) return false;

        Character character = (Character) obj;
        return Objects.equals(id, character.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
