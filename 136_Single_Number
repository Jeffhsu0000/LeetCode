/* 136. Single Number
Given an array of integers, every element appears twice except for one. Find that
single one.

Note:
Your algorithm should have a linear runtime complexity. Could you implement it
without using extra memory?
*/

public class Single_Number_LeetCode{
   
    //2ms
    public static int singleNumber(int[] nums) {
        if(nums.length == 1) return nums[0];
        for(int i = 1; i < nums.length; i++) {
            nums[0] ^= nums[i];
        }
        return nums[0];
    }

     public static void main(String []args){
        int [] nums = {1, 5, 5, 1, 7};
        System.out.println(singleNumber(nums));
     }
}
