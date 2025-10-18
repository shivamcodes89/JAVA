import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of element: ");
        int a = sc.nextInt();

        int[] arr = new int[a];
        for(int i=0; i<arr.length; i++){
            System.out.print("enter array element: ");
            arr[i] = sc.nextInt();

        }
        int max = arr[0];
        int SecondLargest = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                SecondLargest = max;
                max = arr[i];
            }
            else if(SecondLargest < arr[i] && max > arr[i]){
                SecondLargest = arr[i];

            }
            

        }
        System.out.println("Second largest element is: " + SecondLargest);
        
        }
    
}
