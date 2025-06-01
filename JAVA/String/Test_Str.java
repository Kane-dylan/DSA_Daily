package JAVA.String;

import java.util.Scanner;

public class Test_Str {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String FirstName = "John";
        String LastName = "Doe";
        String FullName = FirstName + LastName;

    System.out.println(FullName);

    for(int i = 0; i <FullName.length() ; i++) {
      System.out.println(FullName.charAt(i));
    }
  }
}
