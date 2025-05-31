package JAVA.Array;

import java.util.Scanner;

public class prob3_Arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of arr: ");
        int size = sc.nextInt();

        // declear the arr
        int num[] = new int[size];

        // input
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }

        // Find the maximum & minimum number in an array of integers.
        // output
        int max = num[0];
        int min = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
            if(num[i]< min){
                min= num[i];
            }
        }
        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);
    }
}
