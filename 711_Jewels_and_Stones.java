/* 711 Jewels and Stones LeetCode
You're given strings J representing the types of stones that are jewels
and S representing the stones you have. Each character in S is a type
of stone you have. You want to know how many of the stones you have are
also jewels.

The letters in J are guaranteed distinct, and all characters in J and
S are letters. Letters are case sensitive, so "a" is considered a
different type of stone from "A".

Example 1:
Input: J = "aA", S = "aAAbbbb"
Output: 3

Example 2:
Input: J = "z", S = "ZZ"
Output: 0

*/

import java.util.*; // Set Support
public class Jewels_and_Stones_LeetCode{
   
    // Instinctive way O(m+n) 17ms
    public static int solution1(String J, String S){
       int res=0;
        for(char ch: S.toCharArray())
        {
            if(J.indexOf(ch) > -1)  res++;
        }
        return res;
    }
   
    // From LeetCode discuss User:lee215 O(m+n) 20ms
    public static int solution2(String J, String S){
        int res = 0;
        Set setJ = new HashSet();
        for(char j: J.toCharArray()) setJ.add(j);
        for(char s: S.toCharArray()) if(setJ.contains(s)) res++;
        return res;
     }
    
     // From LeetCode discuss User:StefanPochmann O(m+n) 35ms
    public static int solution3(String J, String S){
        return S.replaceAll("[^" + J + "]", "").length();
    }

     public static void main(String []args){
        String J="aA";
        String S="aAAbbbb";
       
        System.out.println(solution1(J,S));
        System.out.println(solution2(J,S));
        System.out.println(solution3(J,S));
     }
}
