package solid.isp.after;

// ISP 적용
public class AdvancedPrinter implements Printer, Scanner, Fax {
    @Override
    public void fax() {
        System.out.println("팩스를 합니다.");
    }

    @Override
    public void print() {
        System.out.println("프린터를 합니다.");
    }

    @Override
    public void scan() {
        System.out.println("스캔을 합니다.");
    }
}
