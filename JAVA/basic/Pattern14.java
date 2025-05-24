package JAVA.basic;

public class Pattern14 {
    public static void main(String[] args){
        int a=4;

        //1st half
        for(int i=1; i<=a; i++){
            //spaces
            for(int j=1; j<=a-i; j++){
        System.out.print("  ");
            }
            // nums
            for(int j=1; j<=(2*i)-1; j++){
        System.out.print(" *");
            }
      System.out.println();
        }

        // 2nd half
        for(int i=a; i>=1; i--){
            //spaces
            for(int j=1; j<=a-i; j++){
                System.out.print("  ");
            }
            // nums
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print(" *");
            }
            System.out.println();
        }

    }
}
