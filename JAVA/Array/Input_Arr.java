package JAVA.Array;

import java.util.*;

public class Input_Arr {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int size = sc.nextInt();

        int num[]= new int[size];
        // input
        for(int i = 0; i < size; i++) {
            num[i] = sc.nextInt();
        }
        // output
        for(int i=0; i<size; i++){
      System.out.print(num[i]+" ");
        }
    }
}
