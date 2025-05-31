package JAVA.Array;

import java.util.Scanner;

public class prob3_2d_Arr {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the row of the array: ");
        int rows = sc.nextInt();
        System.out.print("Enter the col of the array: ");
        int cols = sc.nextInt();

        int[][] trans = new int[rows][cols];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i <rows ; i++) {
            for(int j = 0; j <cols ; j++) {
                trans[i][j]=sc.nextInt();
            }
        }

    // output
        System.out.println("The transpose is : ");

        for(int j = 0; j <cols ; j++) {
            for(int i = 0; i <rows ; i++) {
                System.out.print(trans[i][j]+" ");
            }
            System.out.println();
        }
  }
}
