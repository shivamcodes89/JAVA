public class Test{
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.name = "Bob";
        cat.age = "5 Year";

        System.out.println(cat.age);
    }
}


class Animal {
    String name;
    String age;
}


class Cat extends Animal{
    String breed;

}