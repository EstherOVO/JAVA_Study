package polymorphism.abstraction.ex.ex02;

public class TransportMain_Ex02 {
    public static void main(String[] args) {

        Transport[] transport = {new Car(), new Bicycle(), new Train()};

        for (Transport transportMove : transport) {
            transportMove.move();
        }
    }
}
