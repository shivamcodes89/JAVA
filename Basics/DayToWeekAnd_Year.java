import java.util.Scanner;

public class DayToWeekAnd_Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        
        // // for week

        // int week = days / 7;
        // int day = days % 7;
        // System.out.println(week + " week, " + day + " day");

        int year = days / 365;
        int a = days % 365;
        int week = a / 7;
        int day = a % 7;
        System.out.println(year + " year, " + week + " week, " + day + " day.");
    }
}
