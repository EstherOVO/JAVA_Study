package solid.isp.before;

// ISP 인터페이스 분리 원칙 미적용
// 단순한 출력 기능만 있는 프린터도 모든 기능 구현이 강제된다.

public class AdvancedPrinter implements MultiFunctionPrinter {

    @Override
    public void print() {
        System.out.println("프린트를 합니다.");
    }

    @Override
    public void scan() {
        System.out.println("스캔을 합니다.");
    }

    @Override
    public void fax() {
        System.out.println("팩스를 합니다.");
    }
}
