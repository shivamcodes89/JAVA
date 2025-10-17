import java.util.Scanner;

public class RectanglePerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter length: ");
        int len = sc.nextInt();
        System.out.print("enter breath: ");
        int bre = sc.nextInt();
        int perimeter = 2*(len + bre);
        System.out.println(perimeter);
    }
}
