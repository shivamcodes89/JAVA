import java.util.Scanner;

public class MaxAndMin {
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

        //for maximun
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("max element of array: " + max);


        // for minimun
        int min = arr[0];
        for(int i=1; i<arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("max element of array: " + min);
    }
}
