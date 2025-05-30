package JAVA.Exercise;

import java.util.Scanner;

public class prob9 {
    public static int Divisor (int a, int b){
        while (b!= 0){
            int temp = b;
            b= a%b;
            a = temp;
        }
        return a ;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    System.out.print("Entre the 1st no: ");
    int a = sc.nextInt();
    System.out.print("Entre the 2nd no: ");
    int b = sc.nextInt();

    System.out.println("The GCD of "+a+" & "+b+" is :"+Divisor(a,b));
    }
}
