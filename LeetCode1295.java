// Author : Samridhi Gupta
// Date   : 08/01/2025
// 1295. Find Even Numbers of Digits

import java.util.Scanner;
class LeetCode1295 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] nums = new int[5];
        for(int i = 0; i < 5; i++){
            nums[i] = scan.nextInt();
        }
        System.out.println(findNumbers(nums));
    }
     public static int findNumbers(int[] nums) {
        int count = 0;
       for (int num : nums) {
           if(String.valueOf(num).length() % 2 == 0){
               count++;
           }
       }
       return count;
    }
}