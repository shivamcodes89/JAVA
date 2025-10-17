import java.util.Scanner;

public class Circle_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        float circumference = 2 * 3.14f * r;
        float area = 3.14f * r * r;

        System.out.println("Diameter is: "+ (2 * r));
        System.out.println("circumference is: " + circumference);
        System.out.println("area of a circle is: " + area);

    }
}
