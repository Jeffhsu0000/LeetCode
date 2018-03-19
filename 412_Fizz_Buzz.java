/* 412. Fizz Buzz
Write a program that outputs the string representation of numbers from 1 to n.

But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”. 
For numbers which are multiples of both three and five output “FizzBuzz”.

Example:
n = 15,
Return:
[
    "1",
    "2",
    "Fizz",
    "4",
    "Buzz",
    "Fizz",
    "7",
    "8",
    "Fizz",
    "Buzz",
    "11",
    "Fizz",
    "13",
    "14",
    "FizzBuzz"
]
*/

import java.util.*; //support list
public class Fizz_Buzz_LeetCode{
   
    //4ms
    public static List<String> fizzBuzz(int n){
        List<String> outlist= new ArrayList<>();
        for(int i = 1 ; i <= n ; i++)
        {
            if(i%15 == 0) outlist.add("FizzBuzz");
            else if(i%3 == 0) outlist.add("Fizz");
            else if(i%5 == 0) outlist.add("Buzz");
            else outlist.add(""+i);
        }
       
        return outlist;
    }

     public static void main(String []args){
        System.out.println(fizzbuzz(15));
     }
}
