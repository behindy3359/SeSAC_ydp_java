package javatutorial.day08.practice03;

public class Ex03 {
    public static void main(String[] args) {
        int[] nums = {3,4,5,6,7,8,0,1,2};
        int target = 0;
        System.out.println(search(nums, target));
    }
    public static int search( int[] array, int target){
        for(int i = 0 ; i < array.length ; i ++ ){
            if(array[i] == target){
                return i;
            }
        }
        return -1;
    }
}
