/* 344. Reverse String
Write a function that takes a string as input and returns the string reversed.

Example:
Given s = "hello", return "olleh".
*/

import java.util.*; //support list
public class Merge_Two_Binary_LeetCode{
   
    //7ms
    public static String reverseString(String s){
        char[] word = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            char temp = word[left];
            word[left++] = word[right];
            word[right--] = temp;           
        }
        return new String(word);
    }

     public static void main(String []args){
        System.out.println(reverseString("hello"));
     }
}
