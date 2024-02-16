package Reference;

public class Ref05 {
    public static void main(String[] args) {
        Data data = new Data();
        data.value1 = 100;
        System.out.println("1. 메소드 호출 전 : " + data.value1);     // 100
        multiply2(data);        // 메소드 호출 : 100이라는 값을 복사한 게 아니라 값(참조값)을 복사해서 대입
        System.out.println("4. 메소드 호출 후 : " + data.value1);     // 100 (X) → 200 (O)
    }

    public static void multiply2(Data dataArg) {
        System.out.println("2. 메소드 내 값 변경 전 : " + dataArg.value1); // 100
        dataArg.value1 *= 2;   // 0x100.value
//      참조값을 복사해서 전달하여 data와 dataArg는 같은 참조값을 가지게 된다.
//      메모리 공간을 참조한 객체의 주소지가 같기 때문에 data.value, dataArg.value1은 같은 값을 가지게 된다.
        System.out.println("3. 메소드 내 값 변경 후 : " + dataArg.value1); // 200
    }
}
