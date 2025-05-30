package JAVA.Exercise;

import java.util.Scanner;

public class prob8 {

    public static int Power(int n, int x){
        int num = 1;
        for(int i=1; i<=n; i++){
            num = num*x ;
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        System.out.print("Enter the power number: ");
        int n = sc.nextInt();

    System.out.println("The power of "+ x+ " Power of "+n+" = "+ Power(n,x));
    sc.close();
  }
}
