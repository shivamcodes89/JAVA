public class Car {
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
