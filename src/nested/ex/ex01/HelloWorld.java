package nested.ex.ex01;

public class HelloWorld {

    Printable hw = new Printable() {
        @Override
        public void print() {
            System.out.println("Hello, World!");
        }
    };
}
