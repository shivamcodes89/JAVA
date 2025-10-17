import java.util.Scanner;
public class ElementOfArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter array size: ");
        int num = sc.nextInt();
        int[] arr = new int[num];

        for(int i=0; i<arr.length; i++){
            System.out.println("enter element: ");
            int a = sc.nextInt();
            arr[i] = a;

        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        //// for negative element print
        System.out.println();
        for(int i=0; i<arr.length; i++){
            if(arr[i] < 0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}