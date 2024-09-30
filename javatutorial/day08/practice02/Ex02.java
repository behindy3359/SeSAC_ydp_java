package javatutorial.day08.practice02;

public class Ex02 {
    public static void main(String[] args) {
        int[] nums2 = {3, 2, 5, 7, 11};
        int target2 = 9;
        int[] result2 = findIndices(nums2, target2);
        System.out.println("[" + result2[0] + ", " + result2[1]+"]");
    }

    public static int[] findIndices(int[] array, int target){
        int[] result = new int[2];
        for(int i = 0 ; i < array.length ; i ++){
            for(int j = i ; j < array.length; j++){
                if(array[i] + array[j] == target ){
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }
}
