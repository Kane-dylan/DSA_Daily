package JAVA.Exercise;

import java.util.Scanner;

public class Prob12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the No of Element insert: ");
        int size = sc.nextInt();
        System.out.println("Enter the strings: ");
        String arr[] = new String[size];
        int toLength = 0;

        // input
        for(int i=0; i< size; i++){
            arr[i] = sc.next();
            toLength += arr[i].length();
        }
        System.out.println(toLength);
    }
}
