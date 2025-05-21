package basic;

import java.util.*;

public class SwitchExample { // Changed class name
  public static void main(String[] args) {
    System.out.println("Press 1 for Hi");
    Scanner sc = new Scanner(System.in);
    int button = sc.nextInt();
 
    switch (button) {
      case 1:
        System.out.println("Hi");
        break;
      case 2:
        System.out.println("Namaste");
        break;
      case 3:
        System.out.println("Bonjour");
        break;
      default:
        System.out.println("You are pressing the wrong button! Try again.");
        break;
    }

    sc.close();
  }
}
