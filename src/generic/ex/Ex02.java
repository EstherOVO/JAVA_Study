package generic.ex;

public class Ex02 {

    public static <T> int findIndex(T[] array, T t) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(t)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        Integer[] intArray = {1, 2, 3, 4};
        String[] strArray = {"Hello", "World", "Generic", "Method"};

        int idx = findIndex(intArray, 3);
        System.out.println("intArray에서 3의 인덱스 : " + idx);

        int idx2 = findIndex(strArray, "Generic");
        System.out.println("stringArray에서 \"Generic\"의 인덱스 : " + idx2);
    }
}
