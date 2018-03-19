/* 371. Sum of Two Integers
Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.

Example:
Given a = 1 and b = 2, return 3.

Credits:
Special thanks to @fujiaozhu for adding this problem and creating all test cases.
*/
import java.util.Arrays; //support Array
public class Move_Zeros_LeetCode{
    
    // From discuss User:lid004
    public static int getSum(int a, int b) {
        if(b == 0){
            return a;
        }
        int sum, carry;
        sum = a^b;
        carry = (a&b)<<1;
        return getSum(sum,carry);
    }
    
     public static void main(String []args){
        int [] nums =  {0, 1, 0, 3, 12};
        int j = 0;
        System.out.println("Before move:" + Arrays.toString(nums));
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                int temp = nums[j];
                nums[j++] = nums[i];
                nums[i] = temp;
            }
        }
        System.out.println("After move:" + Arrays.toString(nums));
     }
}
