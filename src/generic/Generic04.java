package generic;

public class Generic04 {
//  제네릭 메서드
//  메서드 내에서 타입 매개변수를 선언해서 다양한 타입에 유연하게 대응한다.

    static void printArray(String[] array) {
        for (String s : array) {
            System.out.println(s);
        }
    }

    static void printArray(Integer[] array) {
        for (Integer s : array) {
            System.out.println(s);
        }
    }

    static void printArray(Double[] array) {
        for (Double s : array) {
            System.out.println(s);
        }
    }

//  리턴 타입 앞에 타입 매개변수를 제네릭으로 선언하여 정의하면
//  메서드의 매개변수, 리턴타입, 메서드 내부 등에서 사용하는 타입으로 활용 가능하다.
    static <T> T[] genericPrintArray(T[] array) {
        for (T element : array) {   // 본문
            System.out.println(element);
        }
        return array;   // 리턴타입
    }

    public static void main(String[] args) {

        String[] strArray = {"Hello", "Generic", "Java", "Kotlin"};
        printArray(strArray);

        Integer[] intArray = {10, 20, 30, 40, 50};
        printArray(intArray);

        Double[] doubleArray = {10.0, 20.0, 30.0, 40.0, 50.0};
        printArray(doubleArray);

//      제네릭을 통해 구현 → 매개변수로 유연한 타입이 가능
        genericPrintArray(strArray);
        genericPrintArray(intArray);
        genericPrintArray(doubleArray);

        Boolean[] booleanArray = {true, false, true};

        genericPrintArray(booleanArray);
    }
}
