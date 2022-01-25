package Extends_.CarsGarage;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Bmw");
        Garage garage = new Garage();
        garage.park(car);
    }
}
