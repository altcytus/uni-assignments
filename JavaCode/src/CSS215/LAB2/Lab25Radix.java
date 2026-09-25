package CSS215.LAB2;

public class Lab25Radix {
    static int[] counting_sort(int[] numbers, int part) {

        int[] frequency = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            frequency[(numbers[i]/part)%10]++;
        }
        for (int i = 1; i < frequency.length; i++) {
            frequency[i] = frequency[i - 1] + frequency[i];
        }
        int[] answer = new int[numbers.length];
        for (int i = numbers.length - 1; i >= 0; i--) {
            int digit = (numbers[i] / part) % 10;
            int index = --frequency[digit];
            answer[index] = numbers[i];
        }
        return answer;
    }
    public static void main(String[] args) {

        int[] numbers = {103,45,89,1,65,12,23,7};

        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        int k = 0;
        while(max!=0){
            max /= 10;
            k++;
        }
        int[] answer = new int[numbers.length];
        int part = 1;
        for(int i=0;i<k;i++){
            numbers=counting_sort(numbers, part);
            part *=10;
        }
        for(int j : numbers){
            System.out.println(j);
        }
        System.out.println(k);
    }
}
