package reference;

public class Null03 {
    public static void main(String[] args) {

        DataWrapper dataWrapper = new DataWrapper();
        dataWrapper.data = new Data();  // 인스턴스 내부의 참조 필드를 초기화 생성

//      초기화하지 않은 필드에 접근 시 초기값(= 0 혹은 null)이 대입된다.
        System.out.println(dataWrapper.count);      // 0
        System.out.println(dataWrapper.data);       // 참조타입(Data) : null

//      컴파일러에서 작동하지 않지만, 런타임 단계에서 NPE가 발생한다.
        System.out.println(dataWrapper.data.value1);    // NullPointException
//      = System.out.println(null.value1);
    }
}
