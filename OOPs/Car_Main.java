public class Car_Main {
    public static void main(String[] args) {
        Car car = new Car("LAND ROVER", "DEFENDER P400", 2025);

        car.setColor("blue");
        car.setSpeed(40);

        car.accelerate(1);

        System.out.println(car.getSpeed());
    }
}
