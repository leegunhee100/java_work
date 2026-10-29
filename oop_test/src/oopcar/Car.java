package oopcar;

public class Car {
    String brand;
    String carName;
    String color;
    int speed;

    void speedUp() {
        if (speed >= 50) {
            System.out.println("최고속도에요");
        }else {
            speed = speed + 10;
        }
    }

    void speedDown() {
        speed = speed - 10;
    }
    int currentSpeed() {
        return speed;
    }

    void myCarInfo() {
        System.out.println(brand + "/" + carName + "/" + color);
    }

}
