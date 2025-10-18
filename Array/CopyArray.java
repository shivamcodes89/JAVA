import java.util.Scanner;

public class CopyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr1 = new int[a];
        int[] arr2 = new int[a];

        for(int i=0; i<arr1.length; i++){
            System.out.print("enter element: ");
            arr1[i] = sc.nextInt();
        }

        
        for(int i=0; i<arr1.length; i++){
            arr2[i] = arr1[i];
        }

        for(int i=0; i<arr1.length; i++){
            System.out.print(arr2[i] + " ");
        }

        
    }
}
