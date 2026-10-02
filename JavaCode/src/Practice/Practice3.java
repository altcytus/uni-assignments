package Practice;

import java.util.*;

public class Practice3 {
    static void merge(int[] numbers, int low, int high){
        int middle=low+(high-low)/2;
        int left_length=middle-low+1;
        int right_length=high-middle;
        int[] left_arr=new int[left_length];
        int[] right_arr=new int[right_length];
        for(int i=0; i<left_length; i++){
            left_arr[i]=numbers[i+low];
        }

        for(int i=0; i<right_length; i++){
            right_arr[i]=numbers[i+middle+1];
        }

        int i=0, j=0, k=low;
        while(i<left_length && j<right_length){
            if(left_arr[i]<right_arr[j]){
                numbers[k]=left_arr[i];
                i++;
                k++;
            }
            else{
                numbers[k]=right_arr[j];
                j++;
                k++;
            }
        }

        while(i<left_length){
            numbers[k]=left_arr[i];
            k++;
            i++;
        }

        while(j<right_length){
            numbers[k]=right_arr[j];
            k++;
            j++;
        }

    }

    static void merge_sort(int[] numbers, int low, int high){
        if(low<high){
            int middle=low+(high-low)/2;
            merge_sort(numbers,low, middle);
            merge_sort(numbers,middle+1,high);
            merge(numbers, low, high);
        }
        else{
            return;
        }
    }
    public static void main(String[] args) {
        int[] numbers={9,3,7,4,5,1};
        merge_sort(numbers,0, numbers.length-1);

        for(int number:numbers)
            System.out.println(number);
    }
}