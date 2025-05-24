package basic;

public class Pattern10 {
    public static void main(String[] args){
        int a=5;

        for(int i=0; i<a; i++){
            for(int j=0; j<i; j++){
                System.out.print(" *");
            }
            int s= 2*(a-i);
            for(int j=0; j<s; j++){
                System.out.print("  ");
            }
            for(int j=0; j<i; j++){
                System.out.print(" *");
            }
            System.out.println("  ");
        }

        for(int i=a; i>0; i--){
            for(int j=0; j<i; j++){
                System.out.print(" *");
            }
            int s= 2*(a-i);
            for(int j=0; j<s; j++){
                System.out.print("  ");
            }
            for(int j=0; j<i; j++){
                System.out.print(" *");
            }
            System.out.println("  ");
        }
    }
}
