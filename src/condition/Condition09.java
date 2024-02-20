package condition;

public class Condition09 {
    public static void main(String[] args) {

//      break문 없이 switch문을 사용하게 될 경우 case문 이후 모든 case를 수행한다.

        int time = 8;

        switch (time) {
            case 8 :
                System.out.println("출근 시간입니다!");
            case 9 :
                System.out.println("입실 시간입니다!");
            case 10 :
                System.out.println("수업 시간입니다!");
            case 13 :
                System.out.println("점심 시간입니다!");
            default:
                System.out.println("(경) 퇴근 시간입니다! (축)");
        }

    }
}
