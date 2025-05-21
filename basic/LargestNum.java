package basic;

public class LargestNum {
    public static void main(String[] args) {
        int arr [] = {56, 32, 34, 45, 86, 89, 18, 90};
        int max = arr[0];

        for (int num : arr) {
            if (num >  max){
                max = num;
            }
        }

        System.out.println(max);
    }
}
