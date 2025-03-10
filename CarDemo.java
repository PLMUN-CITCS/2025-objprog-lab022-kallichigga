class Car {
    String make;
    String model;
    int year;

    public void displayInfo() {

        System.out.println("Car: " + year + " " + make + " " + model);
    }
}

public class CarDemo {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.year = 2020;
        myCar.model = "Corolla";
        myCar.make = "Toyota";

        myCar.displayInfo();


    }
}
