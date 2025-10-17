import java.util.Scanner;

public class SquareRoot {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num = sc.nextFloat();
        double root = Math.sqrt(num);
        System.out.println(root);
    }
}