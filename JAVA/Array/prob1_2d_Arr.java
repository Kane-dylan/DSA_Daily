package JAVA.Array;
import java.util.*;

public class prob1_2d_Arr {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows no : ");
        int rows = sc.nextInt();
        System.out.print("Enter the cols no : ");
        int cols = sc.nextInt();

        int num[][]= new int[rows][cols];

        // input
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                num[i][j]=sc.nextInt();
            }
        }

        //find
        System.out.print("The number to find in the arr: ");
        int x = sc.nextInt();

        // output
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(num[i][j]==x){
                     System.out.print("The "+x+" is found in ("+i+", "+j+") location");
                }
            }
        }
    }
}
