package JAVA.basic;

public class Pattern7 {
  public static void main(String[] args) {
    int a = 5;

    //        for(int i=a; i>=1; i--){
    //            for(int j=1; j<=i; j++){
    //                System.out.print(j + " ");
    //            }
    //            System.out.println(" ");
    //        }

    for (int i = 1; i <= a; i++) {
      for (int j = 1; j <= a - i + 1; j++) {
        System.out.print(j + " ");
      }
      System.out.println(" ");
    }
  }
}
