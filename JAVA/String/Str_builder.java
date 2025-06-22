package JAVA.String;

public class Str_builder {
    public static void main(String[]args){
        StringBuilder sb= new StringBuilder("Tony");
        // string
        System.out.println(sb);
        // char at index 2
        System.out.println(sb.charAt(2));
        // set char at index 2
        sb.setCharAt(2,'m');
        System.out.println(sb);
        // insert at index 0
        sb.insert(0,"A");
        System.out.println(sb);
        // delete
        sb.delete(4,5);
        System.out.println(sb);
        // append
        sb.append('e');
    System.out.println(sb);
    }
}
