package JAVA.Exercise;

import java.util.Scanner;

public class prob5 {

    public static void Voter(int a){
        if(a>=18){
      System.out.println("Eligible to vote");
        } else {
      System.out.println("Not eligible to vote");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        Voter(a);
    }
}
