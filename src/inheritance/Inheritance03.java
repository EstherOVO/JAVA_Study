package inheritance;

public class Inheritance03 {
    public static void main(String[] args) {

//      수퍼 클래스
        CellPhone cellPhone = new CellPhone();
        String color = cellPhone.color;
        String model = cellPhone.model;
        cellPhone.bell();

//      서브 클래스 : 수퍼 클래스 + 추가 기능 + 추가 필드
        DmbCellPhone dmbCellPhone = new DmbCellPhone();
        String color1 = dmbCellPhone.color;
        int channel = dmbCellPhone.channel;
        dmbCellPhone.bell();
        dmbCellPhone.turnOnDmb();
    }
}
