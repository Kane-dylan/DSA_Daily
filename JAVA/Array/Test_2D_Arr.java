package JAVA.Array;
import java.util.*;

public class Test_2D_Arr {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row-size of the array: ");
        int row = sc.nextInt();
        System.out.print("Enter the col-size of the array: ");
        int col = sc.nextInt();

        int [][] num = new int[row][col];

        //input
        for(int i= 0; i<row; i++){
            for(int j= 0; j< col; j++){
                num[i][j]= sc.nextInt();
            }
        }

        //output
        for(int i= 0; i< row; i++){
            for(int j= 0; j< col; j++){
                System.out.print(num[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
