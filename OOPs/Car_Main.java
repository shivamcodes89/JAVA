public class Car_Main {
    public static void main(String[] args) {
        Car car = new Car();

        car.color = "Blue";
        car.speed = 40;
        car.brand = "LAND ROVER";
        car.model = "DEFENDER P400";
        car.year = 2025;

        car.accelerate(1);

        System.out.println(car.speed);
    }
}
