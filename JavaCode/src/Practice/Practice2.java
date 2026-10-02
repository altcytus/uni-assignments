package Practice;

public class Practice2 {
    static int partition(int[] nums, int low, int high) {
        int i  = low-1;
        int pivot = nums[high];
        for(int j = low; j < high; j++) {
            if(pivot >= nums[j]) {
                i++;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        int temp = nums[i+1];
        nums[i+1] = pivot;
        nums[high] = temp;

        return i+1;
    }

    static void sort(int[] nums, int low, int high) {
        if(low < high) {
            int pivot_index = partition(nums, low, high);
            sort(nums, low, pivot_index-1);
            sort(nums, pivot_index+1, high);
        }else{
            return;
        }
    }

    public static void main(String[] args) {

        int[] nums = {9,52,1,0,6,3,7};
        sort(nums, 0, nums.length-1);
        for(int n:nums){
            System.out.print(n+" ");
        }
    }
}
