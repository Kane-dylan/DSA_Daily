package basic;
import java.util.*;

class Condition1 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();

      if (a == b) {
        System.out.println("'a' and 'b' is equal");
      } else {
        if (a < b) {
          System.out.println("'a' is less than 'b'");
        } else {
          System.out.println("'a' is greater than 'b'");
        }
      }
      sc.close();
    }
}