import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("enter temperature in Fahrenheit: ");
        // float temp1 = sc.nextFloat();
        // float temp2 = (temp1 - 32) * (5f/9);
        // System.out.println(temp2);


        System.out.println("enter temperature in celsius: ");
        float temp1 = sc.nextFloat();
        float temp2 = ((9/5f) * temp1) + 32;
        System.out.println(temp2);
    }
}
