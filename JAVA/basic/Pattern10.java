package JAVA.basic;

public class Pattern10 {
    public static void main(String[] args){
        int a=5;

        for(int i=1; i<=a; i++){
            for(int j=1; j<=i; j++){
                System.out.print(" *");
            }
            int s= 2*(a-i);
            for(int j=1; j<=s; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(" *");
            }
            System.out.println("  ");
        }

        for(int i=a; i>0; i--){
            for(int j=1; j<=i; j++){
                System.out.print(" *");
            }
            int s= 2*(a-i);
            for(int j=1; j<=s; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(" *");
            }
            System.out.println("  ");
        }
    }
}
