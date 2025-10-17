import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[3][3];
        int row = a.length;
        int column = a[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                a[i][j] = sc.nextInt();
            }
            // System.out.println(a[i]);
        }

        // for (int i = 0; i < row; i++) {
        //     for (int j = 0; j < column; j++) {
        //         System.out.print(a[i][j] + " ");
        //     }
        // }




        // print matrix >>>>
        for(int i=0; i < row; i++){
        for(int j=0; j < column; j++){
        System.out.print(a[i][j]+" ");
        }
        System.out.println();
        }


        // sum of row >>>>>>
        System.out.println();
        for (int i = 0; i < row; i++) {
            int sum = 0;
            for (int j = 0; j < column; j++) {
                sum += a[i][j];
            }
            System.out.println("sum row " + sum);
        }



        // sum of column >>>>>
        System.out.println();
        for (int i = 0; i < column; i++) {
            int sum = 0;
            for (int j = 0; j < row; j++) {
                sum += a[j][i];
            }
            System.out.println("sum column " + sum);
        }

        

        // Transpose
        for(int i = 0; i < row; i++){
            for(int j=0; j < column; j++){
                System.out.print(a[j][i]+" ");
            }
            System.out.println();

        }

    }
}