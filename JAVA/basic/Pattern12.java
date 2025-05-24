package JAVA.basic;

public class Pattern12 {
    public static void main(String[] args){
        int a=5;

        for(int i=1; i<=a; i++){
            // space
            for(int j=1; j<=a-i; j++){
        System.out.print(" ");
            }
            // stars
            for(int j=1; j<=i; j++){
        System.out.print(i+" ");
            }
      System.out.println();
        }
    }
}
