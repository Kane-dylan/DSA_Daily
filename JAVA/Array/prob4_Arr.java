package JAVA.Array;
import java.util.*;

public class prob4_Arr {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array :");
        int size = sc.nextInt();

        int Num[]= new int[size];
        // input
        for(int i=0; i< Num.length; i++){
            Num[i]=sc.nextInt();
        }
    }
}
