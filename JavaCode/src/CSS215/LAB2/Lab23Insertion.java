package CSS215.LAB2;

public class Lab23Insertion {
    public static void main(String[] args) {
        int[] nums = {3,7,2,5,3,4,6,0,1};
        for(int i = 0; i < nums.length; i++){
            int key = nums[i];
            int j = i-1;
            while (j >= 0 && key < nums[j]){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = key;
        }


        for(int i: nums){
            System.out.println(i);
        }
    }
}
