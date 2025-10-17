import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // int square = num * num;
        // System.out.println(square);
        


        int square = (int) Math.pow(num, 2);
        System.out.println(square);
        
    }
}
