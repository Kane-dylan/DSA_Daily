package JAVA.Fun;

import java.util.*;

public class fun3 {

    public static int MultiplyNum(int a, int b) {
        int n = a * b;
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st num: ");
        int a = sc.nextInt();
        System.out.print("Enter the 2nd num: ");
        int b = sc.nextInt();

        int mult = MultiplyNum(a, b);
        System.out.println("The multiply of " + a + " &" + b + " :- " + mult);
    }
}
