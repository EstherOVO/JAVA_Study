package access_modifier;

public class Access01 {
    public static void main(String[] args) {

/*
        접근제한자(access modifier)
        클래스 외부에서 메소드, 필드 등에 접근하는 것을 허용하거나 제한하는 제한자
        (접근 범위 넓음) public > protected > default > private (접근 범위 좁음)
 */

        Radio radio = new Radio();

//      radio.volume = 9; → 객체의 데이터에 직접 접근이 가능
//      private으로 변경 시 외부에서 데이터에 직접 접근이 불가

        radio.volumeUp();
        radio.volumeUp();
        radio.printVolume();
    }
}
