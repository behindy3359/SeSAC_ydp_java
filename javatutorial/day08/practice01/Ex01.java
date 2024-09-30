package javatutorial.day08.practice01;

public class Ex01 {
    public static void main(String[] args) {
        int[] nums1 ={2,5,8,3,7};
        System.out.println( sumLessThan(nums1, 5));
    }

    public static int sumLessThan(int[] a, int b){
        int sum = 0;
        for(int i = 0 ; i < a.length ; i ++){
            if(a[i] < b){
                sum += a[i];
            }
        }
        return sum;
    }
}
