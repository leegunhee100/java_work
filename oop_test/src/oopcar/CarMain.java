package oopcar;

public class CarMain {
    static void main(String[] args) {
        Car myCar = new Car();
        myCar.brand = "현대";
        myCar.carName = "소나타";
        myCar.color = "빨강색";
        myCar.myCarInfo();
        for (int i = 1; i <= 10; i++) {
            myCar.speedUp();
            System.out.println("현제속도는 : " + myCar.currentSpeed() + "입니다.");
        }
    }
}
