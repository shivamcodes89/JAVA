import java.util.Scanner;

public class Cm_to_MeterAndKm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float cm = sc.nextFloat();

        float meter = (cm / 100);
        System.out.println(meter + " meter");

        float km = meter / 1000;
        System.out.println(km + " Km");
    }
}
