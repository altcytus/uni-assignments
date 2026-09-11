import java.util.*;

public class BonusPoint {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt(); //digit
    int k = input.nextInt(); //line
    int[] segment = {6,2,5,5,4,5,6,3,7,6};
    //           0 1 2 3 4 5 6 7 8 9
    if(n*2>k || n*7<k){
      System.out.println("NO SOLUTION");
      return;
    }
    k -=n*2;

    int orig = k;

    ArrayList<Integer> list1 = new ArrayList<>();
    ArrayList<Integer> list2 = new ArrayList<>();
    for(int i=0;i<n; i++){
      list1.add(1);
      list2.add(1);
    }



    //min
    for (int i = 0; i < n; i++) {
      int s = 0;
      if(i==0){
        s = 1;
      }
      for (int digit = s; digit <= 9; digit++) {
        int lineCost = segment[digit] - segment[1];
        int remainingK = k - lineCost;
        int remainingDigits = n - i - 1;
        if (remainingK >= 0 && remainingK <= remainingDigits * 5) {
          list1.set(i, digit);
          k = remainingK;
          break;
        }
      }
    }
    for (int digit : list1) {
      System.out.print(digit);
    }

    k = orig;
    //max
    for (int i = 0; i < n; i++) {
      for (int digit = 9; digit >= 0; digit--) {

        int linecost =segment[digit] - segment[1];
        int remainingK=k- linecost;
        int remainingDigits = n-(i+1);
        if (remainingK >= 0 && remainingK <= remainingDigits*5) {
          list2.set(i, digit);
          k = remainingK;
          break;
        }
      }
    }
    System.out.println();
    for (int digit : list2) {
      System.out.print(digit);
    }

        /*

         2 2 2 2 2 arraylist
         for() each digit:
         if k>4:
            2+4 2 2 2 2
         else:
            2+1 2 2 2 2


            max 9 8 7...
            min first 1 then 0 1 2...
        */
    // 2 5 5 4 5 6 3 7 6
    // 0 -> 6
    // 1 -> 2
    // 2 -> 5
    // 3 -> 5
    // 4 -> 4
    // 5 -> 5
    // 6 - > 6
    // 7 -> 3
    // 8 -> 7
    // 9 -> 6
    // min 2, max 7 lines
    // 0 == 9 == 6   6
    // 2 == 3 == 5   5
    // 4 , 1 , 7 , 8
    //  for (int i = 0; i < n; i++) {
    //            if(k >=4 && (segment[9] - segment[1] >= (n-(i+1)) * 2) && (segment[9] - segment[1]) <=(n-(i+1)) * 7) {
    //                list.set(i, 9);
    //                k -= segment[9] - segment[1];
    //                continue;
    //            }
    //            if (k>=1) {
    //                list.set(i, 7);
    //                k -= segment[7] - segment[1];
    //                continue;
    //            }
    //        }
  }
}
