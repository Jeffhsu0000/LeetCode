/*557. Reverse Words in a String III
Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

Example 1:
Input: "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
Note: In the string, each word is separated by single space and there will not be any extra space in the string. 
*/
public class Reverse_Words_in_a_StringIII{
    //185ms
    public static String reverseword1(String s){
        int l = 0;
        int r = s.length()-1;
        char ch [] = s.toCharArray();
        while(l < r){
            char temp = ch[r];
            ch[r] = ch[l];
            ch[l] = temp;
            l++;
            r--;
        }
        return new String(ch)+new String(" ");
    }
    
    public static String solution1(String s) {
        String [] str = s.split(" ");
        String result = "";
        
        for(int i = 0 ; i < str.length; i++)
            result = result + reverseword1(str[i]);
        result = result.substring(0, result.length() - 1);
        return result;
    }
    
    //5ms form Leetcode submission detail
    public static void reverseword2(char [] ch, int l, int r){
        if(ch == null || ch.length == 0)
            return;
        while(l < r){
            char temp = ch[l];
            ch[l] = ch[r];
            ch[r] = temp;
            l++;
            r--;
        }
    }
    
    public static String solution2(String s){
        if(s == null || s.length() == 0)
            return s;
            
        char [] ch = s.toCharArray();
        int i = 0;
        while(i < ch.length){
            int index = s.indexOf(' ', i);
              if(index == -1){
                reverseword2(ch, i, ch.length - 1);
                break;
            }
            reverseword2(ch, i, index - 1);
            i = index + 1;
        }
        return new String(ch);
    }

    public static void main(String []args){
        String s = "Let's take Leetcode contest";
        System.out.println(solution1(s));
        System.out.println(solution2(s));
    }
}
