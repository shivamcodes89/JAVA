import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter array size: ");
        int num = sc.nextInt();
        int[] arr = new int[num];
        int sum = 0;

        for(int i=0; i<arr.length; i++){
            System.out.println("enter element: ");
            int a = sc.nextInt();
            arr[i] = a;

        }

        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println("sum of array: " + sum);
        
    }   

}
