package JAVA.Array;
import java.util.*;

public class prob2_2d_Arr {
    public static void main (String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();


        int[][] Num= new int[rows][cols];

        // input
        System.out.println("Enter matrix elements:");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                Num[i][j]= sc.nextInt();
            }
        }

        System.out.println("The Spiral Order Matrix is : ");

        int row_start=0;
        int row_end=rows-1;
        int col_start=0;
        int col_end=cols-1;

        // output

        while(row_start <= row_end && col_start <= col_end){

            // Top row
            for(int i=col_start; i<= col_end; i++){
                System.out.print(Num[row_start][i]+" ");
            }
            row_start++;

            //Right col
            for(int j=row_start; j<= row_end; j++){
                System.out.print(Num[j][col_end]+" ");
            }
            col_end--;

            // Bottom row
            for(int i=col_end; i>= col_start; i--){
                System.out.print(Num[row_end][i]+" ");
            }
            row_end--;

            // Lest col
            for(int j=row_end; j>= row_start; j--){
                System.out.print(Num[j][col_start]+" ");
            }
            col_start++;

            System.out.println();
        }
    }
}
