public class CompoundInterest {
    public static void main(String[] args) {
        int p = 6436;
        float t = 4.3f;
        float r = 9.9f;
        float num = 1 + (r / 100);
        double A = p * Math.pow(num, t);
        double CI = A - p;
        System.out.println(CI);
    }
    
}
