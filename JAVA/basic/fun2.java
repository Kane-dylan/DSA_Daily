package JAVA.basic;

import java.util.Scanner;

public class fun2 {

    public static int SumTwoNum(int a, int b) {
        //        int sum = a+b;
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st num");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd num");
        int b = sc.nextInt();

        int total = SumTwoNum(a, b);
        System.out.println(a + "+" + b + "=" + total);
    }
}
