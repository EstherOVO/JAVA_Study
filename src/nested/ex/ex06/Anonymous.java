package nested.ex.ex06;

public class Anonymous {

    Vehicle field = new Vehicle() {
        public void how() {
            System.out.println("천천히 달립니다.");
        }

        @Override
        public void drive() {
            System.out.println("자전거가 달립니다.");
            how();
        }
    };

    public void method1() {
        Vehicle vehicleLocal = new Vehicle() {
            public void how() {
                System.out.println("빠르게 달립니다.");
            }

            @Override
            public void drive() {
                System.out.println("승용차가 달립니다.");
                how();
            }
        };
        vehicleLocal.drive();
    }

    public void method2(Vehicle vehicle) {
        vehicle.drive();
    }
}
