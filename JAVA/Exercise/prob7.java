package JAVA.Exercise;

import java.util.Scanner;

public class prob7 {

    public static void NumClass(int[] arr){
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]>0){
                positiveCount++;
            }else if(arr[i]<0){
                negativeCount++;
            }else{
                zeroCount++;
            }
        }

        System.out.println("Total positive numbers are " + positiveCount);
        System.out.println("Total negative numbers are " + negativeCount);
        System.out.println("Total zeros are " + zeroCount);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        NumClass(arr);

        sc.close();
    }
}