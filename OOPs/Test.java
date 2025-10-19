public class Test{
    public static void main(String[] args) {
        Animal dog = new Dog(); // polymorphism
        dog.makeSound();
    }
}


class Animal {
    public void makeSound(){
        System.out.println("Some Sound");
    }
}


class Cat extends Animal{
    public void makeSound(){
        System.out.println("Meow!");
    }
}

class Dog extends Animal{
    public void makeSound(){
        System.out.println("Woof!");
    }

}