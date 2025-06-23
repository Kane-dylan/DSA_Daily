package JAVA.TUF;

import java.util.Scanner;

public class Prob1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int reversed = 0;

        while (n != 0) {
            int lastDigit = n % 10;
            // Check for overflow before multiplying by 10
            if (reversed > Integer.MAX_VALUE/10 || reversed < Integer.MIN_VALUE/10) {
                reversed = 0;
                break;
            }
            reversed = reversed * 10 + lastDigit;
            n = n / 10;
        }

        System.out.print("Reversed number: " + reversed);
    }
}