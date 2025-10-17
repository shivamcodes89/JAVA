import java.util.Scanner;
public class ArthimaticOpera {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter 1st number : ");
        float a = sc.nextFloat();
        System.out.print("enter 2nd number : ");
        int b = sc.nextInt();
        float sum = a + b;
        float diff = a - b;
        float multi = a * b;
        float divi = a / b;
        System.out.println("sum is: "+sum);
        System.out.println("diff is: "+diff);
        System.out.println("multi is: "+multi);
        System.out.println("divide is: "+divi);
    }
}
