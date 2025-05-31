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
        // output
        boolean isAscending = false;

        for(int i=0; i< Num.length-i; i++){
            if(Num[i]<Num[i+1]){
                isAscending = true;
            }
        }

        if(isAscending){
        System.out.print("is sorted in ascending order");
        }else{
        System.out.print("is not sorted in ascending order.");
        }
    }
}
