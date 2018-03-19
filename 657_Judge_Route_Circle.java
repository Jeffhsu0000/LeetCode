/* 657. Judge Route Circle
 Initially, there is a Robot at position (0, 0).
 Given a sequence of its moves, judge if this robot makes a circle,
 which means it moves back to the original place.

The move sequence is represented by a string.
And each move is represent by a character.
The valid robot moves are R (Right), L (Left), U (Up) and D (down).
The output should be true or false representing whether the robot makes a circle.

Example 1:
Input: "UD"
Output: true

Example 2:
Input: "LL"
Output: false
*/

public class Judge_Route_Circle_LeetCode{
   
    // Instinctive way 13ms
    public static boolean solution1(String moves){
        int x = 0, y = 0;
        for(char m:moves.toCharArray()){
            switch(m) {
                case 'U': y++; break;
                case 'D': y--; break;
                case 'R': x++; break;
                case 'L': x--; break;
            }
        }
       
        return (x==0) && (y==0);
    }
   

     public static void main(String []args){
        String moves="UU";
       
        System.out.println(solution1(moves));
     }
}
