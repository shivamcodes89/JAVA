public class Car_Main {
    public static void main(String[] args) {
        Car car = new Car("LAND ROVER", "DEFENDER P400", 2025);

        car.setColor("blue");
        car.setSpeed(40);

        car.accelerate(1);

        System.out.println(car.getSpeed());
    }
}

class Car {
    private String color;
    private String brand;
    private String model;
    private int year;
    private int speed;

    public Car(String brand, String model, int year){
        this.brand = brand;
        this.model = model;
        this.year = year;

    }

    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }

    public String getBrand(){
        return brand;
    }

    public String getModel(){
        return model;
    }

    public int getYear(){
        return year;
    }

    public int getSpeed(){
        return speed;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    





    public void accelerate(int increment){
        speed += increment;
    }

    public void brake(int decrement){
        speed -= decrement;
        if(speed < 0){
            speed = 0;
        }
    }
}