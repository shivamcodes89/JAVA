import java.util.Scanner;

public class NegativeInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        for(int i=0; i<arr.length; i++){
            System.out.print("enter element: ");
            arr[i] = sc.nextInt();
        }
        int NegativeInArray = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] < 0){
                NegativeInArray++;
            }
        }
        System.out.println(NegativeInArray);
    }
}
