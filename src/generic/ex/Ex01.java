package generic.ex;

import library.lang.Key;

import java.util.Collection;

public class Ex01 {

    public static class Pair<K, V> {
        K key;
        V value;

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }
    public static void main(String[] args) {

        Pair <Integer, String> pair1 = new Pair<>();
        pair1.key = 1;
        pair1.value = "Apple";
        System.out.println("pair1 = " + pair1.getKey() + " - " + pair1.getValue() );

        Pair <String, Boolean> pair2 = new Pair<>();
        pair2.key = "KeyExists";
        pair2.value = true;
        System.out.println("pair2 = " + pair2.getKey() + " - " + pair2.getValue() );
    }
}
