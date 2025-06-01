package JAVA.String;

import java.util.Scanner;

public class Str_compare {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        String name= "John";
        String name2 = "John";

        if(name.compareTo(name2)== 0){
            System.out.println("The strings are equal ");
        }else{
            System.out.println("The strings are not equal");
        }


        if(new String("John") == new String("John")){
            System.out.println("The strings are equal ");
        }else{
            System.out.println("The strings are not equal");
        }
    }
}
