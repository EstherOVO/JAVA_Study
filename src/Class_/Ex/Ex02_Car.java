package Class_.Ex;

public class Ex02_Car {
    public static void main(String[] args) {

        Class02_Car car1 = new Class02_Car();
        car1.brand = "현대";
        car1.model = "소나타";
        car1.year = 2020;

        Class02_Car car2 = new Class02_Car();
        car2.brand = "벤츠";
        car2.model = "E클래스";
        car2.year = 2019;

        Class02_Car[] cars = new Class02_Car[2];
        cars[0] = car1;
        cars[1] = car2;

        System.out.println("=======================");
        for (int i = 0; i < cars.length; i++) {
            System.out.println("브랜드 : " + cars[i].brand + "\n모델 : " + cars[i].model + "\n출시년도 : " + cars[i].year);
            System.out.println("=======================");
        }
    }
}
