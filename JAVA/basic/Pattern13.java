package JAVA.basic;

public class Pattern13 {
    public static void main(String[] args){
        int a=5;

        for(int i=1; i<=a; i++){
            //spaces
            for(int j=1; j<a-i; j++){
        System.out.print("  ");
            }
            //1st half no
            for(int j=i; j>=1; j--){
        System.out.print(j+" ");
            }
            //2nd half
            for(int j=2; j<=i; j++){
        System.out.print(j+" ");
            }
      System.out.println("  ");
        }
    }
}
