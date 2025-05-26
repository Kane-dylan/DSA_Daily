package JAVA.Exercise;

import java.util.Scanner;

public class prob4 {
    public static float Circumference(int r){
        float circumference = (float) (2 * Math.PI * r);
        return circumference;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of a circle: ");
        float a = sc.nextFloat();

    System.out.println(Circumference((int) a));
    }
}