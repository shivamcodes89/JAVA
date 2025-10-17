public class Percentage {
    public static void main(String[] args) {
        int total = 500;
        int math = 95;
        int science = 92;
        int hindi = 80;
        int Art = 85;
        int english = 75;
        float sum = math + science + hindi + Art + english;
        System.out.println("sum is: "+sum);

        float avg = (sum) / 5;
        System.out.println("avg is: "+avg);

        float per = ((sum/total)*100);
        System.out.println("percentage is: "+per);
        
    }
}
