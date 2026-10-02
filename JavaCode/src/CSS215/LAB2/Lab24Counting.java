package CSS215.LAB2;

public class Lab24Counting {
    public static void main(String[] args) {

        int[] numbers = {9,3,10,3,4,2,5,2};
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }


        int[] frequency = new int[max + 1];
        for (int i = 0; i < numbers.length; i++) {
            frequency[numbers[i]]++;
        }
        for (int i = 1; i < frequency.length; i++) {
            frequency[i] = frequency[i - 1] + frequency[i];
        }

        int[] answer = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            int index =--frequency[numbers[i]];
            answer[index] =  numbers[i];
        }
        for (int i = 0; i <answer.length; i++) {
            System.out.println(answer[i]);
        }

    }
}
