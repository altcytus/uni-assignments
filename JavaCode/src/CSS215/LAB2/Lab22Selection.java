package CSS215.LAB2;

public class Lab22Selection {
    public static void main(String[] args) {
        int[] nums = {3,7,2,5,3,4,6,0,1};


        for(int i = 0; i < nums.length-1; i++){
            int min = i;
            for(int j = i+1; j < nums.length; j++){
                if(nums[j] < nums[min]){
                    min = j;
                }
            }
            int temp = nums[min];
            nums[min] = nums[i];
            nums[i] = temp;
        }
        for(int i : nums){
            System.out.println(i);
        }
    }
}
