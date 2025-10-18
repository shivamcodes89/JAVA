import java.util.Scanner;
public class EvenOddElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        for(int i=0; i<arr.length; i++){
            System.out.print("enter your element: ");
            arr[i] = sc.nextInt();
        }
        int even = 0;
        int odd = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                even++;

            }
            else{
                odd++;

            }
        }
        System.out.println("even is: " + even);
        System.out.println("odd is: " + odd);
    }
}
