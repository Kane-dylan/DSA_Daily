package JAVA.Exercise;

import java.util.Scanner;

public class prob3 {
    public static void GreatNum(int a, int b){
        if (a>b){
      System.out.println(a+" is the greater num.");
        }else if(a<b){
      System.out.println(b+" is the greater num.");
        }else {
      System.out.println(a+"&"+b+" are equal");
        }
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        GreatNum(a,b);
    }
}
